package Museo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Log {
    private HashMap<String, LocalDateTime> RaccoltaEventi;

    Log (){
        RaccoltaEventi = new HashMap<>();
    }

    public void AggiungiEvento(String Evento, LocalDateTime OraInizio){
        RaccoltaEventi.put(Evento,OraInizio);
    }

    @Override
    public String toString (){
        String Testo="";
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        for (String key : RaccoltaEventi.keySet()) {
            Testo += key + ": " + RaccoltaEventi.get(key).format(formato) + "\n";
        }

        return Testo;



    }

}
