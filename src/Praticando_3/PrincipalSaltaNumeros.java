package Praticando_3;

import java.util.Scanner;

public class PrincipalSaltaNumeros {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int limite = x.nextInt();
        
        for(int i = 1; i <= limite; i++){
            if ((i%10) == 5) {
                continue;
            }
            System.out.print(i+" ");
        }
        x.close();
    }
}
