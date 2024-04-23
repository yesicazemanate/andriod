package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pregunta1 extends AppCompatActivity {
ImageView imagenFresa;
    ImageView imagenUva;
    ImageView imagenMango;
MediaPlayer ganador;
MediaPlayer perdedor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);
        imagenFresa= findViewById(R.id.imagenStrawberry);
        imagenMango = findViewById(R.id.imagenMango);
        imagenUva = findViewById(R.id.imagenGrape);
        ganador = MediaPlayer.create(this, R.raw.winner);
        perdedor = MediaPlayer.create(this, R.raw.perdedor);
imagenFresa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        ganador.start();
        Intent goPregunta2 = new Intent(pregunta1.this, pregunta2.class);
        startActivity(goPregunta2);
    }
});
imagenMango.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
       perdedor.start();
    }
});
imagenUva.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        perdedor.start();
    }
});
    }
}