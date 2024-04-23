package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pregunta4 extends AppCompatActivity {
    ImageView imagendog;
    ImageView imagenduck;
    ImageView imagencat;
    MediaPlayer ganador;
    MediaPlayer perdedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta4);

        imagencat= findViewById(R.id.imagenCat);
        imagendog = findViewById(R.id.imagenDog);
        imagenduck = findViewById(R.id.imagenDuck);
        ganador = MediaPlayer.create(this, R.raw.winner);
        perdedor = MediaPlayer.create(this, R.raw.perdedor);
        imagencat.setOnClickListener(v -> {
            perdedor.start();
        });
        imagenduck.setOnClickListener(v -> {
            perdedor.start();
        });
        imagendog.setOnClickListener(v -> {
            ganador.start();
            Intent goPregunta2 = new Intent(pregunta4.this, pregunta5.class);
            startActivity(goPregunta2);
        });
    }
}