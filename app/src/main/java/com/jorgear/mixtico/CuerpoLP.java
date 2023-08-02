package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class CuerpoLP extends AppCompatActivity {

    MediaPlayer barba, bigote, boca, cabello, cabeza, cara, ceja, cerebro, codo, corazon, cuello, diente,
                espalda, estomago, frente, garganta, hombro, hueso, labio, lengua, mano, menton, mejilla,
                muslo, nalga, nariz, ojo, ombligo, oreja, pecho, pestana, pie, piel, pierna, pulmon, rodilla,
                una, vello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuerpo_lp);

        barba = MediaPlayer.create(this, R.raw.vbarba);
        bigote = MediaPlayer.create(this, R.raw.vbigote);
        boca = MediaPlayer.create(this, R.raw.vboca);
        cabello = MediaPlayer.create(this, R.raw.vcabello);
        cabeza = MediaPlayer.create(this, R.raw.vcabeza);
        cara = MediaPlayer.create(this, R.raw.vcara);
        ceja = MediaPlayer.create(this, R.raw.vceja);
        cerebro = MediaPlayer.create(this, R.raw.vcerebro);
        codo = MediaPlayer.create(this, R.raw.vcodo);
        corazon = MediaPlayer.create(this, R.raw.vcorazon);
        cuello = MediaPlayer.create(this, R.raw.vcuello);
        diente = MediaPlayer.create(this, R.raw.vdiente);
        espalda = MediaPlayer.create(this, R.raw.vespalda);
        estomago = MediaPlayer.create(this, R.raw.vestomago);
        frente = MediaPlayer.create(this, R.raw.vfrente);
        garganta = MediaPlayer.create(this, R.raw.vgarganta);
        hombro = MediaPlayer.create(this, R.raw.vhombro);
        hueso = MediaPlayer.create(this, R.raw.vhueso);
        labio = MediaPlayer.create(this, R.raw.vlabio);
        lengua = MediaPlayer.create(this, R.raw.vlengua);
        mano = MediaPlayer.create(this, R.raw.vmano);
        menton = MediaPlayer.create(this, R.raw.vmenton);
        mejilla = MediaPlayer.create(this, R.raw.vmejilla);
        muslo = MediaPlayer.create(this, R.raw.vmuslo);
        nalga = MediaPlayer.create(this, R.raw.vnalga);
        nariz = MediaPlayer.create(this, R.raw.vnariz);
        ojo = MediaPlayer.create(this, R.raw.vojo);
        ombligo = MediaPlayer.create(this, R.raw.vombligo);
        oreja = MediaPlayer.create(this, R.raw.voreja);
        pecho = MediaPlayer.create(this, R.raw.vpecho);
        pestana = MediaPlayer.create(this, R.raw.vpestana);
        pie = MediaPlayer.create(this, R.raw.vpie);
        piel = MediaPlayer.create(this, R.raw.vpiel);
        pierna = MediaPlayer.create(this, R.raw.vpierna);
        pulmon = MediaPlayer.create(this, R.raw.vpulmon);
        rodilla = MediaPlayer.create(this, R.raw.vrodilla);
        una = MediaPlayer.create(this, R.raw.vuna);
        vello = MediaPlayer.create(this, R.raw.vvello);

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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonBarba:
                barba.start();
                break;
            case R.id.imageButtonBigote:
                bigote.start();
                break;
            case R.id.imageButtonBoca:
                boca.start();
                break;
            case R.id.imageButtonCabello:
                cabello.start();
                break;
            case R.id.imageButtonCabeza:
                cabeza.start();
                break;
            case R.id.imageButtonCara:
                cara.start();
                break;
            case R.id.imageButtonCeja:
                ceja.start();
                break;
            case R.id.imageButtonCerebro:
                cerebro.start();
                break;
            case R.id.imageButtonCodo:
                codo.start();
                break;
            case R.id.imageButtonCorazon:
                corazon.start();
                break;
            case R.id.imageButtonCuello:
                cuello.start();
                break;
            case R.id.imageButtonDiente:
                diente.start();
                break;
            case R.id.imageButtonEspalda:
                espalda.start();
                break;
            case R.id.imageButtonEstomago:
                estomago.start();
                break;
            case R.id.imageButtonFrente:
                frente.start();
                break;
            case R.id.imageButtonGarganta:
                garganta.start();
                break;
            case R.id.imageButtonHombro:
                hombro.start();
                break;
            case R.id.imageButtonHueso:
                hueso.start();
                break;
            case R.id.imageButtonLabio:
                labio.start();
                break;
            case R.id.imageButtonLengua:
                lengua.start();
                break;
            case R.id.imageButtonMano:
                mano.start();
                break;
            case R.id.imageButtonMenton:
                menton.start();
                break;
            case R.id.imageButtonMejilla:
                mejilla.start();
                break;
            case R.id.imageButtonMuslo:
                muslo.start();
                break;
            case R.id.imageButtonNalga:
                nalga.start();
                break;
            case R.id.imageButtonNariz:
                nariz.start();
                break;
            case R.id.imageButtonOjo:
                ojo.start();
                break;
            case R.id.imageButtonOmbligo:
                ombligo.start();
                break;
            case R.id.imageButtonOreja:
                oreja.start();
                break;
            case R.id.imageButtonPecho:
                pecho.start();
                break;
            case R.id.imageButtonPestaña:
                pestana.start();
                break;
            case R.id.imageButtonPie:
                pie.start();
                break;
            case R.id.imageButtonPiel:
                piel.start();
                break;
            case R.id.imageButtonPierna:
                pierna.start();
                break;
            case R.id.imageButtonPulmon:
                pulmon.start();
                break;
            case R.id.imageButtonRodilla:
                rodilla.start();
                break;
            case R.id.imageButtonUña:
                una.start();
                break;
            case R.id.imageButtonVello:
                vello.start();
                break;
        }
    }
}