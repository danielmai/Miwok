package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        // Create an {@link ArrayAdapter}, whose data source is an array of Strings. The
        // adapter knows how to create list items for each item in the array, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single phrase.
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_phrases.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ArrayAdapter} we created above, so that the
        // {@link ListView} will display list items for each phrase from the phrases array.
        // Do this by calling the setAdapter method on the {@link ListView} object and pass in
        // 1 argument, which is the {@link ArrayAdapter} with the variable name itemsAdapter.
        listView.setAdapter(itemsAdapter);
    }
}
