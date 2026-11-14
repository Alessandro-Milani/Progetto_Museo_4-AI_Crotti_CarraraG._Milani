package Museo;

public final class Controlli_Int {

    private static int cod_personale = 123456;

    public static void Controla_codice(int Codice){
        if (Codice != cod_personale){
            throw new IllegalArgumentException();
        }
    }



}
