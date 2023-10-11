package com.example.lab5preferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class ShowSettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_setting);
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        String strPrefs =
                sharedPreferences.getBoolean("perform_updates",false) + "\n" +
                sharedPreferences.getString("update_interval","-1") + "\n" +
                sharedPreferences.getString("welcome_message","NULL");

        TextView settingsTextView = (TextView)findViewById(R.id.setting_text_view);
        settingsTextView.setText(strPrefs);
    }
}