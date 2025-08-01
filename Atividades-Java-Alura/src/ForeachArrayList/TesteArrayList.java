package ForeachArrayList;

import java.util.ArrayList;

public class TesteArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> listaDeObjetos = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            listaDeObjetos.add("Objeto"+ i);
        }

        for (String item : listaDeObjetos) {
            System.out.println(item);            
        }
    }
}
