package Praticando_3;

import java.util.Scanner;

public class PrincipalDegraus {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite a quantidade de degraus: ");
        int degraus = x.nextInt();

        for (int i = 1; i <= degraus; i++) {
            System.out.println("Subindo o degrau "+i);
        }

        System.out.println("Você chegou ao topo!");
        x.close();
    }
}
