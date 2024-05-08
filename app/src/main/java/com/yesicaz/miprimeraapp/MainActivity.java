package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
 TextView txtInicio;
 ImageView imgInicial;
 Button btnSiguiente;
 AlphaAnimation testAnimation;
TranslateAnimation trasAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txtInicio = findViewById(R.id.txtTitulo1);
        imgInicial = findViewById(R.id.imgPrincipal);
        btnSiguiente = findViewById(R.id.btnSiguiente);
     testAnimation = new AlphaAnimation(0,1);
     testAnimation.setDuration(3000);
     testAnimation.setFillAfter(true);
     txtInicio.startAnimation(testAnimation);
//traslate animation
        trasAnimation = new TranslateAnimation(0, 0, 0, 200);
        trasAnimation.setDuration(1000);
        trasAnimation.setFillAfter(true);
        imgInicial.startAnimation(trasAnimation);
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goNext=new Intent(MainActivity.this, MenuAp.class);
                startActivity(goNext);
            }
        });

    }
}