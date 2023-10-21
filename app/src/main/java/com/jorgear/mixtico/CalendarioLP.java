package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class CalendarioLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, CalendarioP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonLunes:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlunes);
                break;
            case R.id.imageButtonMartes:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmartes);
                break;
            case R.id.imageButtonMiercoles:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmiercoles);
                break;
            case R.id.imageButtonJueves:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjueves);
                break;
            case R.id.imageButtonViernes:
                mediaPlayer = MediaPlayer.create(this, R.raw.vviernes);
                break;
            case R.id.imageButtonSabado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsabado);
                break;
            case R.id.imageButtonDomingo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdomingo);
                break;
            case R.id.imageButtonEnero:
                mediaPlayer = MediaPlayer.create(this, R.raw.venero);
                break;
            case R.id.imageButtonFebrero:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfebrero);
                break;
            case R.id.imageButtonMarzo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmarzo);
                break;
            case R.id.imageButtonAbril:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabril);
                break;
            case R.id.imageButtonMayo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmayo);
                break;
            case R.id.imageButtonJunio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjunio);
                break;
            case R.id.imageButtonJulio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjulio);
                break;
            case R.id.imageButtonAgosto:
                mediaPlayer = MediaPlayer.create(this, R.raw.vagosto);
                break;
            case R.id.imageButtonSeptiembre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vseptiembre);
                break;
            case R.id.imageButtonOctubre:
                mediaPlayer = MediaPlayer.create(this, R.raw.voctubre);
                break;
            case R.id.imageButtonNoviembre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnoviembre);
                break;
            case R.id.imageButtonDiciembre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdiciembre);
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