package com.yesicaz.miprimeraapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Frutas extends AppCompatActivity {
MediaPlayer sonidoFresa;
MediaPlayer sonidoUva;
MediaPlayer sonidoMango;
ImageView imageFresa;
ImageView imageUva;
ImageView imageMango;
    TextView textFresa;
    TextView textUva;
    TextView textMango;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frutas);
imageFresa = findViewById(R.id.imagefresa);
textFresa = findViewById(R.id.textfresa);
sonidoFresa = MediaPlayer.create(this, R.raw.sonidofresa);
imageUva = findViewById(R.id.imageuva);
textUva= findViewById(R.id.textuva);
sonidoUva= MediaPlayer.create(this, R.raw.sonidouva);
imageMango = findViewById(R.id.imagemango);
textMango = findViewById(R.id.textmango);
sonidoMango= MediaPlayer.create(this, R.raw.sonidomango);
imageFresa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoFresa.start();
        textFresa.setText("strawberry");
    }
});
imageUva.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoUva.start();
        textUva.setText("grape");
    }
});
imageMango.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoMango.start();
        textMango.setText("mango");
    }
});

    }
}