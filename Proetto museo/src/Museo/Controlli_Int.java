package Museo;

public final class Controlli_Int {

    private static int cod_personale = 123456;

    public static void Controla_codice(int Codice){
        if (Codice != cod_personale){
            throw new IllegalArgumentException();
        }
    }

        public static int controlla_gradazione(int gradazione) {
            if (gradazione >= 1 && gradazione <= 100) {
                return gradazione;
            }
            else {throw new IllegalArgumentException("la gradazione dell'opera deve essere tra 1 e 100");}
        }



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





