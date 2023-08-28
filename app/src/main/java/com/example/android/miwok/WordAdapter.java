package com.example.android.miwok;

import android.app.Activity;
import android.media.AudioTrack;
import android.provider.MediaStore;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int colorFondo;

    public WordAdapter(Activity context, ArrayList<Word>androidWords, int colorFondo){
        super(context,0,androidWords);
        this.colorFondo=colorFondo;
    }
    @NonNull
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View listItemView = convertView;
        Word currentWord = getItem(position);
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(
                    R.layout.listitem,parent,false);
        }

        TextView texto1 = (TextView) listItemView.findViewById(R.id.miwok);
        texto1.setText(currentWord.getMiwok());

        TextView texto2 = (TextView) listItemView.findViewById(R.id.english);
        texto2.setText(currentWord.getEnglish());

        ImageView imagen = (ImageView) listItemView.findViewById(R.id.icon);
        imagen.setImageResource(currentWord.getImagen());

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.fondo);
        textContainer.setBackgroundResource(colorFondo);

        return listItemView;
    }

}
