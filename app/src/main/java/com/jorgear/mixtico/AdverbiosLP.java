package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AdverbiosLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adverbios_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, AdverbiosP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbajo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabajo);
                break;
            case R.id.imageButtonAdentro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vadentro);
                break;
            case R.id.imageButtonAfuera:
                mediaPlayer = MediaPlayer.create(this, R.raw.vafuera);
                break;
            case R.id.imageButtonAhora:
                mediaPlayer = MediaPlayer.create(this, R.raw.vahora);
                break;
            case R.id.imageButtonAnoche:
                mediaPlayer = MediaPlayer.create(this, R.raw.vanoche);
                break;
            case R.id.imageButtonAntes:
                mediaPlayer = MediaPlayer.create(this, R.raw.vantes);
                break;
            case R.id.imageButtonAntier:
                mediaPlayer = MediaPlayer.create(this, R.raw.vantier);
                break;
            case R.id.imageButtonAqui:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaqui);
                break;
            case R.id.imageButtonArriba:
                mediaPlayer = MediaPlayer.create(this, R.raw.varriba);
                break;
            case R.id.imageButtonAyer:
                mediaPlayer = MediaPlayer.create(this, R.raw.vayer);
                break;
            case R.id.imageButtonBien:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbien);
                break;
            case R.id.imageButtonCasi:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcasi);
                break;
            case R.id.imageButtonCerca:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcerca);
                break;
            case R.id.imageButtonCual:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcual);
                break;
            case R.id.imageButtonCuando:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuando);
                break;
            case R.id.imageButtonCuanto:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuanto);
                break;
            case R.id.imageButtonDespues:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdespues);
                break;
            case R.id.imageButtonDonde:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdonde);
                break;
            case R.id.imageButtonEncima:
                mediaPlayer = MediaPlayer.create(this, R.raw.vencima);
                break;
            case R.id.imageButtonHoy:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhoy);
                break;
            case R.id.imageButtonManana:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmanana);
                break;
            case R.id.imageButtonMas:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmas);
                break;
            case R.id.imageButtonMejor:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmejor);
                break;
            case R.id.imageButtonMenos:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmenos);
                break;
            case R.id.imageButtonNo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vno);
                break;
            case R.id.imageButtonPronto:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpronto);
                break;
            case R.id.imageButtonQuien:
                mediaPlayer = MediaPlayer.create(this, R.raw.vquien);
                break;
            case R.id.imageButtonQuizas:
                mediaPlayer = MediaPlayer.create(this, R.raw.vquizas);
                break;
            case R.id.imageButtonSi:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsi);
                break;
            case R.id.imageButtonSiempre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsiempre);
                break;
            case R.id.imageButtonTarde:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtarde);
                break;
            case R.id.imageButtonTemprano:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtemprano);
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