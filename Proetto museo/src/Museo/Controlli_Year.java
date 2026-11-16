package Museo;

import java.time.Year;

public final class Controlli_Year {

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
