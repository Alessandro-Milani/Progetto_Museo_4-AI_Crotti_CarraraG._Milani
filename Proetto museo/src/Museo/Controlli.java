package Museo;
import java.time.Year;

public final class Controlli { // final = non ereditabile

    public static String ControllaNomeAutore(String Nome){
        Nome=Nome.trim();
        if (Nome.equals("")){
            Nome="sconosciuto";

        } else if (Nome.length()<2 || Nome.length()>100) {
            throw new IllegalArgumentException();
        }
        return Nome;
    }



    public static Year ControllaAnno(Year Anno){
        if (Anno == null || Anno.getValue() == 0) {
            return null;
        }
        Year annoAttuale = Year.now();
        if (Anno.isAfter(annoAttuale)) {
            throw new IllegalArgumentException();
        }

        return Anno;
    }















}
