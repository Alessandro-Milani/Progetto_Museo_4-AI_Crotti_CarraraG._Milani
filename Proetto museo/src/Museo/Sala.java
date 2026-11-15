package Museo;

import java.util.ArrayList;

public class Sala {
    private int n_sala;
    private int capienzaMax;
    private int capienzaAtt;
    private ArrayList<Opera> opere;


    public Sala(int n_sala, int capienzaMax) {
        this.n_sala = Controlli.controlla_nSala(n_sala);
        this.capienzaMax = Controlli.controlla_MaxSala(capienzaMax,capienzaAtt);
        this.capienzaAtt = 0;
        opere = new ArrayList<Opera>();


    }

    //METODI
    public void aggiungiOpera(Opera opera) {
        if (this.opere.size() >= this.capienzaMax) {
            throw new IllegalStateException("la SALA è PIENA, non puoi mettere altre opere");
        } else {
            this.opere.add(opera);
            this.capienzaAtt+=1;
        }
    }

    public void togliOpera(Opera opera) {
        if (this.opere.size() <= 0) {
            throw new IllegalStateException("la SALA è già VUOTA  non puoi togliere opere che non ci son");
        } else {
            if (this.opere.contains(opera)){
            this.opere.remove(opera);
            this.capienzaAtt-=1;}
            else {throw new IllegalArgumentException("l'opera che hai scritto deve essere già presente in sala per farla rimuovere");}
        }
    }


    //SETTERS
    //HA SENSO CAMBIARE CON IL SET IL TIPO OPERA???

    public void setN_sala(int n_sala) {
        this.n_sala = Controlli.controlla_nSala(n_sala);
    }

    public void setCapienza_max(int capienzaMax) {
        this.capienzaMax = Controlli.controlla_MaxSala(capienzaMax,capienzaAtt);
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

    public int getCapienzaAtt() {
        return this.capienzaAtt;
    }

    @Override
    public String toString() {
        return " numero sala: " + this.n_sala + "\n capienza attuale: " + this.capienzaAtt + "\n capienza massima: " + this.capienzaMax;
        //FARE QUI IL RAGIONAMENTO PER STAMPARE CON IL FOR LE OPERE (il loro nome) CONTENUTE
    }
}
