package Museo;

import java.awt.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Random;

public class Evento {
    private String nome;
    private LocalDateTime inizio;
    private Random random;


    public Evento(String nome, LocalDateTime inizio, LocalDateTime fine) {
        this.nome = Controlli_String.ControllaNomeEvento(nome);
        this.inizio = LocalDateTime.now();
        this.random = new Random();

    }

    public Opera sceltaOperaCas(ArrayList<Sala> listasale) {
        int nSale = listasale.size();
        Sala salacas = listasale.get(random.nextInt(nSale));
        ArrayList<Opera> listaOpere = salacas.getOpere();
        int n_opere = listaOpere.size();
        if (n_opere >= 1) {
            Opera operaCas = listaOpere.get(random.nextInt(n_opere));
            return operaCas;
        } else {
            throw new IllegalArgumentException("non c'erano opere nella sala che potevano essere colpite dall'evento");
        }

    }//FINE PRESA OPERA


    public void furto(ArrayList<Sala> listasale) {

            Opera operaRubata=sceltaOperaCas(listasale);
            //IN CASO SI PUO PRINTARE FARE IL PRINT che avvisa dell'evento






        }


    }
}
