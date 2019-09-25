package com.vbadapts.simhortus;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class PlantActivity extends AppCompatActivity {

    LinearLayout textscan;
    Animation frombottom, bounce;

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    //Integer[] colors = null;
    //ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom1);
        bounce = AnimationUtils.loadAnimation(this, R.anim.fadeout);

        textscan = (LinearLayout) findViewById(R.id.textscan);

        //misc5.animate().translationY(-1850).setDuration(400).setStartDelay(1000);
        textscan.startAnimation(frombottom);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.basil, "Basil", "Basil is a herb. The parts of the plant that grow above the ground are used to make medicine. Basil is used for stomach spasms, loss of appetite, intestinal gas, kidney conditions, fluid retention, head colds, warts, and worm infections. It is also used to treat snake and insect bites."));
        models.add(new Model(R.drawable.cilantro, "Cilantro", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        models.add(new Model(R.drawable.mint, "Mint", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        //models.add(new Model(R.drawable.oregano, "Oregano", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));
        //models.add(new Model(R.drawable.thyme, "Thyme", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130, 0, 130, 0);

        /*Integer[] colors_temp = {
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white),
                getResources().getColor(R.color.white)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position < (adapter.getCount() - 1) && position < (colors.length - 1)){
                    viewPager.setBackgroundColor(
                            (Integer)argbEvaluator.evaluate(positionOffset, colors[position], colors[position + 1])
                    );
                }
                else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });*/

    }

    public void goToMenuActivity(View view) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    public void goToSettingActivity(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}
