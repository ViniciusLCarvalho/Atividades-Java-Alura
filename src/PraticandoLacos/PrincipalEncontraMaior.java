package PraticandoLacos;

import java.util.Scanner;

public class PrincipalEncontraMaior {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("Digite os numeros separados por espaço: ");
        String[] numeros = x.nextLine().split(" ");
        int maior = Integer.MIN_VALUE;

        for (String num : numeros) {
            int n = Integer.parseInt(num);
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("O maior número é: "+ maior);
        x.close();
    }
}
