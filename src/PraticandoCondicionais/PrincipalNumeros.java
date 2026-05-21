package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para determinar se é par ou impar:");
        Numeros n = new Numeros(in.nextInt());
        in.close();
        System.out.println("O número é "+n.verificaParImpar());

    }
}