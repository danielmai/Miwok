package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        // Create array of words
        Word[] words = new Word[10];
        words[0] = new Word("Where are you going?", "minto wuksus");
        words[1] = new Word("What is your name?", "tinnә oyaase'nә");
        words[2] = new Word("My name is...", "oyaaset...");
        words[3] = new Word("How are you feeling?", "michәksәs?");
        words[4] = new Word("I’m feeling good.", "kuchi achit");
        words[5] = new Word("Are you coming?", "әәnәs'aa?");
        words[6] = new Word("Yes, I’m coming.", "hәә’ әәnәm");
        words[7] = new Word("I’m coming.", "әәnәm");
        words[8] = new Word("Let’s go.", "yoowutis");
        words[9] = new Word("Come here.", "әnni'nem");

        // Create an {@link WordAdapter}, whose data source is an array of {@link Word}s. The
        // adapter knows how to create list items for each item in the array.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_phrases.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each item in the {@link Word} array.
        listView.setAdapter(adapter);
    }
}
