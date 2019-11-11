package id.ac.polinema.settingsexample.fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.preference.PreferenceFragmentCompat;

import id.ac.polinema.settingsexample.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void setPreferencesFromResource(int preferencesResId, @Nullable String rootKey) {
        super.setPreferencesFromResource(R.xml.preferences, rootKey);
    }

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {

    }
}
