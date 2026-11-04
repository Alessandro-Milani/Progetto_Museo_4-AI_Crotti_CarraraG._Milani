import java.time.Year;

public class Opera {
    private Year anno;
    private Autore Autore;
    private String Provenienza;
    private TipoOpera Tipologia;
    private String Titolo;
    private String ID_Opera;
    private TipoCorrente Corrente;

    Opera(Year Anno, Autore Autore, String Proveienza, TipoOpera Tipologia, String Titolo, String ID_Opera, TipoCorrente Corrente){
        this.Autore=Autore;
        this.Provenienza=Proveienza;
        this.Tipologia=Tipologia;
        this.Titolo=Titolo;
        this.ID_Opera=ID_Opera;
        this.Corrente=Corrente;
    }
}
