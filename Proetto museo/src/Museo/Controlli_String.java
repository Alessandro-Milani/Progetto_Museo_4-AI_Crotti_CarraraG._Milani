package Museo;


public final class Controlli_String {

    public static String ControllaNomeAutore(String Nome) {
        Nome = Nome.trim();
        if (Nome.equals("")) {
            Nome = "sconosciuto";
        } else if (Nome.length() < 2 || Nome.length() > 100) {
            throw new IllegalArgumentException();
        }
        return Nome;
    }

    public static String ControllaNomeEvento(String nome){
        nome=nome.trim();
        if (nome.length()<3){
            throw new IllegalArgumentException("il nome deve avere almeno 3 caratteri");
        }
        else {return nome;}
    }


    public static String ControllaStringaObbligatoria(String Valore, String Messaggio) {
        if (Valore == null || Valore.isBlank()) {
            throw new IllegalArgumentException(Messaggio);
        }
        return Valore.trim();
    }
}










