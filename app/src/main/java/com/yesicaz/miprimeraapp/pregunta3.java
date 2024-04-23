package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pregunta3 extends AppCompatActivity {
     TextView dog;
    TextView duck;
    TextView cat;
    MediaPlayer ganador;
    MediaPlayer perdedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pregunta3);
        dog = findViewById(R.id.textdog);
        duck = findViewById(R.id.textduck);
        cat = findViewById(R.id.textcat);

        ganador = MediaPlayer.create(this, R.raw.winner);
        perdedor = MediaPlayer.create(this, R.raw.perdedor);
        dog.setOnClickListener(v -> {
            perdedor.start();
        });
        duck.setOnClickListener(v -> {
            ganador.start();
            Intent goPregunta2 = new Intent(pregunta3.this, pregunta4.class);
            startActivity(goPregunta2);

        });
        cat.setOnClickListener(v -> {
            perdedor.start();
        });
    }
}