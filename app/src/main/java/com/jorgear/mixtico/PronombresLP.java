package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class PronombresLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_lp);
    }

    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, PronombresP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonYo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vyo);
                break;
            case R.id.imageButtonTu:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtu);
                break;
            case R.id.imageButtonEl:
                mediaPlayer = MediaPlayer.create(this, R.raw.vel);
                break;
            case R.id.imageButtonElla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vella);
                break;
            case R.id.imageButtonNosotros:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnosotros);
                break;
            case R.id.imageButtonUstedes:
                mediaPlayer = MediaPlayer.create(this, R.raw.vustedes);
                break;
            case R.id.imageButtonEllos:
                mediaPlayer = MediaPlayer.create(this, R.raw.vellos);
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