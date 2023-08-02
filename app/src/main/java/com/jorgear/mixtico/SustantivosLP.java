package com.jorgear.mixtico;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SustantivosLP extends AppCompatActivity {

    MediaPlayer agua, alfiler, algodon, alcohol, aire, arbol, arcoiris, arena, ataud, avion, blusa,
                bolsa, cama ,calle, camisa, campana, campo, carbon, carta, casa, cielo, clavo, collar,
                cuerda, documento, edificio, escoba, espejo, falda, flauta, fuego, gas, gorra, hacha, hilo,
                iglesia, jabon, lago, libro, licor, luna, luz, lluvia, machete, madera, medicina, metal, miel,
                moneda, olla, pantalon, papel, peine, piedra, plato, puerta, silla, sombrero, tabla, tierra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustantivos_lp);

        agua = MediaPlayer.create(this, R.raw.vagua);
        alfiler = MediaPlayer.create(this, R.raw.valfiler);
        algodon = MediaPlayer.create(this, R.raw.valgodon);
        alcohol = MediaPlayer.create(this, R.raw.valcohol);
        aire = MediaPlayer.create(this, R.raw.vaire);
        arbol = MediaPlayer.create(this, R.raw.varbol);
        arcoiris = MediaPlayer.create(this, R.raw.varcoiris);
        arena = MediaPlayer.create(this, R.raw.varena);
        ataud = MediaPlayer.create(this, R.raw.vataud);
        avion = MediaPlayer.create(this, R.raw.vavion);
        blusa = MediaPlayer.create(this, R.raw.vblusa);
        bolsa = MediaPlayer.create(this, R.raw.vbolsa);
        cama = MediaPlayer.create(this, R.raw.vcama);
        calle = MediaPlayer.create(this, R.raw.vcalle);
        camisa = MediaPlayer.create(this, R.raw.vcamisa);
        campana = MediaPlayer.create(this, R.raw.vcampana);
        campo = MediaPlayer.create(this, R.raw.vcampo);
        carbon = MediaPlayer.create(this, R.raw.vcarbon);
        carta = MediaPlayer.create(this, R.raw.vcarta);
        casa = MediaPlayer.create(this, R.raw.vcasa);
        cielo = MediaPlayer.create(this, R.raw.vcielo);
        clavo = MediaPlayer.create(this, R.raw.vclavo);
        collar = MediaPlayer.create(this, R.raw.vcollar);
        cuerda = MediaPlayer.create(this, R.raw.vcuerda);
        documento = MediaPlayer.create(this, R.raw.vdocumento);
        edificio = MediaPlayer.create(this, R.raw.vedificio);
        escoba = MediaPlayer.create(this, R.raw.vescoba);
        espejo = MediaPlayer.create(this, R.raw.vespejo);
        falda = MediaPlayer.create(this, R.raw.vfalda);
        flauta = MediaPlayer.create(this, R.raw.vflauta);
        fuego = MediaPlayer.create(this, R.raw.vfuego);
        gas = MediaPlayer.create(this, R.raw.vgas);
        gorra = MediaPlayer.create(this, R.raw.vgorra);
        hacha = MediaPlayer.create(this, R.raw.vhacha);
        hilo = MediaPlayer.create(this, R.raw.vhilo);
        iglesia = MediaPlayer.create(this, R.raw.viglesia);
        jabon = MediaPlayer.create(this, R.raw.vjabon);
        lago = MediaPlayer.create(this, R.raw.vlago);
        libro = MediaPlayer.create(this, R.raw.vlibro);
        licor = MediaPlayer.create(this, R.raw.vlicor);
        luna = MediaPlayer.create(this, R.raw.vluna);
        luz = MediaPlayer.create(this, R.raw.vluz);
        lluvia = MediaPlayer.create(this, R.raw.vlluvia);
        machete = MediaPlayer.create(this, R.raw.vmachete);
        madera = MediaPlayer.create(this, R.raw.vmadera);
        medicina = MediaPlayer.create(this, R.raw.vmedicina);
        metal = MediaPlayer.create(this, R.raw.vmetal);
        miel = MediaPlayer.create(this, R.raw.vmiel);
        moneda = MediaPlayer.create(this, R.raw.vmoneda);
        olla = MediaPlayer.create(this, R.raw.volla);
        pantalon = MediaPlayer.create(this, R.raw.vpantalon);
        papel = MediaPlayer.create(this, R.raw.vpapel);
        peine = MediaPlayer.create(this, R.raw.vpeine);
        piedra = MediaPlayer.create(this, R.raw.vpiedra);
        plato = MediaPlayer.create(this, R.raw.vplato);
        puerta = MediaPlayer.create(this, R.raw.vpuerta);
        silla = MediaPlayer.create(this, R.raw.vsilla);
        sombrero = MediaPlayer.create(this, R.raw.vsombrero);
        tabla = MediaPlayer.create(this, R.raw.vtabla);
        tierra = MediaPlayer.create(this, R.raw.vtierra);


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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAgua:
                agua.start();
                break;
            case R.id.imageButtonAlfiler:
                alfiler.start();
                break;
            case R.id.imageButtonAlgodon:
                algodon.start();
                break;
            case R.id.imageButtonAlcohol:
                alcohol.start();
                break;
            case R.id.imageButtonAire:
                aire.start();
                break;
            case R.id.imageButtonArbol:
                arbol.start();
                break;
            case R.id.imageButtonArcoiris:
                arcoiris.start();
                break;
            case R.id.imageButtonArena:
                arena.start();
                break;
            case R.id.imageButtonAtaud:
                ataud.start();
                break;
            case R.id.imageButtonAvion:
                avion.start();
                break;
            case R.id.imageButtonBlusa:
                blusa.start();
                break;
            case R.id.imageButtonBolsa:
                bolsa.start();
                break;
            case R.id.imageButtonCama:
                cama.start();
                break;
            case R.id.imageButtonCalle:
                calle.start();
                break;
            case R.id.imageButtonCamisa:
                camisa.start();
                break;
            case R.id.imageButtonCampana:
                campana.start();
                break;
            case R.id.imageButtonCampo:
                campo.start();
                break;
            case R.id.imageButtonCarbon:
                carbon.start();
                break;
            case R.id.imageButtonCarta:
                carta.start();
                break;
            case R.id.imageButtonCasa:
                casa.start();
                break;
            case R.id.imageButtonCielo:
                cielo.start();
                break;
            case R.id.imageButtonClavo:
                clavo.start();
                break;
            case R.id.imageButtonCollar:
                collar.start();
                break;
            case R.id.imageButtonCuerda:
                cuerda.start();
                break;
            case R.id.imageButtonDocumento:
                documento.start();
                break;
            case R.id.imageButtonEdificio:
                edificio.start();
                break;
            case R.id.imageButtonEscoba:
                escoba.start();
                break;
            case R.id.imageButtonEspejo:
                espejo.start();
                break;
            case R.id.imageButtonFalda:
                falda.start();
                break;
            case R.id.imageButtonFlauta:
                flauta.start();
                break;
            case R.id.imageButtonFuego:
                fuego.start();
                break;
            case R.id.imageButtonGas:
                gas.start();
                break;
            case R.id.imageButtonGorra:
                gorra.start();
                break;
            case R.id.imageButtonHacha:
                hacha.start();
                break;
            case R.id.imageButtonHilo:
                hilo.start();
                break;
            case R.id.imageButtonIglesia:
                iglesia.start();
                break;
            case R.id.imageButtonJabon:
                jabon.start();
                break;
            case R.id.imageButtonLago:
                lago.start();
                break;
            case R.id.imageButtonLibro:
                libro.start();
                break;
            case R.id.imageButtonLicor:
                licor.start();
                break;
            case R.id.imageButtonLuna:
                luna.start();
                break;
            case R.id.imageButtonLuz:
                luz.start();
                break;
            case R.id.imageButtonLluvia:
                lluvia.start();
                break;
            case R.id.imageButtonMachete:
                machete.start();
                break;
            case R.id.imageButtonMadera:
                madera.start();
                break;
            case R.id.imageButtonMedicina:
                medicina.start();
                break;
            case R.id.imageButtonMetal:
                metal.start();
                break;
            case R.id.imageButtonMiel:
                miel.start();
                break;
            case R.id.imageButtonMoneda:
                moneda.start();
                break;
            case R.id.imageButtonOlla:
                olla.start();
                break;
            case R.id.imageButtonPantalon:
                pantalon.start();
                break;
            case R.id.imageButtonPapel:
                papel.start();
                break;
            case R.id.imageButtonPeine:
                peine.start();
                break;
            case R.id.imageButtonPiedra:
                piedra.start();
                break;
            case R.id.imageButtonPlato:
                plato.start();
                break;
            case R.id.imageButtonPuerta:
                puerta.start();
                break;
            case R.id.imageButtonSilla:
                silla.start();
                break;
            case R.id.imageButtonSombrero:
                sombrero.start();
                break;
            case R.id.imageButtonTabla:
                tabla.start();
                break;
            case R.id.imageButtonTierra:
                tierra.start();
                break;
        }
    }
}