package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pregunta2 extends AppCompatActivity {
    TextView strawberry;
    TextView grape;
    TextView mango;
    MediaPlayer ganador;
    MediaPlayer perdedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta2);
        strawberry = findViewById(R.id.textstrawberry);
        grape = findViewById(R.id.grape);
        mango = findViewById(R.id.textmangoes);

        ganador = MediaPlayer.create(this, R.raw.winner);
        perdedor = MediaPlayer.create(this, R.raw.perdedor);
        strawberry.setOnClickListener(v -> {
       perdedor.start();
        });
        grape.setOnClickListener(v -> {
            ganador.start();
            Intent goPregunta2 = new Intent(pregunta2.this, pregunta3.class);
            startActivity(goPregunta2);

        });
        mango.setOnClickListener(v -> {
            perdedor.start();
        });
    }
}