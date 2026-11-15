package Museo;


import java.time.Year;

public class Opera {
    private Year anno;
    private Autore autore;
    private String provenienza;
    private TipoOpera tipologia;
    private String titolo;
    private String idOpera;
    private TipoCorrente corrente;
    private int gradazione;

    public Opera(Year anno, Autore autore, String provenienza, TipoOpera tipologia,
                 String titolo, String idOpera, TipoCorrente corrente, int gradazione) {
        setAnno(anno);
        setAutore(autore);
        setProvenienza(provenienza);
        setTipologia(tipologia);
        setTitolo(titolo);
        setIdOpera(idOpera);
        setCorrente(corrente);
        this.gradazione=Controlli_Int.controlla_gradazione(gradazione);
    }

    public Year getAnno() {
        return anno;
    }
    public int getGradazione() {
        return gradazione;
    }

    public Autore getAutore() {
        return autore;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public TipoOpera getTipologia() {
        return tipologia;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getIdOpera() {
        return idOpera;
    }

    public TipoCorrente getCorrente() {
        return corrente;
    }

    public final void setAnno(Year anno) {
        this.anno = Controlli_Year.ControllaAnnoObbligatorio(anno);
    }

    public void setGradazione(int gradazione){
        Controlli_Int.controlla_gradazione(gradazione);
        this.gradazione=gradazione;
    }

    public final void setAutore(Autore autore) {
        if (autore == null) {
            throw new IllegalArgumentException("L'autore non può essere null");
        }
        this.autore = autore;
    }

    public final void setProvenienza(String provenienza) {
        this.provenienza = Controlli_String.ControllaStringaObbligatoria(provenienza, "La provenienza non può essere vuota");
    }

    public final void setTipologia(TipoOpera tipologia) {
        if (tipologia == null) {
            throw new IllegalArgumentException("La tipologia non può essere null");
        }
        this.tipologia = tipologia;
    }

    public final void setTitolo(String titolo) {
        this.titolo = Controlli_String.ControllaStringaObbligatoria(titolo, "Il titolo non può essere vuoto");
    }

    public final void setIdOpera(String idOpera) {
        this.idOpera = Controlli_String.ControllaStringaObbligatoria(idOpera, "L'ID opera non può essere vuoto");
    }

    public final void setCorrente(TipoCorrente corrente) {
        if (corrente == null) {
            throw new IllegalArgumentException("La corrente non può essere null");
        }
        this.corrente = corrente;
    }

    @Override
    public String toString() {
        return "[" + idOpera + "] " + titolo + " (" + anno + ") - " + autore
                + " | " + tipologia + " | " + corrente + " | " + provenienza;
    }
}
