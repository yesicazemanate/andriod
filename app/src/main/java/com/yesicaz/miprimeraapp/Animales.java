package com.yesicaz.miprimeraapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Animales extends AppCompatActivity {
        MediaPlayer sonidoGato;
        MediaPlayer sonidoPerro;
        MediaPlayer sonidoPato;
        ImageView playPerro;
        ImageView playPato;
        ImageView playGato;
        TextView textGato;
        TextView textPerro;
        TextView textPato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales);
        playGato = findViewById(R.id.imagegato);
        textGato = findViewById(R.id.textGato);
        sonidoGato = MediaPlayer.create(this,R.raw.sonidogato);
        playPerro = findViewById(R.id.imageperro);
        textPerro = findViewById(R.id.textperro);
        sonidoPerro = MediaPlayer.create(this,R.raw.sonidoperro );
        playPato = findViewById(R.id.imagepato);
        textPato = findViewById(R.id.textpato);
        sonidoPato= MediaPlayer.create(this, R.raw.sonidopato);
        playGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoGato.start();
                textGato.setText("cat");
            }
        });
        playPerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              sonidoPerro.start();
              textPerro.setText("dog");
            }
        });
        playPato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonidoPato.start();
                textPato.setText("duck");
            }
        });

    }
}