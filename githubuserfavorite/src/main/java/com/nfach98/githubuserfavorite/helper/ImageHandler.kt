package com.nfach98.githubuserfavorite.helper

import android.content.ContentResolver
import android.content.ContentValues
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageView
import coil.Coil
import coil.request.ImageRequest
import java.io.File
import java.io.FileOutputStream
import java.io.OutputStream

class ImageHandler {

    companion object{
        fun saveToStorage(bitmap: Bitmap, name: String, contentResolver: ContentResolver) {
            val filename = "$name.jpg"
            var fos: OutputStream?

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                contentResolver.also { resolver ->
                    val contentValues = ContentValues().apply {
                        put(MediaStore.MediaColumns.DISPLAY_NAME, filename)
                        put(MediaStore.MediaColumns.MIME_TYPE, "image/jpg")
                        put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DCIM)
                    }
                    val imageUri: Uri? =
                        resolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues)
                    fos = imageUri?.let { resolver.openOutputStream(it) }
                }
            } else {
                val imagesDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)
                val image = File(imagesDir, filename)
                fos = FileOutputStream(image)
            }

            fos?.use {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, it)
            }
        }

        suspend fun getBitmapFromUrl(context: Context, bitmapURL: String) : Bitmap? {
            var bitmap: Bitmap? = null

            val imageLoader = Coil.imageLoader(context)
            val request = ImageRequest.Builder(context)
                .data(bitmapURL)
                .build()
            try {
                bitmap = (imageLoader.execute(request).drawable as BitmapDrawable).bitmap
            } catch (e: Exception) {
                Log.e("Error: ", e.toString())
            }

            return bitmap
        }

        fun loadImage(path: String, imageView: ImageView, contentResolver: ContentResolver){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                val selection = MediaStore.Files.FileColumns.RELATIVE_PATH + " like ? AND " + MediaStore.MediaColumns.DISPLAY_NAME + " like ?"

                val selectionargs = arrayOf(
                    "%${Environment.DIRECTORY_DCIM}%",
                    path
                )

                val externalUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI
                val projection = arrayOf(
                    MediaStore.Files.FileColumns._ID,
                    MediaStore.Images.Media.DATE_TAKEN,
                    MediaStore.MediaColumns.TITLE,
                    MediaStore.Images.Media.MIME_TYPE,
                    MediaStore.MediaColumns.RELATIVE_PATH
                )
                val cursor = contentResolver.query(externalUri, projection, selection, selectionargs, MediaStore.Images.Media.DATE_TAKEN)
                val idColumn = cursor?.getColumnIndex(MediaStore.MediaColumns._ID)

                while (cursor?.moveToNext() == true) {
                    val photoUri = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,cursor.getString(idColumn!!))
                    if (photoUri != null) {
                        var fileName:String ? = null
                        if (photoUri.toString().startsWith("file:")) {
                            fileName = photoUri.path
                        } else {
                            val c = contentResolver.query(photoUri, null, null, null, null)
                            if (c != null && c.moveToFirst()) {
                                val id = c.getColumnIndex(MediaStore.Images.Media.DATA)
                                if (id != -1) {
                                    fileName = c.getString(id)
                                }
                            }
                        }
                    }
                    val stream = contentResolver.openInputStream(photoUri)
                    val bitmap = BitmapFactory.decodeStream(stream)
                    imageView.setImageBitmap(bitmap)
                }
            }
            else {
                val bitmap = BitmapFactory.decodeFile("${Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)}/$path")
                imageView.setImageBitmap(bitmap)
            }
        }
    }
}