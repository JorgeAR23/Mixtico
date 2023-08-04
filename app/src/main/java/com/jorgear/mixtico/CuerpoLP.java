package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class CuerpoLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpo_lp);

    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, CuerpoP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonBarba:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbarba);
                break;
            case R.id.imageButtonBigote:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbigote);
                break;
            case R.id.imageButtonBoca:
                mediaPlayer = MediaPlayer.create(this, R.raw.vboca);
                break;
            case R.id.imageButtonCabello:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcabello);
                break;
            case R.id.imageButtonCabeza:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcabeza);
                break;
            case R.id.imageButtonCara:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcara);
                break;
            case R.id.imageButtonCeja:
                mediaPlayer = MediaPlayer.create(this, R.raw.vceja);
                break;
            case R.id.imageButtonCerebro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcerebro);
                break;
            case R.id.imageButtonCodo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcodo);
                break;
            case R.id.imageButtonCorazon:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcorazon);
                break;
            case R.id.imageButtonCuello:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuello);
                break;
            case R.id.imageButtonDiente:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdiente);
                break;
            case R.id.imageButtonEspalda:
                mediaPlayer = MediaPlayer.create(this, R.raw.vespalda);
                break;
            case R.id.imageButtonEstomago:
                mediaPlayer = MediaPlayer.create(this, R.raw.vestomago);
                break;
            case R.id.imageButtonFrente:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfrente);
                break;
            case R.id.imageButtonGarganta:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgarganta);
                break;
            case R.id.imageButtonHombro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhombro);
                break;
            case R.id.imageButtonHueso:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhueso);
                break;
            case R.id.imageButtonLabio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlabio);
                break;
            case R.id.imageButtonLengua:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlengua);
                break;
            case R.id.imageButtonMano:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmano);
                break;
            case R.id.imageButtonMenton:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmenton);
                break;
            case R.id.imageButtonMejilla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmejilla);
                break;
            case R.id.imageButtonMuslo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmuslo);
                break;
            case R.id.imageButtonNalga:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnalga);
                break;
            case R.id.imageButtonNariz:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnariz);
                break;
            case R.id.imageButtonOjo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vojo);
                break;
            case R.id.imageButtonOmbligo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vombligo);
                break;
            case R.id.imageButtonOreja:
                mediaPlayer = MediaPlayer.create(this, R.raw.voreja);
                break;
            case R.id.imageButtonPecho:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpecho);
                break;
            case R.id.imageButtonPestaña:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpestana);
                break;
            case R.id.imageButtonPie:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpie);
                break;
            case R.id.imageButtonPiel:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpiel);
                break;
            case R.id.imageButtonPierna:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpierna);
                break;
            case R.id.imageButtonPulmon:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpulmon);
                break;
            case R.id.imageButtonRodilla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vrodilla);
                break;
            case R.id.imageButtonUña:
                mediaPlayer = MediaPlayer.create(this, R.raw.vuna);
                break;
            case R.id.imageButtonVello:
                mediaPlayer = MediaPlayer.create(this, R.raw.vvello);
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