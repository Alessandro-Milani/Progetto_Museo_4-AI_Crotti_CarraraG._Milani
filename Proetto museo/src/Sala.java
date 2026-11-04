import java.util.ArrayList;

public class Sala {
    private int n_sala;
    private int capienza_max;
    private int capienza_att;
    private ArrayList<Opera> opere;

    Sala(int n_sala, int capienza_max){
        this.n_sala=n_sala;
        this.capienza_max=capienza_max;
        this.capienza_att=capienza_att;
        opere=new ArrayList<>();
    }

    @Override
    public String toString(){
        return " numero sala: "+this.n_sala+ "\n capienza attuale: "+this.capienza_att+ "\n capienza massima: "+this.capienza_max;
        //FARE QUI IL RAGIONAMENTO PER STAMPARE CON IL FOR LE OPERE (il loro nome) CONTENUTE
    }
}
