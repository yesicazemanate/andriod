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

public class Colores extends AppCompatActivity {
    MediaPlayer sonidoLila;
    MediaPlayer sonidoAzul;
    MediaPlayer sonidoRosa;
    ImageView imageLila;
    ImageView imageazul;
    ImageView imagerosa;
    TextView textLila;
    TextView textAzul;
    TextView textRosa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores);
        imageLila=findViewById(R.id.imagelila);
        textLila=findViewById(R.id.textlila);
        sonidoLila= MediaPlayer.create(this, R.raw.sonidolila);
        imageazul=findViewById(R.id.imageazul);
        textAzul = findViewById(R.id.textazul);
        sonidoAzul = MediaPlayer.create(this, R.raw.sonidoazul);
        imagerosa=findViewById(R.id.imagerosa);
        textRosa = findViewById(R.id.textrosa);
        sonidoRosa = MediaPlayer.create(this, R.raw.sonidopink);
imageLila.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoLila.start();
        textLila.setText("lilac");
    }
});
imageazul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoAzul.start();
        textAzul.setText("blue");
    }
});
imagerosa.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        sonidoRosa.start();
        textRosa.setText("pink");
    }
});
    }
}