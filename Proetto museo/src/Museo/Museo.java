package Museo;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.Year;

public class Museo {

    //DATA PERSONALIZZ trovabile dalla doc.            LocalDateTime var = LocalDateTime.of(2026,6,20,15,w30);
    public static void main(String[] args) {
        ArrayList<Sala> listaSale = new ArrayList<>();

        LocalDateTime inizio = LocalDateTime.now();
        LocalDateTime tempoAttuale = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime fineTurno = inizio.plusDays(30);
        boolean esci = false;
        Random random = new Random();

        //CREAZIONE OGG
        try {
            Autore leonardo = new Autore("Leonardo da Vinci", PrimaODopoCristo.Dopo_Cristo, 1452, 1519);
            Autore michelangelo = new Autore("Michelangelo Buonarroti", PrimaODopoCristo.Dopo_Cristo, 1475, 1564);
            Autore caravaggio = new Autore("Caravaggio", PrimaODopoCristo.Dopo_Cristo, 1571, 1610);


            Opera gioconda = new Opera(Year.of(1503), leonardo, "Francia", TipoOpera.Dipinto,
                    "La Gioconda", "OP-001", TipoCorrente.RINASCIMENTO, 100);
            Opera cenacolo = new Opera(Year.of(1498), leonardo, "Milano", TipoOpera.affresco,
                    "L'Ultima Cena", "OP-002", TipoCorrente.RINASCIMENTO, 100);
            Opera vitruviano = new Opera(Year.of(1490), leonardo, "Venezia", TipoOpera.incisione,
                    "L'Uomo vitruviano", "OP-003", TipoCorrente.RINASCIMENTO, 100);

            Opera david = new Opera(Year.of(1504), michelangelo, "Firenze", TipoOpera.scultura,
                    "David", "OP-004", TipoCorrente.RINASCIMENTO, 100);
            Opera pieta = new Opera(Year.of(1499), michelangelo, "Citta' del Vaticano", TipoOpera.scultura,
                    "Pieta'", "OP-005", TipoCorrente.RINASCIMENTO, 100);
            Opera tondoDoni = new Opera(Year.of(1507), michelangelo, "Firenze", TipoOpera.Dipinto,
                    "Tondo Doni", "OP-006", TipoCorrente.RINASCIMENTO, 100);

            Opera canestra = new Opera(Year.of(1599), caravaggio, "Milano", TipoOpera.Dipinto,
                    "Canestra di frutta", "OP-007", TipoCorrente.BAROCCO, 100);
            Opera vocazione = new Opera(Year.of(1600), caravaggio, "Roma", TipoOpera.Dipinto,
                    "Vocazione di San Matteo", "OP-008", TipoCorrente.BAROCCO, 100);
            Opera medusa = new Opera(Year.of(1597), caravaggio, "Firenze", TipoOpera.Dipinto,
                    "Medusa", "OP-009", TipoCorrente.BAROCCO, 100);


            Sala sala1 = new Sala(1, 5);
            Sala sala2 = new Sala(2, 5);
            Sala sala3 = new Sala(3, 5);

            sala1.aggiungiOpera(gioconda);
            sala1.aggiungiOpera(cenacolo);
            sala1.aggiungiOpera(vitruviano);

            sala2.aggiungiOpera(david);
            sala2.aggiungiOpera(pieta);
            sala2.aggiungiOpera(tondoDoni);

            sala3.aggiungiOpera(canestra);
            sala3.aggiungiOpera(vocazione);
            sala3.aggiungiOpera(medusa);

            listaSale.add(sala1);
            listaSale.add(sala2);
            listaSale.add(sala3);

        } catch (IllegalArgumentException e) {
            IO.println("hai fatto un errorino da qualche parte");
        }

        //INIZIO PROG E FINE INIZZ
// OGNI X EVENTO PORTA AVANTI DI x ore e facendo S--_> avanti 12 ore


        //AGGIUNGERE A LOF INIZIO PROGRAMMA
        try {


            while (tempoAttuale.isBefore(fineTurno) && esci == false) {


                boolean passato = false;

                IO.println("\nBENVENUTO NEL PROGRAMMA GESTIONALE DEL MUSEO");
                while (passato == false && esci == false) {

                    IO.print(" \n \n  ORARIO " + tempoAttuale.format(formatter) + "   \n ");

                    String scelta = IO.readln("scegliere ciò che si vuole fare tra:\n 1)visualizzare Sale e CONTENUTo\n 2)  vedere tutti gli eventi caricati dall'avvio del programma\n 3) far PASSARE il tempo  \n 0)ESCI");


                    if (scelta.equals("3")) {
                        String ore_passate_str = IO.readln("quante ore vuoi fare passare da 1 a 24 ");
                        int ore_passate = Integer.parseInt(ore_passate_str);
                        IO.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
                        IO.println("-----------------------RIASSUNTO DELLE ORE----------------------- \n");

                        if (ore_passate >= 1 && ore_passate <= 24) {
                            passato = true;

                            for (int i = 0; i < ore_passate; i++) {

                                int casualitaEvento = random.nextInt(100);
                                if (casualitaEvento >= 1 && casualitaEvento <= 2) {
                                    Evento e1 = new Evento("incendio", tempoAttuale, tempoAttuale.plusHours(5));
                                    e1.danneggiamento(listaSale);
                                    tempoAttuale = tempoAttuale.plusHours(7);
                                    IO.println(tempoAttuale.format(formatter) + "  EVENTO !!!" + e1.getNome());
                                } else if (casualitaEvento >= 3 && casualitaEvento <= 4) {
                                    Evento e2 = new Evento("alluvione", tempoAttuale, tempoAttuale.plusHours(2));
                                    e2.danneggiamento(listaSale);
                                    IO.println(tempoAttuale.format(formatter) + "  EVENTO !!!" + e2.getNome());
                                    tempoAttuale = tempoAttuale.plusHours(2);

                                } else if (casualitaEvento >= 5 && casualitaEvento <= 6) {
                                    Evento e3 = new Evento("furto", tempoAttuale, tempoAttuale.plusHours(1));
                                    e3.rimozione(listaSale);
                                    IO.println(tempoAttuale.format(formatter) + "  EVENTO !!!" + e3.getNome());
                                    tempoAttuale = tempoAttuale.plusHours(1);
                                } else {
                                    IO.println(tempoAttuale.format(formatter) + "   -");
                                }

                                tempoAttuale = tempoAttuale.plusHours(1);

                            }

                        } else {
                            IO.println("LE ORE DEVONO ESSERE COMPRESE TRA 1 e 24");
                        }
                        IO.println("\n----------------------------------------------------------------- \n");
                    }
                    if (scelta.equals("0")) {
                        IO.print("GRAZIE PER AVER USATO IL NOSTRO PROGRAMMA");
                        esci = true;

                    }
                }

            }//FINE CICLO SI


        } catch (IllegalArgumentException e) {
            IO.println("non c'erano abbastanza opere per gli eventi  RIFAI CON piu opere");
        }
    }//FINE TURNO
}