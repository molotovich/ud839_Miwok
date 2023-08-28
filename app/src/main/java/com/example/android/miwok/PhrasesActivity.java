package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer audioMediaPlayer; //se agrega dentro de la clase


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        ArrayList<Word> words= new ArrayList<Word>();
        words.add(new Word("Where are you Going?", "minto wuksus", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?", "tinna oyaasee'na", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...", "ayaaset...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling", "michekses?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I'm feeling good", "kuchi achit", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?", "eenes'aa", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes I'm coming", "hee'eenem", R.raw.phrase_yes_im_coming));
        words.add(new Word("I'm coming", "eenem", R.raw.phrase_im_coming));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                audioMediaPlayer = MediaPlayer.create(getApplicationContext(), words.get(position).getAudio());
                audioMediaPlayer.start();
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
    }
}