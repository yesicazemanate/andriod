package com.yesicaz.miprimeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MenuAp extends AppCompatActivity {
    TextView txtMenu;
    Button btnAnimales;
    Button btnColores;
    Button btnFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_ap);
     txtMenu = findViewById(R.id.txtmenu);
     btnAnimales =findViewById(R.id.btnanimales);
     btnColores = findViewById(R.id.btncolores);
     btnFrutas = findViewById(R.id.btnfrutas);
     btnAnimales.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent goAnimal = new Intent(MenuAp.this, Animales.class);
             startActivity(goAnimal);
         }
     });
btnColores.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent goColor = new Intent(MenuAp.this, Colores.class);
          startActivity(goColor);
    }
});
btnFrutas.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent goFruta = new Intent(MenuAp.this, Frutas.class);
        startActivity(goFruta);
    }
});
    }
}