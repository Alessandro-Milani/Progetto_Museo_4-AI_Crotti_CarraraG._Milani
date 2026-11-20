package Museo;

import java.util.ArrayList;

public class Sala {
    private int n_sala;
    private int capienzaMax;

    private ArrayList<Opera> opere;


    public Sala(int n_sala, int capienzaMax) {
        this.n_sala = Controlli_Int.controlla_nSala(n_sala);
        opere = new ArrayList<Opera>();

        this.capienzaMax = Controlli_Int.controlla_MaxSala(capienzaMax,opere.size());



    }

    //METODI
    public void aggiungiOpera(Opera opera) {
        if (this.opere.size() >= this.capienzaMax) {
            throw new IllegalStateException("la SALA è PIENA, non puoi mettere altre opere");
        } else {
            this.opere.add(opera);

        }
    }

    public void togliOpera(Opera opera) {
        if (this.opere.size() <= 0) {
            throw new IllegalStateException("la SALA è già VUOTA  non puoi togliere opere che non ci sono");
        } else {
            if (this.opere.contains(opera)){
                this.opere.remove(opera);}

            else {throw new IllegalArgumentException("l'opera che hai scritto deve essere già presente in sala per farla rimuovere");}
        }
    }


    //SETTERS
    //HA SENSO CAMBIARE CON IL SET IL TIPO OPERA???

    public void setN_sala(int n_sala) {
        this.n_sala = Controlli_Int.controlla_nSala(n_sala);
    }

    public void setCapienza_max(int capienzaMax) {
        this.capienzaMax = Controlli_Int.controlla_MaxSala(capienzaMax,opere.size());
    }
    //SET CAPIENZA ATTUALE NON HA SENSO PK é IL COUNT DELLA LISTA


    public ArrayList<Opera> getOpere() {
        return this.opere;
    }

    public int getN_sala() {
        return this.n_sala;
    }

    public int getCapienzaMax() {
        return this.capienzaMax;
    }



    @Override
    public String toString() {

        String testo = " numero sala: " + this.n_sala
                + "\n capienza attuale: " + opere.size()
                + "\n capienza massima: " + this.capienzaMax + "\n";

        for (int i = 0; i < opere.size(); i++) {
            testo = testo + " " + (i+1)+") "+opere.get(i).getIdOpera() + " - " +opere.get(i).getTitolo() + "\n";
        }

        return testo;

        //FARE QUI IL RAGIONAMENTO PER STAMPARE CON IL FOR LE OPERE (il loro nome) CONTENUTE



    }
}