package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Father", "epe"));
        words.add(new Word("Mother", "epa"));
        words.add(new Word("Son", "angsi"));
        words.add(new Word("Daughter", "tune"));
        words.add(new Word("Older Brother", "taachi"));
        words.add(new Word("Young Brother", "chalitti"));
        words.add(new Word("Older Sister", "tete"));
        words.add(new Word("Young Sister", "kolliti"));
        words.add(new Word("Grandmother", "ama"));
        words.add(new Word("Grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}