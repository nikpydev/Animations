package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean bartIsShowing = true;

    public void fade(View view) {

        Log.i("Info", "ImageView Tapped");

        ImageView supesImageView = (ImageView) findViewById(R.id.supesImageView);
        ImageView clarkImageView = (ImageView) findViewById(R.id.clarkImageView);

        if (bartIsShowing) {
            bartIsShowing = false;
//            clarkImageView.animate().setDuration(2000);
//            supesImageView.animate().setDuration(2000);
            supesImageView.animate().translationYBy(2000).setDuration(2000);
            clarkImageView.animate().translationYBy(2000).setDuration(2000);
        } else {
            bartIsShowing = true;
//            clarkImageView.animate().alpha(1).setDuration(2000);
//            supesImageView.animate().alpha(0).setDuration(2000);
            supesImageView.animate().translationYBy(-2000).setDuration(2000);
            clarkImageView.animate().translationYBy(-2000).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView clarkImageView = (ImageView) findViewById(R.id.clarkImageView);
        ImageView supesImageView = (ImageView) findViewById(R.id.supesImageView);
        supesImageView.setY(-2000);
//        ImageView clarkImageView = (ImageView) findViewById(R.id.clarkImageView);
//        clarkImageView.setX(-1000);
//        clarkImageView.animate().translationXBy(1000).alpha(1).setDuration(2000).rotation(3600);

    }
}
