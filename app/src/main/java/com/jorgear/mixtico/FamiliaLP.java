package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FamiliaLP extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_lp);

    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, FamiliaP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbuela:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabuela);
                break;
            case R.id.imageButtonAbuelo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabuelo);
                break;
            case R.id.imageButtonBebe:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbebe);
                break;
            case R.id.imageButtonBisabuelo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbisabuelo);
                break;
            case R.id.imageButtonCompadre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcompadre);
                break;
            case R.id.imageButtonCuñada:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcunada);
                break;
            case R.id.imageButtonCuñado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcunado);
                break;
            case R.id.imageButtonEsposa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vesposa);
                break;
            case R.id.imageButtonEsposo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vesposo);
                break;
            case R.id.imageButtonHermanaH:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhermanah);
                break;
            case R.id.imageButtonHermanaM:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhermanam);
                break;
            case R.id.imageButtonHermanoH:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhermanoh);
                break;
            case R.id.imageButtonHermanoM:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhermanom);
                break;
            case R.id.imageButtonHijo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhijo);
                break;
            case R.id.imageButtonMama:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmama);
                break;
            case R.id.imageButtonNieto:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnieto);
                break;
            case R.id.imageButtonPadrastro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpadrastro);
                break;
            case R.id.imageButtonPadrino:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpadrino);
                break;
            case R.id.imageButtonPapa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpapa);
                break;
            case R.id.imageButtonPariente:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpariente);
                break;
            case R.id.imageButtonPrimaH:
                mediaPlayer = MediaPlayer.create(this, R.raw.vprimah);
                break;
            case R.id.imageButtonPrimaM:
                mediaPlayer = MediaPlayer.create(this, R.raw.vprimam);
                break;
            case R.id.imageButtonPrimoH:
                mediaPlayer = MediaPlayer.create(this, R.raw.vprimoh);
                break;
            case R.id.imageButtonPrimoM:
                mediaPlayer = MediaPlayer.create(this, R.raw.vprimom);
                break;
            case R.id.imageButtonSobrina:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsobrina);
                break;
            case R.id.imageButtonSobrino:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsobrino);
                break;
            case R.id.imageButtonTia:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtia);
                break;
            case R.id.imageButtonTio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtio);
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