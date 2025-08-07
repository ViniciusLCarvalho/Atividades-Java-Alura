package ListaTitulo;

import java.util.*;

public class TesteListaTitulo {
    public static void main(String[] args) {
        List<Titulo> listaTitulo = new ArrayList<>();

        listaTitulo.add(new Titulo("Senhor dos aneis"));
        listaTitulo.add(new Titulo("Interestelar"));
        listaTitulo.add(new Titulo("Matrix"));
        listaTitulo.add(new Titulo("V de Vingança"));

        Collections.sort(listaTitulo);

        for (Titulo t : listaTitulo) {
            System.out.println(t.getNome());
        }
    }
}
