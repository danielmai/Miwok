package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the phrases category
        View phrases = findViewById(R.id.phrases);

        // Set a click listener on that View
        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                // Pop up a toast message
                Toast.makeText(MainActivity.this,
                        "Open the list of phrases", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows the colors category
        View colors = findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                // Pop up a toast message
                Toast.makeText(MainActivity.this,
                        "Open the list of colors", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows the numbers category
        View numbers = findViewById(R.id.numbers);

        // Set a click listener on that View
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // Pop up a toast message
                Toast.makeText(MainActivity.this,
                        "Open the list of numbers", Toast.LENGTH_SHORT).show();
            }
        });

        // Find the View that shows the numbers category
        View family = findViewById(R.id.family);

        // Set a click listener on that View
        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family members View is clicked on.
            @Override
            public void onClick(View view) {
                // Pop up a toast message
                Toast.makeText(MainActivity.this,
                        "Open the list of family members", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
