package Museo;


public final class Controlli_String { // final = non ereditabile

    public static String ControllaNomeAutore(String Nome){
        Nome=Nome.trim();
        if (Nome.equals("")){
            Nome="sconosciuto";

        } else if (Nome.length()<2 || Nome.length()>100) {
            throw new IllegalArgumentException();
        }
        return Nome;
    }



















}
