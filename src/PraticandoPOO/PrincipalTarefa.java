package PraticandoPOO;

import java.util.ArrayList;
import java.util.List;

public class PrincipalTarefa {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa("Estudar Java", false);
        Tarefa t2 = new Tarefa("Fazer Exercícios", true);

        List<Tarefa> lista = new ArrayList<>();
        lista.add(t1);
        lista.add(t2);

        for (Tarefa t : lista) {
            t.exibir();
        }
    }
}
