package com.nfach98.githubuser.app.setting

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.provider.Settings
import androidx.preference.Preference
import androidx.preference.PreferenceFragmentCompat
import androidx.preference.SwitchPreference
import com.nfach98.githubuser.AlarmReceiver
import com.nfach98.githubuser.R
import java.util.*


class SettingPreferenceFragment : PreferenceFragmentCompat(),
    SharedPreferences.OnSharedPreferenceChangeListener {

    private lateinit var REMINDER: String
    private lateinit var LANG: String

    private lateinit var reminderPreference: SwitchPreference
    private lateinit var languagePreference: Preference

    private lateinit var alarmReceiver: AlarmReceiver

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
            val isAlarmSet = sharedPreferences.getBoolean(REMINDER, false)

            reminderPreference.isChecked = isAlarmSet

            if(isAlarmSet){
                context?.let {
                    if(isAlarmSet) alarmReceiver.setAlarm(
                        it,
                        resources.getString(R.string.app_name),
                        "09:00",
                        resources.getString(R.string.reminder_message)
                    )
                    else alarmReceiver.cancelAlarm(it)
                }
            }
        }
        if (key == LANG) {
            languagePreference.summary = Locale.getDefault().displayLanguage
        }
    }

    private fun init() {
        REMINDER = resources.getString(R.string.key_reminder)
        LANG = resources.getString(R.string.key_lang)

        reminderPreference = findPreference<SwitchPreference>(REMINDER) as SwitchPreference
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

        alarmReceiver = AlarmReceiver()
    }
}