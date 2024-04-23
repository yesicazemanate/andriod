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

public class pregunta5 extends AppCompatActivity {
    TextView rosado;
    TextView azul;
    TextView lila;
    MediaPlayer ganador;
    MediaPlayer perdedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta5);
        rosado = findViewById(R.id.textrosado);
        azul = findViewById(R.id.textblue);
        lila = findViewById(R.id.textlilac);

        ganador = MediaPlayer.create(this, R.raw.winner);
        perdedor = MediaPlayer.create(this, R.raw.perdedor);
        rosado.setOnClickListener(v -> {
            ganador.start();
            Intent goPregunta2 = new Intent(pregunta5.this, MainActivity.class);
            startActivity(goPregunta2);
        });
        azul.setOnClickListener(v -> {
            perdedor.start();
        });
        lila.setOnClickListener(v -> {
            perdedor.start();
        });
    }
}