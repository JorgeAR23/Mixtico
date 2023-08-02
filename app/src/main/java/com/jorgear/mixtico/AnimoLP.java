package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class AnimoLP extends AppCompatActivity {

    MediaPlayer aburrirse, amado, amar, ansioso, asqueado, cauteloso, compasion, confundido, contento,
                debil, enfadarse, fuerte, goloso, grosero, loco, malvado, miedoso, odiar, orgulloso,
                perezoso, preocuparse, querer, serio, triste, valiente, verguenza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animo_lp);

        aburrirse = MediaPlayer.create(this, R.raw.vaburrirse);
        amado = MediaPlayer.create(this, R.raw.vamado);
        amar = MediaPlayer.create(this, R.raw.vamar);
        ansioso = MediaPlayer.create(this, R.raw.vansioso);
        asqueado = MediaPlayer.create(this, R.raw.vasqueado);
        cauteloso = MediaPlayer.create(this, R.raw.vcauteloso);
        compasion = MediaPlayer.create(this, R.raw.vcompasion);
        confundido = MediaPlayer.create(this, R.raw.vconfundido);
        contento = MediaPlayer.create(this, R.raw.vcontento);
        debil = MediaPlayer.create(this, R.raw.vdebil);
        enfadarse = MediaPlayer.create(this, R.raw.venfadarse);
        fuerte = MediaPlayer.create(this, R.raw.vfuerte);
        goloso = MediaPlayer.create(this, R.raw.vgoloso);
        grosero = MediaPlayer.create(this, R.raw.vgrosero);
        loco = MediaPlayer.create(this, R.raw.vloco);
        malvado = MediaPlayer.create(this, R.raw.vmalvado);
        miedoso = MediaPlayer.create(this, R.raw.vmiedoso);
        odiar = MediaPlayer.create(this, R.raw.vodiar);
        orgulloso = MediaPlayer.create(this, R.raw.vorgulloso);
        perezoso = MediaPlayer.create(this, R.raw.vperezoso);
        preocuparse = MediaPlayer.create(this, R.raw.vpreocuparse);
        querer = MediaPlayer.create(this, R.raw.vquerer);
        serio = MediaPlayer.create(this, R.raw.vserio);
        triste = MediaPlayer.create(this, R.raw.vtriste);
        valiente = MediaPlayer.create(this, R.raw.vvaliente);
        verguenza = MediaPlayer.create(this, R.raw.vverguenza);

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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAburrirse:
                aburrirse.start();
                break;
            case R.id.imageButtonAmado:
                amado.start();
                break;
            case R.id.imageButtonAmar:
                amar.start();
                break;
            case R.id.imageButtonAnsioso:
                ansioso.start();
                break;
            case R.id.imageButtonAsqueado:
                asqueado.start();
                break;
            case R.id.imageButtonCauteloso:
                cauteloso.start();
                break;
            case R.id.imageButtonCompasion:
                compasion.start();
                break;
            case R.id.imageButtonConfundido:
                confundido.start();
                break;
            case R.id.imageButtonContento:
                contento.start();
                break;
            case R.id.imageButtonDebil:
                debil.start();
                break;
            case R.id.imageButtonEnfadarse:
                enfadarse.start();
                break;
            case R.id.imageButtonFuerte:
                fuerte.start();
                break;
            case R.id.imageButtonGoloso:
                goloso.start();
                break;
            case R.id.imageButtonGrosero:
                grosero.start();
                break;
            case R.id.imageButtonLoco:
                loco.start();
                break;
            case R.id.imageButtonMalvado:
                malvado.start();
                break;
            case R.id.imageButtonMiedoso:
                miedoso.start();
                break;
            case R.id.imageButtonOdiar:
                odiar.start();
                break;
            case R.id.imageButtonOrgulloso:
                orgulloso.start();
                break;
            case R.id.imageButtonPerezoso:
                perezoso.start();
                break;
            case R.id.imageButtonPreocuparse:
                preocuparse.start();
                break;
            case R.id.imageButtonQuerer:
                querer.start();
                break;
            case R.id.imageButtonSerio:
                serio.start();
                break;
            case R.id.imageButtonTriste:
                triste.start();
                break;
            case R.id.imageButtonValiente:
                valiente.start();
                break;
            case R.id.imageButtonVerguenza:
                verguenza.start();
                break;
        }
    }
}