package Praticando_3;

import java.util.Scanner;

public class PrincipalContandoNumeros {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int p = 0;
        int n = 0;
        while (true) {
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            String entrada = x.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            int num = Integer.parseInt(entrada);

            if (num > 0) {
                p++;
            } else {
                n++;
            }
        }
        System.out.println("Números positivos: "+p);
        System.out.println("Números negativos: "+n);

        x.close();
    }
}
