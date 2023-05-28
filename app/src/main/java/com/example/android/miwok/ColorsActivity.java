package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Where are you Going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinna oyaasee'na"));
        words.add(new Word("My name is...", "ayaaset..."));
        words.add(new Word("How are you feeling", "michekses?"));
        words.add(new Word("I'm feeling good", "kuchi achit"));
        words.add(new Word("Are you coming?", "eenes'aa"));
        words.add(new Word("Yes I'm coming", "hee'eenem"));
        words.add(new Word("I'm coming", "eenem"));

        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
    }
}