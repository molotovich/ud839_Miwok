package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);

        ArrayList<Word> words= new ArrayList<>();
        words.add(new Word("Red", "wetetti", R.drawable.color_red, R.raw.color_red));
        words.add(new Word("Green", "chokokki", R.drawable.color_green, R.raw.color_green));
        words.add(new Word("Brown", "takaakki", R.drawable.color_brown, R.raw.color_brown));
        words.add(new Word("Gray", "topoppi", R.drawable.color_gray, R.raw.color_gray));
        words.add(new Word("Black", "kululli", R.drawable.color_black, R.raw.color_black));
        words.add(new Word("White", "kelelli", R.drawable.color_white, R.raw.color_white));
        words.add(new Word("Dusty yellow", "topiise", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        words.add(new Word("Mustard yellow", "chiwiite", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this,words,R.color.category_colors);
        ListView listview = findViewById(R.id.list);
        listview.setAdapter(itemsAdapter);
        listview.setOnItemClickListener((parent, view, position, id) -> {
            MediaPlayer audioMediaPlayer = MediaPlayer.create(getApplicationContext(), words.get(position).getAudio());
            audioMediaPlayer.start();
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}