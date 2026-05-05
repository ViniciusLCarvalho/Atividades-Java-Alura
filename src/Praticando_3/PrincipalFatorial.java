package Praticando_3;

import java.util.Scanner;

public class PrincipalFatorial {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int val = x.nextInt();
        int f = 1;
        for(int i = 1; i <= val; i++){
            f *= i;
        }
        System.out.println("O fatorial de "+val+" é: "+f);
        x.close();
    }
}
