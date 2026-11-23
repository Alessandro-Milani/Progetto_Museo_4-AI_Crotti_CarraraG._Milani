package Museo;

import java.time.Year;
import java.util.ArrayList;
import java.util.Random;

public class Prova {
    public static void main(String[] args){



















































































































































































































































































        ArrayList<Sala> listaSale = new ArrayList<>();

        Random random = new Random();

        Autore leonardo = new Autore("Leonardo da Vinci", PrimaODopoCristo.Dopo_Cristo, 1452, 1519);
        Autore michelangelo = new Autore("Michelangelo Buonarroti", PrimaODopoCristo.Dopo_Cristo, 1475, 1564);
        Autore caravaggio = new Autore("Caravaggio", PrimaODopoCristo.Dopo_Cristo, 1571, 1610);


        Opera gioconda = new Opera(Year.of(1503), leonardo, "Francia", TipoOpera.PITTURA,
                "La Gioconda", "OP-001", TipoCorrente.RINASCIMENTO, 100);
        Opera cenacolo = new Opera(Year.of(1498), leonardo, "Milano", TipoOpera.AFFRESCO,
                "L'Ultima Cena", "OP-002", TipoCorrente.RINASCIMENTO, 100);
        Opera vitruviano = new Opera(Year.of(1490), leonardo, "Venezia", TipoOpera.INCISIONE,
                "L'Uomo vitruviano", "OP-003", TipoCorrente.RINASCIMENTO, 100);

        Opera david = new Opera(Year.of(1504), michelangelo, "Firenze", TipoOpera.SCULTURA,
                "David", "OP-004", TipoCorrente.RINASCIMENTO, 100);
        Opera pieta = new Opera(Year.of(1499), michelangelo, "Citta' del Vaticano", TipoOpera.SCULTURA,
                "Pieta'", "OP-005", TipoCorrente.RINASCIMENTO, 100);
        Opera tondoDoni = new Opera(Year.of(1507), michelangelo, "Firenze", TipoOpera.PITTURA,
                "Tondo Doni", "OP-006", TipoCorrente.RINASCIMENTO, 100);

        Opera canestra = new Opera(Year.of(1599), caravaggio, "Milano", TipoOpera.PITTURA,
                "Canestra di frutta", "OP-007", TipoCorrente.BAROCCO, 100);
        Opera vocazione = new Opera(Year.of(1600), caravaggio, "Roma", TipoOpera.PITTURA,
                "Vocazione di San Matteo", "OP-008", TipoCorrente.BAROCCO, 100);
        Opera medusa = new Opera(Year.of(1597), caravaggio, "Firenze", TipoOpera.PITTURA,
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

        /*
        ArrayList<Opera> Lista_Opere_1 = sala1.getOpere();
        ArrayList<Opera> Lista_Opere_2 = sala2.getOpere();
        ArrayList<Opera> Lista_Opere_3 = sala3.getOpere();
        */

        String Scelta = "a";
        while(!Scelta.equals("0")){
            IO.println("---------------MUSEO----------------");
            IO.println("1 - Visualizza Sala");
            IO.println("2 - Visualizza Eventi");
            IO.println("3 - Vai avanti");
            IO.println("0 - Esci");
            IO.println("------------------------------------");
            Scelta = IO.readln("Quale scegli? ");

            if (Scelta.equals("1")){

                int Num_sale = listaSale.size();

                for (int i = 0; i < Num_sale; i++) {

                    IO.println(listaSale.get(i));

                }

                int Scelta_Sala = Integer.parseInt(IO.readln("Quale sala scegli? "));

                if (Scelta_Sala < 1 || Scelta_Sala > Num_sale) {

                    IO.println("Sala inesistente");

                } else {

                    Sala Sala_Scelta = listaSale.get(Scelta_Sala - 1);

                    IO.println(Sala_Scelta);

                    ArrayList<Opera> opere = Sala_Scelta.getOpere();

                    if (opere.isEmpty()) {

                        IO.println("Nessuna opera in questa sala");

                    } else {

                        for (int i = 0; i < opere.size(); i++) {

                            IO.println((i + 1) +" - "+ opere.get(i));

                        }

                        String Restaura = IO.readln("Vuoi restaurare un'opera? (s/n) ");

                        if (Restaura.equalsIgnoreCase("s")) {

                            int Scelta_Opera = Integer.parseInt(IO.readln("Quale opera? "));

                            if (Scelta_Opera < 1 || Scelta_Opera > opere.size()) {

                                IO.println("Opera inesistente");

                            } else {

                                Opera Opera_Scelta = opere.get(Scelta_Opera - 1);

                                Evento restauro = new Evento("Restauro", java.time.LocalDateTime.now(), java.time.LocalDateTime.now());

                                restauro.Restauro(Opera_Scelta);

                                IO.println("Restaurata! Nuova gradazione di " + Opera_Scelta.getTitolo() + ": " + Opera_Scelta.getGradazione() + "/100");

                            }

                        }

                    }

                }

            }

            if(Scelta.equals("2")){

            }
            if(Scelta.equals("3")){

            }
            if (Scelta.equals("0")){
                IO.println("Fine");
            }

        }

    }
}
