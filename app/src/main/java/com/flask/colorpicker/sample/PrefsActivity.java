package com.flask.colorpicker.sample;

import android.os.Bundle;
import android.preference.PreferenceActivity;

import com.flash.colorpicker.R;

public class PrefsActivity extends PreferenceActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		addPreferencesFromResource(R.xml.prefs);
	}
}