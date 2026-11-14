
public final class Controlli {
    public static int controlla_nSala(int nSala) {
        if (nSala > 0) {
            return nSala;
        }
        else {throw new IllegalArgumentException("il numero di sale deve eessere positivo");}
    }

    //CONTROLLO MAX SALA
    public static int controlla_MaxSala(int capienza_max) {
        if (capienza_max > 0 && capienza_max <=100) {
            return capienza_max;
        }
        else {throw new IllegalArgumentException("il numero di opere che può contenere deve essere tra 1 e 100");}
    }


}

//EVENTI TIPO FURTO RESTAURO Ecc...