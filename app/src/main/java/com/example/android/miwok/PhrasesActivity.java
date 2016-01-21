package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

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

        // Using a "while loop", print out each element of the array to the log output
        int index = 0;
        while (index < phrases.length) {
            // Print a log message
            Log.v("PhrasesActivity", "Phrase at position " + index + ": " + phrases[index]);
            // Increase the index by 1 to go to the next position
            index++;
        }

        // Using a "for loop", print out each element of the array to the log output
        for (int i = 0; i < phrases.length; i++) {
            // Print a log message
            Log.v("PhrasesActivity", "Phrase at position " + i + ": " + phrases[i]);
        }
    }
}
