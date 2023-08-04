package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class VerbosLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbos_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, VerbosP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbrir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabrir);
                break;
            case R.id.imageButtonAcostarse:
                mediaPlayer = MediaPlayer.create(this, R.raw.vacostarse);
                break;
            case R.id.imageButtonAdorar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vadorar);
                break;
            case R.id.imageButtonAplaudir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaplaudir);
                break;
            case R.id.imageButtonArreglar:
                mediaPlayer = MediaPlayer.create(this, R.raw.varreglar);
                break;
            case R.id.imageButtonAsustar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vasustar);
                break;
            case R.id.imageButtonAtacar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vatacar);
                break;
            case R.id.imageButtonAyudar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vayudar);
                break;
            case R.id.imageButtonBailar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbailar);
                break;
            case R.id.imageButtonBarrer:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbarrer);
                break;
            case R.id.imageButtonBeber:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbeber);
                break;
            case R.id.imageButtonBrincar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbrincar);
                break;
            case R.id.imageButtonCaminar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcaminar);
                break;
            case R.id.imageButtonCantar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcantar);
                break;
            case R.id.imageButtonCasar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcasar);
                break;
            case R.id.imageButtonCelebrar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcelebrar);
                break;
            case R.id.imageButtonCerrar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcerrar);
                break;
            case R.id.imageButtonComer:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcomer);
                break;
            case R.id.imageButtonComprar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcomprar);
                break;
            case R.id.imageButtonConstruir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vconstruir);
                break;
            case R.id.imageButtonConvivir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vconvivir);
                break;
            case R.id.imageButtonCopiar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcopiar);
                break;
            case R.id.imageButtonCorrer:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcorrer);
                break;
            case R.id.imageButtonCortar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcortar);
                break;
            case R.id.imageButtonDestruir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdestruir);
                break;
            case R.id.imageButtonDibujar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdibujar);
                break;
            case R.id.imageButtonDividir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdividir);
                break;
            case R.id.imageButtonDormir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdormir);
                break;
            case R.id.imageButtonEmborrachar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vemborrachar);
                break;
            case R.id.imageButtonEnseñar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vensenar);
                break;
            case R.id.imageButtonEscribir:
                mediaPlayer = MediaPlayer.create(this, R.raw.vescribir);
                break;
            case R.id.imageButtonEscuchar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vescuchar);
                break;
            case R.id.imageButtonGanar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vganar);
                break;
            case R.id.imageButtonGolpear:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgolpear);
                break;
            case R.id.imageButtonGritar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgritar);
                break;
            case R.id.imageButtonHablar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhablar);
                break;
            case R.id.imageButtonLlamar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vllamar);
                break;
            case R.id.imageButtonLlorar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vllorar);
                break;
            case R.id.imageButtonManejar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmanejar);
                break;
            case R.id.imageButtonMatar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmatar);
                break;
            case R.id.imageButtonMorder:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmorder);
                break;
            case R.id.imageButtonNadar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vnadar);
                break;
            case R.id.imageButtonPensar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpensar);
                break;
            case R.id.imageButtonQuemar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vquemar);
                break;
            case R.id.imageButtonRegalar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vregalar);
                break;
            case R.id.imageButtonSaludar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsaludar);
                break;
            case R.id.imageButtonTirar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtirar);
                break;
            case R.id.imageButtonTocar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtocar);
                break;
            case R.id.imageButtonTrabajar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtrabajar);
                break;
            case R.id.imageButtonVolar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vvolar);
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