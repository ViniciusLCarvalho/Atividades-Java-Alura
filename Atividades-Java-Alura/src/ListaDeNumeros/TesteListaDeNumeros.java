package ListaDeNumeros;

import java.util.*;

public class TesteListaDeNumeros {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> listaNumeros = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            listaNumeros.add(r.nextInt(101));
        }

        Collections.sort(listaNumeros);

        System.out.println("Lista ordenada: " +listaNumeros);
    }
}
