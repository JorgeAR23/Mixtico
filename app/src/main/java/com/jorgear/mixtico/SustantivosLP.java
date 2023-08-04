package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SustantivosLP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustantivos_lp);
    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, SustantivosP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Carga el recurso de sonido justo antes de reproducirlo
        MediaPlayer mediaPlayer = null;
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAgua:
                mediaPlayer = MediaPlayer.create(this, R.raw.vagua);
                break;
            case R.id.imageButtonAlfiler:
                mediaPlayer = MediaPlayer.create(this, R.raw.valfiler);
                break;
            case R.id.imageButtonAlgodon:
                mediaPlayer = MediaPlayer.create(this, R.raw.valgodon);
                break;
            case R.id.imageButtonAlcohol:
                mediaPlayer = MediaPlayer.create(this, R.raw.valcohol);
                break;
            case R.id.imageButtonAire:
                mediaPlayer = MediaPlayer.create(this, R.raw.vaire);
                break;
            case R.id.imageButtonArbol:
                mediaPlayer = MediaPlayer.create(this, R.raw.varbol);
                break;
            case R.id.imageButtonArcoiris:
                mediaPlayer = MediaPlayer.create(this, R.raw.varcoiris);
                break;
            case R.id.imageButtonArena:
                mediaPlayer = MediaPlayer.create(this, R.raw.varena);
                break;
            case R.id.imageButtonAtaud:
                mediaPlayer = MediaPlayer.create(this, R.raw.vataud);
                break;
            case R.id.imageButtonAvion:
                mediaPlayer = MediaPlayer.create(this, R.raw.vavion);
                break;
            case R.id.imageButtonBlusa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vblusa);
                break;
            case R.id.imageButtonBolsa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vbolsa);
                break;
            case R.id.imageButtonCama:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcama);
                break;
            case R.id.imageButtonCalle:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcalle);
                break;
            case R.id.imageButtonCamisa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcamisa);
                break;
            case R.id.imageButtonCampana:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcampana);
                break;
            case R.id.imageButtonCampo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcampo);
                break;
            case R.id.imageButtonCarbon:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcarbon);
                break;
            case R.id.imageButtonCarta:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcarta);
                break;
            case R.id.imageButtonCasa:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcasa);
                break;
            case R.id.imageButtonCielo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcielo);
                break;
            case R.id.imageButtonClavo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vclavo);
                break;
            case R.id.imageButtonCollar:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcollar);
                break;
            case R.id.imageButtonCuerda:
                mediaPlayer = MediaPlayer.create(this, R.raw.vcuerda);
                break;
            case R.id.imageButtonDocumento:
                mediaPlayer = MediaPlayer.create(this, R.raw.vdocumento);
                break;
            case R.id.imageButtonEdificio:
                mediaPlayer = MediaPlayer.create(this, R.raw.vedificio);
                break;
            case R.id.imageButtonEscoba:
                mediaPlayer = MediaPlayer.create(this, R.raw.vescoba);
                break;
            case R.id.imageButtonEspejo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vespejo);
                break;
            case R.id.imageButtonFalda:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfalda);
                break;
            case R.id.imageButtonFlauta:
                mediaPlayer = MediaPlayer.create(this, R.raw.vflauta);
                break;
            case R.id.imageButtonFuego:
                mediaPlayer = MediaPlayer.create(this, R.raw.vfuego);
                break;
            case R.id.imageButtonGas:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgas);
                break;
            case R.id.imageButtonGorra:
                mediaPlayer = MediaPlayer.create(this, R.raw.vgorra);
                break;
            case R.id.imageButtonHacha:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhacha);
                break;
            case R.id.imageButtonHilo:
                mediaPlayer = MediaPlayer.create(this, R.raw.vhilo);
                break;
            case R.id.imageButtonIglesia:
                mediaPlayer = MediaPlayer.create(this, R.raw.viglesia);
                break;
            case R.id.imageButtonJabon:
                mediaPlayer = MediaPlayer.create(this, R.raw.vjabon);
                break;
            case R.id.imageButtonLago:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlago);
                break;
            case R.id.imageButtonLibro:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlibro);
                break;
            case R.id.imageButtonLicor:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlicor);
                break;
            case R.id.imageButtonLuna:
                mediaPlayer = MediaPlayer.create(this, R.raw.vluna);
                break;
            case R.id.imageButtonLuz:
                mediaPlayer = MediaPlayer.create(this, R.raw.vluz);
                break;
            case R.id.imageButtonLluvia:
                mediaPlayer = MediaPlayer.create(this, R.raw.vlluvia);
                break;
            case R.id.imageButtonMachete:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmachete);
                break;
            case R.id.imageButtonMadera:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmadera);
                break;
            case R.id.imageButtonMedicina:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmedicina);
                break;
            case R.id.imageButtonMetal:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmetal);
                break;
            case R.id.imageButtonMiel:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmiel);
                break;
            case R.id.imageButtonMoneda:
                mediaPlayer = MediaPlayer.create(this, R.raw.vmoneda);
                break;
            case R.id.imageButtonOlla:
                mediaPlayer = MediaPlayer.create(this, R.raw.volla);
                break;
            case R.id.imageButtonPantalon:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpantalon);
                break;
            case R.id.imageButtonPapel:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpapel);
                break;
            case R.id.imageButtonPeine:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpeine);
                break;
            case R.id.imageButtonPiedra:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpiedra);
                break;
            case R.id.imageButtonPlato:
                mediaPlayer = MediaPlayer.create(this, R.raw.vplato);
                break;
            case R.id.imageButtonPuerta:
                mediaPlayer = MediaPlayer.create(this, R.raw.vpuerta);
                break;
            case R.id.imageButtonSilla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsilla);
                break;
            case R.id.imageButtonSombrero:
                mediaPlayer = MediaPlayer.create(this, R.raw.vsombrero);
                break;
            case R.id.imageButtonTabla:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtabla);
                break;
            case R.id.imageButtonTierra:
                mediaPlayer = MediaPlayer.create(this, R.raw.vtierra);
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