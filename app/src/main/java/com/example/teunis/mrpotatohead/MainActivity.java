package com.example.teunis.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Memory management didn't work, so outcommented
        // ImageView.setVisibility() = savedInstanceState.getVisibility();
    }

    // do something if checkbox gets clicked
    public void checkClicked(View v) {

        // make sure view is checkbox
        CheckBox checkbox = (CheckBox) v;

        // get name of checkbox to know what checkbox
        String bodyPart = checkbox.getText().toString();

        // message if clicked
        Log.d("potato", "checkClicked: ");

        // if checkbox is for hat...
        if (bodyPart == "Hat") {

            // find adequate imageview for the checkbox
            ImageView image = (ImageView) findViewById(R.id.imageViewHat);

            // if its invisible and clicked: make visible
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }

            // else, make invisible
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }

        // same for other bodyparts
        else if (bodyPart == "Eyebrows") {
            ImageView image = (ImageView) findViewById(R.id.imageViewEyebrows);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Nose") {
            ImageView image = (ImageView) findViewById(R.id.imageViewNose);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Mustache") {
            ImageView image = (ImageView) findViewById(R.id.imageViewMustache);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Arms") {
            ImageView image = (ImageView) findViewById(R.id.imageViewArms);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Eyes") {
            ImageView image = (ImageView) findViewById(R.id.imageViewEyes);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Glasses") {
            ImageView image = (ImageView) findViewById(R.id.imageViewGlasses);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Mouth") {
            ImageView image = (ImageView) findViewById(R.id.imageViewMouth);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
        else if (bodyPart == "Ears") {
            ImageView image = (ImageView) findViewById(R.id.imageViewEars);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }

        // else, bodypart must be shoes
        else {
            ImageView image = (ImageView) findViewById(R.id.imageViewShoes);
            if (image.getVisibility() == View.INVISIBLE) {
                image.setVisibility(View.VISIBLE);
            }
            else {
                image.setVisibility(View.INVISIBLE);
            }
        }
    }

}
