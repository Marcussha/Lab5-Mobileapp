package com.example.lab5preferences;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    public static class QuickPrefsFragment extends PreferenceFragmentCompat{
        @Override
        public void onCreatePreferences(Bundle saveInstanceState, String rootKey){
            setPreferencesFromResource(R.xml.preferences, rootKey);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QuickPrefsFragment q = new QuickPrefsFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.pref_content, q).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if(item.getItemId() == R.id.action_settings){
            Intent i = new Intent(this, ShowSettingActivity.class);
            startActivity(i);
        }
        return true;
    }
}