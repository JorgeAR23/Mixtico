package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimoLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animo_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, AnimoP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAburrirse:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaburrirse);
                break;
            case R.id.imageButtonAmado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vamado);
                break;
            case R.id.imageButtonAmar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vamar);
                break;
            case R.id.imageButtonAnsioso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vansioso);
                break;
            case R.id.imageButtonAsqueado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vasqueado);
                break;
            case R.id.imageButtonCauteloso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcauteloso);
                break;
            case R.id.imageButtonCompasion:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcompasion);
                break;
            case R.id.imageButtonConfundido:
                mediaPlayer = MediaPlayer.create(this, R.raw.vconfundido);
                break;
            case R.id.imageButtonContento:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcontento);
                break;
            case R.id.imageButtonDebil:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdebil);
                break;
            case R.id.imageButtonEnfadarse:
                mediaPlayer = MediaPlayer.create(this, R.raw.venfadarse);
                break;
            case R.id.imageButtonFuerte:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfuerte);
                break;
            case R.id.imageButtonGoloso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgoloso);
                break;
            case R.id.imageButtonGrosero:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgrosero);
                break;
            case R.id.imageButtonLoco:
                mediaPlayer = MediaPlayer.create(this, R.raw.vloco);
                break;
            case R.id.imageButtonMalvado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmalvado);
                break;
            case R.id.imageButtonMiedoso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmiedoso);
                break;
            case R.id.imageButtonOdiar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vodiar);
                break;
            case R.id.imageButtonOrgulloso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vorgulloso);
                break;
            case R.id.imageButtonPerezoso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vperezoso);
                break;
            case R.id.imageButtonPreocuparse:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpreocuparse);
                break;
            case R.id.imageButtonQuerer:
                mediaPlayer = MediaPlayer.create(this, R.raw.vquerer);
                break;
            case R.id.imageButtonSerio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vserio);
                break;
            case R.id.imageButtonTriste:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtriste);
                break;
            case R.id.imageButtonValiente:
                mediaPlayer = MediaPlayer.create(this, R.raw.vvaliente);
                break;
            case R.id.imageButtonVerguenza:
                mediaPlayer = MediaPlayer.create(this, R.raw.vverguenza);
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