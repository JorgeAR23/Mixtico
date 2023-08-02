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

    private ArrayList<MediaPlayer> mediaPlayers = new ArrayList<>();
    MediaPlayer abeja, alacran, arana, ardilla, armadillo, buho, caballo, cangrejo, caracol, codorniz,
                colibri, conejo, coyote, cucaracha, chapulin, chivo, gallina, gallo, gato, grillo, gusano,
                hormiga, iguana, jabali, lagartija, mariposa, mosca, oveja, pajaro, pavo, perro, pez, pollo,
                puerco, rana, rata, sapo, serpiente, tarantula, tigre, tlacuache, vaca, venado, zancudo, zorrillo, zorro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animales_lp);

        abeja = MediaPlayer.create(this, R.raw.vabeja);
        mediaPlayers.add(abeja);
        alacran = MediaPlayer.create(this, R.raw.valacran);
        mediaPlayers.add(alacran);
        arana = MediaPlayer.create(this, R.raw.varana);
        mediaPlayers.add(arana);
        ardilla = MediaPlayer.create(this, R.raw.vardilla);
        mediaPlayers.add(ardilla);
        armadillo = MediaPlayer.create(this, R.raw.varmadillo);
        mediaPlayers.add(armadillo);
        buho = MediaPlayer.create(this, R.raw.vbuho);
        mediaPlayers.add(buho);
        caballo = MediaPlayer.create(this, R.raw.vcaballo);
        mediaPlayers.add(caballo);
        cangrejo = MediaPlayer.create(this, R.raw.vcangrejo);
        mediaPlayers.add(cangrejo);
        caracol = MediaPlayer.create(this, R.raw.vcaracol);
        mediaPlayers.add(caracol);
        codorniz = MediaPlayer.create(this, R.raw.vcodorniz);
        mediaPlayers.add(codorniz);
        colibri = MediaPlayer.create(this, R.raw.vcolibri);
        mediaPlayers.add(colibri);
        conejo = MediaPlayer.create(this, R.raw.vconejo);
        mediaPlayers.add(conejo);
        coyote = MediaPlayer.create(this, R.raw.vcoyote);
        mediaPlayers.add(coyote);
        cucaracha = MediaPlayer.create(this, R.raw.vcucaracha);
        mediaPlayers.add(cucaracha);
        chapulin = MediaPlayer.create(this, R.raw.vchapulin);
        mediaPlayers.add(chapulin);
        chivo = MediaPlayer.create(this, R.raw.vchivo);
        mediaPlayers.add(chivo);
        gallina = MediaPlayer.create(this, R.raw.vgallina);
        mediaPlayers.add(gallina);
        gallo = MediaPlayer.create(this, R.raw.vgallo);
        mediaPlayers.add(gallo);
        gato = MediaPlayer.create(this, R.raw.vgato);
        mediaPlayers.add(gato);
        grillo = MediaPlayer.create(this, R.raw.vgrillo);
        mediaPlayers.add(grillo);
        gusano = MediaPlayer.create(this, R.raw.vgusano);
        mediaPlayers.add(gusano);
        hormiga = MediaPlayer.create(this, R.raw.vhormiga);
        mediaPlayers.add(hormiga);
        iguana = MediaPlayer.create(this, R.raw.viguana);
        mediaPlayers.add(iguana);
        jabali = MediaPlayer.create(this, R.raw.vjabali);
        mediaPlayers.add(jabali);
        lagartija = MediaPlayer.create(this, R.raw.vlagartija);
        mediaPlayers.add(lagartija);
        mariposa = MediaPlayer.create(this, R.raw.vmariposa);
        mediaPlayers.add(mariposa);
        mosca = MediaPlayer.create(this, R.raw.vmosca);
        mediaPlayers.add(mosca);
        oveja = MediaPlayer.create(this, R.raw.voveja);
        mediaPlayers.add(oveja);
        pajaro = MediaPlayer.create(this, R.raw.vpajaro);
        mediaPlayers.add(pajaro );
        pavo = MediaPlayer.create(this, R.raw.vpavo);
        mediaPlayers.add(pavo);
        perro = MediaPlayer.create(this, R.raw.vperro);
        mediaPlayers.add(perro);
        pez = MediaPlayer.create(this, R.raw.vpez);
        mediaPlayers.add(pez);
        pollo = MediaPlayer.create(this, R.raw.vpollo);
        mediaPlayers.add(pollo);
        puerco = MediaPlayer.create(this, R.raw.vpuerco);
        mediaPlayers.add(puerco);
        rana = MediaPlayer.create(this, R.raw.vrana);
        mediaPlayers.add(rana);
        rata = MediaPlayer.create(this, R.raw.vrata);
        mediaPlayers.add(rata);
        sapo = MediaPlayer.create(this, R.raw.vsapo);
        mediaPlayers.add(sapo);
        serpiente = MediaPlayer.create(this, R.raw.vserpiente);
        mediaPlayers.add(serpiente);
        tarantula = MediaPlayer.create(this, R.raw.vtarantula);
        mediaPlayers.add(tarantula);
        tigre = MediaPlayer.create(this, R.raw.vtigre);
        mediaPlayers.add(tigre);
        tlacuache = MediaPlayer.create(this, R.raw.vtlacuache);
        mediaPlayers.add(tlacuache);
        vaca = MediaPlayer.create(this, R.raw.vvaca);
        mediaPlayers.add(vaca);
        venado = MediaPlayer.create(this, R.raw.vvenado);
        mediaPlayers.add(venado);
        zancudo = MediaPlayer.create(this, R.raw.vzancudo);
        mediaPlayers.add(zancudo);
        zorrillo = MediaPlayer.create(this, R.raw.vzorrillo);
        mediaPlayers.add(zorrillo);
        zorro = MediaPlayer.create(this, R.raw.vzorro);
        mediaPlayers.add(zorro);

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
        // Determina qué botón se ha presionado y reproduce el sonido correspondiente
        switch (view.getId()) {
            case R.id.imageButtonAbeja:
                abeja.start();
                break;
            case R.id.imageButtonAlacran:
                alacran.start();
                break;
            case R.id.imageButtonAraña:
                arana.start();
                break;
            case R.id.imageButtonArdilla:
                ardilla.start();
                break;
            case R.id.imageButtonArmadillo:
                armadillo.start();
                break;
            case R.id.imageButtonBuho:
                buho.start();
                break;
            case R.id.imageButtonCaballo:
                caballo.start();
                break;
            case R.id.imageButtonCangrejo:
                cangrejo.start();
                break;
            case R.id.imageButtonCaracol:
                caracol.start();
                break;
            case R.id.imageButtonCodorniz:
                codorniz.start();
                break;
            case R.id.imageButtonColibri:
                colibri.start();
                break;
            case R.id.imageButtonConejo:
                conejo.start();
                break;
            case R.id.imageButtonCoyote:
                coyote.start();
                break;
            case R.id.imageButtonCucaracha:
                cucaracha.start();
                break;
            case R.id.imageButtonChapulin:
                chapulin.start();
                break;
            case R.id.imageButtonChivo:
                chivo.start();
                break;
            case R.id.imageButtonGallina:
                gallina.start();
                break;
            case R.id.imageButtonGallo:
                gallo.start();
                break;
            case R.id.imageButtonGato:
                gato.start();
                break;
            case R.id.imageButtonGrillo:
                grillo.start();
                break;
            case R.id.imageButtonGusano:
                gusano.start();
                break;
            case R.id.imageButtonHormiga:
                hormiga.start();
                break;
            case R.id.imageButtonIguana:
                iguana.start();
                break;
            case R.id.imageButtonJabali:
                jabali.start();
                break;
            case R.id.imageButtonLagartija:
                lagartija.start();
                break;
            case R.id.imageButtonMariposa:
                mariposa.start();
                break;
            case R.id.imageButtonMosca:
                mosca.start();
                break;
            case R.id.imageButtonOveja:
                oveja.start();
                break;
            case R.id.imageButtonPajaro:
                pajaro.start();
                break;
            case R.id.imageButtonPavo:
                pavo.start();
                break;
            case R.id.imageButtonPerro:
                perro.start();
                break;
            case R.id.imageButtonPez:
                pez.start();
                break;
            case R.id.imageButtonPollo:
                pollo.start();
                break;
            case R.id.imageButtonPuerco:
                puerco.start();
                break;
            case R.id.imageButtonRana:
                rana.start();
                break;
            case R.id.imageButtonRata:
                rata.start();
                break;
            case R.id.imageButtonSapo:
                sapo.start();
                break;
            case R.id.imageButtonSerpiente:
                serpiente.start();
                break;
            case R.id.imageButtonTarantula:
                tarantula.start();
                break;
            case R.id.imageButtonTigre:
                tigre.start();
                break;
            case R.id.imageButtonTlacuache:
                tlacuache.start();
                break;
            case R.id.imageButtonVaca:
                vaca.start();
                break;
            case R.id.imageButtonVenado:
                venado.start();
                break;
            case R.id.imageButtonZancudo:
                zancudo.start();
                break;
            case R.id.imageButtonZorrillo:
                zorrillo.start();
                break;
            case R.id.imageButtonZorro:
                zorro.start();
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Liberar los objetos MediaPlayer en el ArrayList
        for (MediaPlayer mediaPlayer : mediaPlayers) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
        }

        // Limpiar el ArrayList después de liberar los objetos
        mediaPlayers.clear();
    }
}