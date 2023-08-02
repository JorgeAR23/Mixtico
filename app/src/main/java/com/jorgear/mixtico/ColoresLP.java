package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ColoresLP extends AppCompatActivity {

    MediaPlayer anaranjado, amarillo, azul, blanco, cafe, gris, negro, morado, rojo, rosa, verde;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colores_lp);

        anaranjado = MediaPlayer.create(this, R.raw.vanaranjado);
        amarillo = MediaPlayer.create(this, R.raw.vamarillo);
        azul = MediaPlayer.create(this, R.raw.vazul);
        blanco = MediaPlayer.create(this, R.raw.vblanco);
        cafe = MediaPlayer.create(this, R.raw.vcafe);
        gris = MediaPlayer.create(this, R.raw.vgris);
        negro = MediaPlayer.create(this, R.raw.vnegro);
        morado = MediaPlayer.create(this, R.raw.vmorado);
        rojo = MediaPlayer.create(this, R.raw.vrojo);
        rosa = MediaPlayer.create(this, R.raw.vrosa);
        verde = MediaPlayer.create(this, R.raw.vverde);

    }

    //Metodo para regresar a Inicio
    public void Inicio(View view){
        Intent inicio = new Intent(this, MainActivity.class);
        startActivity(inicio);
    }

    //Metodo para ir a Prueba
    public void Prueba(View view){
        Intent prueba = new Intent(this, ColoresP1.class);
        startActivity(prueba);
    }

    @SuppressLint("NonConstantResourceId")
    public void reproducirSonido(View view) {
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAnaranjado:
                anaranjado.start();
                break;
            case R.id.imageButtonAmarillo:
                amarillo.start();
                break;
            case R.id.imageButtonAzul:
                azul.start();
                break;
            case R.id.imageButtonBlanco:
                blanco.start();
                break;
            case R.id.imageButtonCafe:
                cafe.start();
                break;
            case R.id.imageButtonGris:
                gris.start();
                break;
            case R.id.imageButtonNegro:
                negro.start();
                break;
            case R.id.imageButtonMorado:
                morado.start();
                break;
            case R.id.imageButtonRojo:
                rojo.start();
                break;
            case R.id.imageButtonRosa:
                rosa.start();
                break;
            case R.id.imageButtonVerde:
                verde.start();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (anaranjado != null) {
            anaranjado.release();
            anaranjado = null;
        }else if (amarillo != null) {
            amarillo.release();
            amarillo = null;
        }else if (azul != null) {
            azul.release();
            azul = null;
        }else if (blanco != null) {
            blanco.release();
            blanco = null;
        }else if (cafe != null) {
            cafe.release();
            cafe = null;
        }else if (gris != null) {
            gris.release();
            gris = null;
        }else if (negro != null) {
            negro.release();
            negro = null;
        }else if (morado != null) {
            morado.release();
            morado = null;
        }else if (rojo != null) {
            rojo.release();
            rojo = null;
        }else if (rosa != null) {
            rosa.release();
            rosa = null;
        }else if (verde != null) {
            verde.release();
            verde = null;
        }
    }
}