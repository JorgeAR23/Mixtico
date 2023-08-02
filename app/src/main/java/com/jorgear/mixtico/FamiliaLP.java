package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FamiliaLP extends AppCompatActivity {

    MediaPlayer abuela, abuelo, bebe, bisabuelo, compadre, cunada, cunado, esposa, esposo, hermanah,
                hermanam, hermanoh, hermanom, hijo, mama, nieto, padrastro, padrino, papa, pariente,
                primah, primam, primoh, primom, sobrina, sobrino, tia, tio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia_lp);

        abuela = MediaPlayer.create(this, R.raw.vabuela);
        abuelo = MediaPlayer.create(this, R.raw.vabuelo);
        bebe = MediaPlayer.create(this, R.raw.vbebe);
        bisabuelo = MediaPlayer.create(this, R.raw.vbisabuelo);
        compadre = MediaPlayer.create(this, R.raw.vcompadre);
        cunada = MediaPlayer.create(this, R.raw.vcunada);
        cunado = MediaPlayer.create(this, R.raw.vcunado);
        esposa = MediaPlayer.create(this, R.raw.vesposa);
        esposo = MediaPlayer.create(this, R.raw.vesposo);
        hermanah = MediaPlayer.create(this, R.raw.vhermanah);
        hermanam = MediaPlayer.create(this, R.raw.vhermanam);
        hermanoh = MediaPlayer.create(this, R.raw.vhermanoh);
        hermanom = MediaPlayer.create(this, R.raw.vhermanom);
        hijo = MediaPlayer.create(this, R.raw.vhijo);
        mama = MediaPlayer.create(this, R.raw.vmama);
        nieto = MediaPlayer.create(this, R.raw.vnieto);
        padrastro = MediaPlayer.create(this, R.raw.vpadrastro);
        padrino = MediaPlayer.create(this, R.raw.vpadrino);
        papa = MediaPlayer.create(this, R.raw.vpapa);
        pariente = MediaPlayer.create(this, R.raw.vpariente);
        primah = MediaPlayer.create(this, R.raw.vprimah);
        primam = MediaPlayer.create(this, R.raw.vprimam);
        primoh = MediaPlayer.create(this, R.raw.vprimoh);
        primom = MediaPlayer.create(this, R.raw.vprimom);
        sobrina = MediaPlayer.create(this, R.raw.vsobrina);
        sobrino = MediaPlayer.create(this, R.raw.vsobrino);
        tia = MediaPlayer.create(this, R.raw.vtia);
        tio = MediaPlayer.create(this, R.raw.vtio);

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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbuela:
                abuela.start();
                break;
            case R.id.imageButtonAbuelo:
                abuelo.start();
                break;
            case R.id.imageButtonBebe:
                bebe.start();
                break;
            case R.id.imageButtonBisabuelo:
                bisabuelo.start();
                break;
            case R.id.imageButtonCompadre:
                compadre.start();
                break;
            case R.id.imageButtonCuñada:
                cunada.start();
                break;
            case R.id.imageButtonCuñado:
                cunado.start();
                break;
            case R.id.imageButtonEsposa:
                esposa.start();
                break;
            case R.id.imageButtonEsposo:
                esposo.start();
                break;
            case R.id.imageButtonHermanaH:
                hermanah.start();
                break;
            case R.id.imageButtonHermanaM:
                hermanam.start();
                break;
            case R.id.imageButtonHermanoH:
                hermanoh.start();
                break;
            case R.id.imageButtonHermanoM:
                hermanom.start();
                break;
            case R.id.imageButtonHijo:
                hijo.start();
                break;
            case R.id.imageButtonMama:
                mama.start();
                break;
            case R.id.imageButtonNieto:
                nieto.start();
                break;
            case R.id.imageButtonPadrastro:
                padrastro.start();
                break;
            case R.id.imageButtonPadrino:
                padrino.start();
                break;
            case R.id.imageButtonPapa:
                papa.start();
                break;
            case R.id.imageButtonPariente:
                pariente.start();
                break;
            case R.id.imageButtonPrimaH:
                primah.start();
                break;
            case R.id.imageButtonPrimaM:
                primah.start();
                break;
            case R.id.imageButtonPrimoH:
                primoh.start();
                break;
            case R.id.imageButtonPrimoM:
                primom.start();
                break;
            case R.id.imageButtonSobrina:
                sobrina.start();
                break;
            case R.id.imageButtonSobrino:
                sobrino.start();
                break;
            case R.id.imageButtonTia:
                tia.start();
                break;
            case R.id.imageButtonTio:
                tio.start();
                break;
        }
    }
}