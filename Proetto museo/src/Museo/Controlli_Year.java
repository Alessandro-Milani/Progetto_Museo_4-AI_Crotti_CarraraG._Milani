package Museo;

import java.time.Year;

public final class Controlli_Year {

    public static Year ControllaAnno(Year Anno) {
        if (Anno == null || Anno.getValue() == 0) {
            return null;
        }
        return ControllaAnnoNonFuturo(Anno);
    }

    public static Year ControllaAnnoNonFuturo(Year Anno) {
        if (Anno.isAfter(Year.now())) {
            throw new IllegalArgumentException("L'anno dell'opera non può essere nel futuro");
        }
        return Anno;
    }

    public static Year ControllaAnnoObbligatorio(Year Anno) {
        if (Anno == null) {
            throw new IllegalArgumentException("L'anno non può essere null");
        }
        return ControllaAnnoNonFuturo(Anno);
    }
}