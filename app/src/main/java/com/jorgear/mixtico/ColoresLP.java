package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ColoresLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, ColoresP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAnaranjado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vanaranjado);
                break;
            case R.id.imageButtonAmarillo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vamarillo);
                break;
            case R.id.imageButtonAzul:
                mediaPlayer = MediaPlayer.create(this, R.raw.vazul);
                break;
            case R.id.imageButtonBlanco:
                mediaPlayer = MediaPlayer.create(this, R.raw.vblanco);
                break;
            case R.id.imageButtonCafe:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcafe);
                break;
            case R.id.imageButtonGris:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgris);
                break;
            case R.id.imageButtonNegro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnegro);
                break;
            case R.id.imageButtonMorado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmorado);
                break;
            case R.id.imageButtonRojo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vrojo);
                break;
            case R.id.imageButtonRosa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vrosa);
                break;
            case R.id.imageButtonVerde:
                mediaPlayer = MediaPlayer.create(this, R.raw.vverde);
                break;
        }
        // Reproduce el sonido si se ha cargado correctamente
        if (mediaPlayer != null) {
            // Libera los recursos del MediaPlayer
            mediaPlayer.setOnCompletionListener(MediaPlayer::release);
            mediaPlayer.start();
        }
    }
}