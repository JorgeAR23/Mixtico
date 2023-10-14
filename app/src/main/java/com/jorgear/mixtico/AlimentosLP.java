package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AlimentosLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, AlimentosP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAguacate:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaguacate);
                break;
            case R.id.imageButtonAjo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vajo);
                break;
            case R.id.imageButtonAtole:
                mediaPlayer = MediaPlayer.create(this, R.raw.vatole);
                break;
            case R.id.imageButtonAzucar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vazucar);
                break;
            case R.id.imageButtonCacahuate:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcacahuate);
                break;
            case R.id.imageButtonCalabaza:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcalabaza);
                break;
            case R.id.imageButtonCarne:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcarne);
                break;
            case R.id.imageButtonCebolla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcebolla);
                break;
            case R.id.imageButtonChile:
                mediaPlayer = MediaPlayer.create(this, R.raw.vchile);
                break;
            case R.id.imageButtonChocolate:
                mediaPlayer = MediaPlayer.create(this, R.raw.vchocolate);
                break;
            case R.id.imageButtonCiruela:
                mediaPlayer = MediaPlayer.create(this, R.raw.vciruela);
                break;
            case R.id.imageButtonDurazno:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdurazno);
                break;
            case R.id.imageButtonFrijol:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfrijol);
                break;
            case R.id.imageButtonHuevo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhuevo);
                break;
            case R.id.imageButtonJitomate:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjitomate);
                break;
            case R.id.imageButtonMaiz:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmaiz);
                break;
            case R.id.imageButtonMiel:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmiel);
                break;
            case R.id.imageButtonNaranja:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnaranja);
                break;
            case R.id.imageButtonPan:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpan);
                break;
            case R.id.imageButtonPapas:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpapas);
                break;
            case R.id.imageButtonPescado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpescado);
                break;
            case R.id.imageButtonPina:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpina);
                break;
            case R.id.imageButtonPlatano:
                mediaPlayer = MediaPlayer.create(this, R.raw.vplatano);
                break;
            case R.id.imageButtonPollo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpollos);
                break;
            case R.id.imageButtonSal:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsal);
                break;
            case R.id.imageButtonTortilla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtortilla);
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