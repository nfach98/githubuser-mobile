// Generated by view binder compiler. Do not edit!
package com.nfach98.githubuserfavoritefavorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.nfach98.githubuserfavoritefavorite.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySplashBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView logo;

  @NonNull
  public final ImageView mark;

  @NonNull
  public final TextView tvFavorite;

  private ActivitySplashBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView logo,
      @NonNull ImageView mark, @NonNull TextView tvFavorite) {
    this.rootView = rootView;
    this.logo = logo;
    this.mark = mark;
    this.tvFavorite = tvFavorite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySplashBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_splash, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySplashBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logo;
      ImageView logo = rootView.findViewById(id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.mark;
      ImageView mark = rootView.findViewById(id);
      if (mark == null) {
        break missingId;
      }

      id = R.id.tv_favorite;
      TextView tvFavorite = rootView.findViewById(id);
      if (tvFavorite == null) {
        break missingId;
      }

      return new ActivitySplashBinding((ConstraintLayout) rootView, logo, mark, tvFavorite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
