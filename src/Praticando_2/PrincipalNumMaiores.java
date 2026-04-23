package Praticando_2;

import java.util.Scanner;

public class PrincipalNumMaiores {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Insira dois numeros para verificar qual deles é o maior: ");
        Num n = new Num(x.nextInt(), x.nextInt());

        n.verificaNumMaior();
    }
}