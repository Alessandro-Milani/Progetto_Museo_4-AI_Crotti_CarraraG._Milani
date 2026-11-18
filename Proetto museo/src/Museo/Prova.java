package Museo;
import java.time.LocalDateTime;
public class Prova {
    public static void main(String[] args){

        Autore autore1 = new Autore("Alberto", PrimaODopoCristo.Dopo_Cristo,400,0);
        IO.println(autore1.toString());

        // 1. Data e ora correnti di sistema
        LocalDateTime adesso = LocalDateTime.now();

        // 2. Data e ora specifiche (anno, mese, giorno, ora, minuti, secondi)
        LocalDateTime specifica = LocalDateTime.of(2015, 4, 18, 15, 48, 30);


        Log log = new Log();
        log.AggiungiEvento("Restauro2", adesso);
        log.AggiungiEvento("Incendio", specifica);
        IO.println(log.toString());

    }
}
