package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class NumerosLP extends AppCompatActivity {

    MediaPlayer uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, diez, once, doce, trece,
                catorce, quince, dieciseis, diecisiete, dieciocho, diecinueve, veinte, treinta,
                cuarenta, cincuenta, sesenta, setenta, ochenta, noventa, cien, doscientos, mil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_lp);

        uno = MediaPlayer.create(this, R.raw.vuno);
        dos = MediaPlayer.create(this, R.raw.vdos);
        tres = MediaPlayer.create(this, R.raw.vtres);
        cuatro = MediaPlayer.create(this, R.raw.vcuatro);
        cinco = MediaPlayer.create(this, R.raw.vcinco);
        seis = MediaPlayer.create(this, R.raw.vseis);
        siete = MediaPlayer.create(this, R.raw.vsiete);
        ocho = MediaPlayer.create(this, R.raw.vocho);
        nueve = MediaPlayer.create(this, R.raw.vnueve);
        diez = MediaPlayer.create(this, R.raw.vdiez);
        once = MediaPlayer.create(this, R.raw.vonce);
        doce = MediaPlayer.create(this, R.raw.vdoce);
        trece = MediaPlayer.create(this, R.raw.vtrece);
        catorce = MediaPlayer.create(this, R.raw.vcatorce);
        quince = MediaPlayer.create(this, R.raw.vquince);
        dieciseis= MediaPlayer.create(this, R.raw.vdieciseis);
        diecisiete = MediaPlayer.create(this, R.raw.vdiecisiete);
        dieciocho = MediaPlayer.create(this, R.raw.vdieciocho);
        diecinueve = MediaPlayer.create(this, R.raw.vdiecinueve);
        veinte = MediaPlayer.create(this, R.raw.vveinte);
        treinta = MediaPlayer.create(this, R.raw.vtreinta);
        cuarenta = MediaPlayer.create(this, R.raw.vcuarenta);
        cincuenta = MediaPlayer.create(this, R.raw.vcincuenta);
        sesenta = MediaPlayer.create(this, R.raw.vsesenta);
        setenta = MediaPlayer.create(this, R.raw.vsetenta);
        ochenta = MediaPlayer.create(this, R.raw.vochenta);
        noventa = MediaPlayer.create(this, R.raw.vnoventa);
        cien = MediaPlayer.create(this, R.raw.vcien);
        doscientos = MediaPlayer.create(this, R.raw.vdoscientos);
        mil = MediaPlayer.create(this, R.raw.vmil);

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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButton1:
                uno.start();
                break;
            case R.id.imageButton2:
                dos.start();
                break;
            case R.id.imageButton3:
                tres.start();
                break;
            case R.id.imageButton4:
                cuatro.start();
                break;
            case R.id.imageButton5:
                cinco.start();
                break;
            case R.id.imageButton6:
                seis.start();
                break;
            case R.id.imageButton7:
                siete.start();
                break;
            case R.id.imageButton8:
                ocho.start();
                break;
            case R.id.imageButton9:
                nueve.start();
                break;
            case R.id.imageButton10:
                diez.start();
                break;
            case R.id.imageButton11:
                once.start();
                break;
            case R.id.imageButton12:
                doce.start();
                break;
            case R.id.imageButton13:
                trece.start();
                break;
            case R.id.imageButton14:
                catorce.start();
                break;
            case R.id.imageButton15:
                quince.start();
                break;
            case R.id.imageButton16:
                dieciseis.start();
                break;
            case R.id.imageButton17:
                diecisiete.start();
                break;
            case R.id.imageButton18:
                dieciocho.start();
                break;
            case R.id.imageButton19:
                diecinueve.start();
                break;
            case R.id.imageButton20:
                veinte.start();
                break;
            case R.id.imageButton30:
                treinta.start();
                break;
            case R.id.imageButton40:
                cuarenta.start();
                break;
            case R.id.imageButton50:
                cincuenta.start();
                break;
            case R.id.imageButton60:
                sesenta.start();
                break;
            case R.id.imageButton70:
                setenta.start();
                break;
            case R.id.imageButton80:
                ochenta.start();
                break;
            case R.id.imageButton90:
                noventa.start();
                break;
            case R.id.imageButton100:
                cien.start();
                break;
            case R.id.imageButton200:
                doscientos.start();
                break;
            case R.id.imageButton1000:
                mil.start();
                break;
        }
    }
}