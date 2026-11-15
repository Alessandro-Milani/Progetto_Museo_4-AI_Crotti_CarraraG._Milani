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

    public static String ControllaStringaObbligatoria(String Valore, String Messaggio) {
        if (Valore == null || Valore.isBlank()) {
            throw new IllegalArgumentException(Messaggio);
        }
        return Valore.trim();
    }
}
