package com.nfach98.githubuser.app.setting

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.Settings
import androidx.preference.CheckBoxPreference
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import com.nfach98.githubuser.R
import java.util.*


class SettingPreferenceFragment : PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private lateinit var REMINDER: String
    private lateinit var LANG: String

    private lateinit var reminderPreference: CheckBoxPreference
    private lateinit var languagePreference: Preference

    override fun onCreatePreferences(bundle: Bundle?, s: String?) {
        addPreferencesFromResource(R.xml.preferences)
        init()
        setSummaries()
    }

    override fun onResume() {
        super.onResume()
        preferenceScreen.sharedPreferences.registerOnSharedPreferenceChangeListener(this)
    }

    override fun onPause() {
        super.onPause()
        preferenceScreen.sharedPreferences.unregisterOnSharedPreferenceChangeListener(this)
    }

    override fun onSharedPreferenceChanged(sharedPreferences: SharedPreferences, key: String?) {
        if (key == REMINDER) {
            reminderPreference.isChecked = sharedPreferences.getBoolean(REMINDER, false)
        }
        if (key == LANG) {
            languagePreference.summary = Locale.getDefault().displayLanguage
        }
    }

    private fun init() {
        REMINDER = resources.getString(R.string.key_reminder)
        LANG = resources.getString(R.string.key_lang)

        reminderPreference = findPreference<CheckBoxPreference>(REMINDER) as CheckBoxPreference
        languagePreference = findPreference<Preference>(LANG) as Preference

        languagePreference.setOnPreferenceClickListener {
            activity?.startActivity(Intent(Settings.ACTION_LOCALE_SETTINGS))
            true
        }
    }

    private fun setSummaries() {
        val sh = preferenceManager.sharedPreferences
        reminderPreference.isChecked = sh.getBoolean(REMINDER, false)
        languagePreference.summary = Locale.getDefault().displayLanguage
    }
}