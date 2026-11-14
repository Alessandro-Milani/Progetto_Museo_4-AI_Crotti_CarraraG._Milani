import java.util.ArrayList;

public class Sala {
    private int n_sala;
    private int capienzaMax;
    private int capienzaAtt;
    private ArrayList<Opera> opere;



    public Sala(int n_sala, int capienzaMax) {
        this.n_sala = n_sala;  // MAGGIORE 0 controlli
        this.capienzaMax = capienzaMax; //MAGG 0
        this.capienzaAtt = 0;// MAGG 0 e minore capienza
        opere = new ArrayList<Opera>();


    }

    //METODI
    public void aggiungiOpera(Opera opera) {
        this.opere.add(opera);
    }

    public void togliOpera(Opera opera) {
        this.opere.remove(opera);
    }


    //SETTERS
    //HA SENSO CAMBIARE CON IL SET IL TIPO OPERA???

    public void setN_sala(int n_sala) {
        this.n_sala = n_sala;
    }

    public void setCapienza_max(int capienzaMax) {
        this.capienzaMax = capienzaMax;
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
