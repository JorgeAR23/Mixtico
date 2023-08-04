package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumerosLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_lp);

    }
    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, NumerosP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButton1:
                mediaPlayer = MediaPlayer.create(this, R.raw.vuno);
                break;
            case R.id.imageButton2:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdos);
                break;
            case R.id.imageButton3:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtres);
                break;
            case R.id.imageButton4:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuatro);
                break;
            case R.id.imageButton5:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcinco);
                break;
            case R.id.imageButton6:
                mediaPlayer = MediaPlayer.create(this, R.raw.vseis);
                break;
            case R.id.imageButton7:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsiete);
                break;
            case R.id.imageButton8:
                mediaPlayer = MediaPlayer.create(this, R.raw.vocho);
                break;
            case R.id.imageButton9:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnueve);
                break;
            case R.id.imageButton10:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdiez);
                break;
            case R.id.imageButton11:
                mediaPlayer = MediaPlayer.create(this, R.raw.vonce);
                break;
            case R.id.imageButton12:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdoce);
                break;
            case R.id.imageButton13:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtrece);
                break;
            case R.id.imageButton14:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcatorce);
                break;
            case R.id.imageButton15:
                mediaPlayer = MediaPlayer.create(this, R.raw.vquince);
                break;
            case R.id.imageButton16:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdieciseis);
                break;
            case R.id.imageButton17:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdiecisiete);
                break;
            case R.id.imageButton18:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdieciocho);
                break;
            case R.id.imageButton19:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdiecinueve);
                break;
            case R.id.imageButton20:
                mediaPlayer = MediaPlayer.create(this, R.raw.vveinte);
                break;
            case R.id.imageButton30:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtreinta);
                break;
            case R.id.imageButton40:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuarenta);
                break;
            case R.id.imageButton50:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcincuenta);
                break;
            case R.id.imageButton60:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsesenta);
                break;
            case R.id.imageButton70:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsetenta);
                break;
            case R.id.imageButton80:
                mediaPlayer = MediaPlayer.create(this, R.raw.vochenta);
                break;
            case R.id.imageButton90:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnoventa);
                break;
            case R.id.imageButton100:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcien);
                break;
            case R.id.imageButton200:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdoscientos);
                break;
            case R.id.imageButton1000:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmil);
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