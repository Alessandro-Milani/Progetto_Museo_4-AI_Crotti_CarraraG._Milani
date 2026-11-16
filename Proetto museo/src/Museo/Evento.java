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
    private LocalDateTime fine;


    public Evento(String nome, LocalDateTime inizio, LocalDateTime fine) {
        this.nome = Controlli_String.ControllaNomeEvento(nome);
        this.inizio =inizio;
        this.random = new Random();
        this.fine=fine;

    }

    public Opera rimozione(ArrayList<Sala> listasale) {
        int nSale = listasale.size();
        Sala salacas = listasale.get(random.nextInt(nSale));
        ArrayList<Opera> listaOpere = salacas.getOpere();
        int n_opere = listaOpere.size();
        if (n_opere >= 1) {
            Opera operaCas = listaOpere.get(random.nextInt(n_opere));
            listaOpere.remove(operaCas);
            return operaCas;
        } else {
            throw new IllegalArgumentException("non c'erano opere nella sala che potevano essere colpite dall'evento");
        }


    }//FINE PRESA OPERA


    public void danneggiamento(ArrayList<Sala> listasale) {
        int nSale = listasale.size();
        Sala salacas = listasale.get(random.nextInt(nSale));
        ArrayList<Opera> listaOpere = salacas.getOpere();
        int n_opere = listaOpere.size();
        if (n_opere >= 1) {
            for (int i = listaOpere.size() - 1; i >= 0; i--){ //mi andava in crash ce un opera si eliminava
                Opera opera = listaOpere.get(i);
                int bruciatura = random.nextInt(50);
                int gradazione_att = opera.getGradazione() - bruciatura;

                if (gradazione_att <= 0) {
                    listaOpere.remove(opera);}
                else{opera.setGradazione(gradazione_att);}
            }
        } else {
            throw new IllegalArgumentException("non c'erano opere nella sala che potevano essere colpite dall'evento");
        }
    }
    public String getNome(){
        return this.nome;
    }


















    }







