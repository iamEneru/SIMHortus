package com.vbadapts.simhortus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    LinearLayout textscan;
    Animation frombottom, bounce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom1);
        bounce = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        textscan = (LinearLayout) findViewById(R.id.textscan);

        //misc5.animate().translationY(-1850).setDuration(400).setStartDelay(1000);
        textscan.startAnimation(frombottom);
    }

    public void goToPlantActivity(View view) {
        Intent intent = new Intent(this, PlantActivity.class);
        startActivity(intent);
    }

    public void goToSoilMoistureActivity(View view) {
        Intent intent = new Intent(this, SoilMoistureActivity.class);
        startActivity(intent);
    }

    public void goToLightActivity(View view) {
        Intent intent = new Intent(this, LightActivity.class);
        startActivity(intent);
    }

    public void goToTemperatureActivity(View view) {
        Intent intent = new Intent(this, TemperatureActivity.class);
        startActivity(intent);
    }

    public void goToLifeCycleActivity(View view) {
        Intent intent = new Intent(this, LifeCycleActivity.class);
        startActivity(intent);
    }

    public void goToSettingActivity(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}
