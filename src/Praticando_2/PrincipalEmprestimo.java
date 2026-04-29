package Praticando_2;

import java.util.Scanner;

public class PrincipalEmprestimo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo: ");
        Emprestimo e= new Emprestimo(x.nextInt());
        e.verificaIntervaloValor();
        x.close();
    }
}
