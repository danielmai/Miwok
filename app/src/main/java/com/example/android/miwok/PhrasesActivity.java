package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create array of phrases
        String[] phrases = new String[10];
        phrases[0] = "Where are you going?";
        phrases[1] = "What is your name?";
        phrases[2] = "My name is...";
        phrases[3] = "How are you feeling?";
        phrases[4] = "I’m feeling good.";
        phrases[5] = "Are you coming?";
        phrases[6] = "Yes, I’m coming.";
        phrases[7] = "I’m coming.";
        phrases[8] = "Let’s go.";
        phrases[9] = "Come here.";
    }
}
