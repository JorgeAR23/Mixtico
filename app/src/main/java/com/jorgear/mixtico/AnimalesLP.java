package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

import java.util.ArrayList;

public class AnimalesLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_lp);

    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, AnimalesP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbeja:
                mediaPlayer = MediaPlayer.create(this, R.raw.vabeja);
                break;
            case R.id.imageButtonAlacran:
                mediaPlayer = MediaPlayer.create(this, R.raw.valacran);
                break;
            case R.id.imageButtonAraña:
                mediaPlayer = MediaPlayer.create(this, R.raw.varana);
                break;
            case R.id.imageButtonArdilla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vardilla);
                break;
            case R.id.imageButtonArmadillo:
                mediaPlayer = MediaPlayer.create(this, R.raw.varmadillo);
                break;
            case R.id.imageButtonBuho:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbuho);
                break;
            case R.id.imageButtonCaballo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcaballo);
                break;
            case R.id.imageButtonCangrejo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcangrejo);
                break;
            case R.id.imageButtonCaracol:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcaracol);
                break;
            case R.id.imageButtonCodorniz:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcodorniz);
                break;
            case R.id.imageButtonColibri:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcolibri);
                break;
            case R.id.imageButtonConejo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vconejo);
                break;
            case R.id.imageButtonCoyote:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcoyote);
                break;
            case R.id.imageButtonCucaracha:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcucaracha);
                break;
            case R.id.imageButtonChapulin:
                mediaPlayer = MediaPlayer.create(this, R.raw.vchapulin);
                break;
            case R.id.imageButtonChivo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vchivo);
                break;
            case R.id.imageButtonGallina:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgallina);
                break;
            case R.id.imageButtonGallo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgallo);
                break;
            case R.id.imageButtonGato:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgato);
                break;
            case R.id.imageButtonGrillo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgrillo);
                break;
            case R.id.imageButtonGusano:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgusano);
                break;
            case R.id.imageButtonHormiga:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhormiga);
                break;
            case R.id.imageButtonIguana:
                mediaPlayer = MediaPlayer.create(this, R.raw.viguana);
                break;
            case R.id.imageButtonJabali:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjabali);
                break;
            case R.id.imageButtonLagartija:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlagartija);
                break;
            case R.id.imageButtonMariposa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmariposa);
                break;
            case R.id.imageButtonMosca:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmosca);
                break;
            case R.id.imageButtonOveja:
                mediaPlayer = MediaPlayer.create(this, R.raw.voveja);
                break;
            case R.id.imageButtonPajaro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpajaro);
                break;
            case R.id.imageButtonPavo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpavo);
                break;
            case R.id.imageButtonPerro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vperro);
                break;
            case R.id.imageButtonPez:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpez);
                break;
            case R.id.imageButtonPollo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpollo);
                break;
            case R.id.imageButtonPuerco:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpuerco);
                break;
            case R.id.imageButtonRana:
                mediaPlayer = MediaPlayer.create(this, R.raw.vrana);
                break;
            case R.id.imageButtonRata:
                mediaPlayer = MediaPlayer.create(this, R.raw.vrata);
                break;
            case R.id.imageButtonSapo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsapo);
                break;
            case R.id.imageButtonSerpiente:
                mediaPlayer = MediaPlayer.create(this, R.raw.vserpiente);
                break;
            case R.id.imageButtonTarantula:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtarantula);
                break;
            case R.id.imageButtonTigre:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtigre);
                break;
            case R.id.imageButtonTlacuache:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtlacuache);
                break;
            case R.id.imageButtonVaca:
                mediaPlayer = MediaPlayer.create(this, R.raw.vvaca);
                break;
            case R.id.imageButtonVenado:
                mediaPlayer = MediaPlayer.create(this, R.raw.vvenado);
                break;
            case R.id.imageButtonZancudo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vzancudo);
                break;
            case R.id.imageButtonZorrillo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vzorrillo);
                break;
            case R.id.imageButtonZorro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vzorro);
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