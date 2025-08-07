package ImplementacoesDeListasDiferentes;

import java.util.*;

public class TesteDiferentesListas {
    public static void main(String[] args) {
        //List<String> listaArray = new ArrayList<>();
        //List<String> listaLinked = new LinkedList<>();
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " +listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: "+ listaPolimorfica);


        //listaArray.add("1");
        //listaArray.add("2");
        //listaLinked.add("A");
        //listaLinked.add("B");

        //System.out.println("ArrayList: "+ listaArray);
        //System.out.println("LinkedList: "+ listaLinked);

        //for (int i = 0; i < listaLinked.size(); i++){
        //    System.out.println("Índice " + i + ": " + listaLinked.get(i));
        //}
    }
}
