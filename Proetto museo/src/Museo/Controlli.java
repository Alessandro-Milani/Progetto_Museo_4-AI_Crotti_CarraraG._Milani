package Museo;

public final class Controlli {
    public static int controlla_nSala(int nSala) {
        if (nSala > 0 && nSala<100) {
            return nSala;
        }
        else {throw new IllegalArgumentException("il numero di sale deve eessere positivo");}
    }

    //CONTROLLO MAX SALA
    public static int controlla_MaxSala(int capienza_max,int capienza_att) {
        if (capienza_max >= capienza_att  && capienza_max <=100) {
            return capienza_max;
        }
        else {throw new IllegalArgumentException("il numero di opere che può contenere deve essere tra il numero di opere attuali i sala e e 100");}
    }


}

//EVENTI TIPO FURTO RESTAURO Ecc...