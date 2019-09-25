package com.vbadapts.simhortus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

    ImageView misc5, misc1, misc2, misc3, misc4, accounticon;
    LinearLayout textsplash, textlogin, textmenu;
    Animation frombottom, bounce;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        bounce = AnimationUtils.loadAnimation(this, R.anim.rotate);

        misc5 = (ImageView) findViewById(R.id.misc5);
        misc1 = (ImageView) findViewById(R.id.misc1);
        misc2 = (ImageView) findViewById(R.id.misc2);
        misc3 = (ImageView) findViewById(R.id.misc3);
        misc4 = (ImageView) findViewById(R.id.misc4);
        accounticon = (ImageView) findViewById(R.id.accounticon);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        textlogin = (LinearLayout) findViewById(R.id.textlogin);
        textmenu = (LinearLayout) findViewById(R.id.logged);


        //misc5.animate().translationY(-1650).setDuration(400).setStartDelay(3000);
        misc5.animate().translationY(-1850).setDuration(400).setStartDelay(3000);
        //misc5.animate().translationY(-950).setDuration(400).setStartDelay(3000);
        misc1.animate().alpha(0).setDuration(400).setStartDelay(3000);
        misc2.animate().translationY(5).alpha(0).setDuration(400).setStartDelay(3000);
        misc3.animate().translationY(5).alpha(0).setDuration(400).setStartDelay(3000);
        misc4.animate().translationY(5).alpha(0).setDuration(400).setStartDelay(3000);
        textsplash.animate().translationY(140).alpha(0).setDuration(400).setStartDelay(3000);
        misc2.startAnimation(bounce);
        textlogin.startAnimation(frombottom);
        textmenu.startAnimation(frombottom);

    }

    public void goToScanActivity(View view) {
        Intent intent = new Intent(this, ScanActivity.class);
        startActivity(intent);
    }

    public void goToMenupActivity(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        ActivityCompat.finishAffinity(this);
        System.exit(0);

    }
}
