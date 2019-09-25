package com.vbadapts.simhortus;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class SignUpActivity extends AppCompatActivity {

    //private static final int MY_REQUEST_CODE = 7117;
    LinearLayout textscan;
    Animation frombottom, bounce;

    //signup

    /*List<AuthUI.IdpConfig> providers;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom1);
        bounce = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        textscan = (LinearLayout) findViewById(R.id.textscan);

        //misc5.animate().translationY(-1850).setDuration(400).setStartDelay(1000);
        textscan.startAnimation(frombottom);

        //signup
        /*providers = Arrays.asList(
                new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.GoogleBuilder().build()
        );

        showSignInOptions();*/
    }

    public void goToMenupActivity(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        overridePendingTransition(0, R.anim.fadeout);
    }

    public void signUpOptions(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
        overridePendingTransition(0, R.anim.fadeout);
    }

    /*private void showSignInOptions() {
        startActivityForResult(
                AuthUI.getInstance().createSignInIntentBuilder().setAvailableProviders(providers).setTheme(R.style.MyTheme).build(),MY_REQUEST_CODE
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == MY_REQUEST_CODE){
            IdpResponse response = IdpResponse.fromResultIntent(data);
            if(resultCode == RESULT_OK){
                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                Toast.makeText(this, ""+user.getEmail(), Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void signUpOptions(View view) {
        //showSignInOptions();
    }*/
}
