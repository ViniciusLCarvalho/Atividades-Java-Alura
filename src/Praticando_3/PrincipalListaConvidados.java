package Praticando_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalListaConvidados {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<String> convidados = new ArrayList<>();
        String entrada;

        while (true) {
            System.out.println("|------|------------------------|");
            System.out.println("|C.M.D | Description            |");
            System.out.println("|------|------------------------|");
            System.out.println("|'ver' | Para visualizar a lista|");
            System.out.println("|'sair'| Para terminar          |");
            System.out.println("|------|------------------------|");
            System.out.println("|  Digite o nome do convidado   |");
            System.out.println("|-------------------------------|");
            entrada = x.nextLine().trim();

            if (entrada.equalsIgnoreCase("ver")) {
                System.out.println("Lista atualizada de convidados: "+ convidados);
            }
            
            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Programa finalizado");
                break;
            }

            boolean existe = false;
            for (String item : convidados) {
                if (item.toLowerCase().equals(entrada.toLowerCase())) {
                    existe = true;
                    break;
                }
            }

            if (existe) {
                System.out.println("O nome "+ entrada +"já existe na lista de convidados.");
            } else {
                convidados.add(entrada);
                System.out.println(entrada+" foi adicionado à lista de convidados.");
            }
        }
        x.close();
    }
}
