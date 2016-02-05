package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create array of phrases
        ArrayList<String> phrases = new ArrayList<String>();
        phrases.add("Where are you going?");
        phrases.add("What is your name?");
        phrases.add("My name is...");
        phrases.add("How are you feeling?");
        phrases.add("I’m feeling good.");
        phrases.add("Are you coming?");
        phrases.add("Yes, I’m coming.");
        phrases.add("I’m coming.");
        phrases.add("Let’s go.");
        phrases.add("Come here.");

        // Using a "while loop", print out each element of the array to the log output
        int index = 0;
        while (index < phrases.size()) {
            // Print a log message
            Log.v("PhrasesActivity", "Phrase at position " + index + ": " + phrases.get(index));
            // Increase the index by 1 to go to the next position
            index++;
        }

        // Using a "for loop", print out each element of the array to the log output
        for (int i = 0; i < phrases.size(); i++) {
            // Print a log message
            Log.v("PhrasesActivity", "Phrase at position " + i + ": " + phrases.get(i));
        }
    }
}