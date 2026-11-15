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

    public static String ControllaNomeEvento(String nome){
        nome=nome.trim();
        if (nome.length()<=3){
            throw new IllegalArgumentException("il nome deve avere almeno 3 caratteri");
        }
        else {return nome;}
    }



















}
