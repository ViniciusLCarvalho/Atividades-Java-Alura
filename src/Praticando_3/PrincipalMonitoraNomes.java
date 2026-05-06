package Praticando_3;

import java.util.Scanner;

public class PrincipalMonitoraNomes {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String nome;
        do {
            System.out.println("Digite seu nome: ");
            nome = x.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido. Digite novamente.");
            }
        } while(nome.length() < 3);
            System.out.println("Nome \""+ nome+"\" cadastrado com sucesso!");
            x.close();
    }
}
