package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimalesLP extends AppCompatActivity {

    MediaPlayer vGato;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_lp);

        vGato = MediaPlayer.create(this, R.raw.vgato);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, AnimalesP1.class);
        startActivity(prueba);
    }

    //Metodo para reproducir la pronunciacion
    public void Gato(View view){
        vGato.start();
    }
}