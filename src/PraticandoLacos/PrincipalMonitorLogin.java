package PraticandoLacos;

import java.util.Scanner;

public class PrincipalMonitorLogin {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        final String senha = "1234";
        for(int i = 3; i > 0; i--){
            System.out.println("Digite sua senha: ");
            int psw = x.nextInt();
            if (psw == Integer.parseInt(senha)) {
                System.out.println("Senha correta! Acesso concedido!");
                break;
            } else if (i > 1){
                System.out.println("Senha incorreta. Você tem mais "+(i - 1)+" tentativas restantes.");
            } else {
                System.out.println("Conta bloqueada temporariamente");
            }
        }
        x.close();
    }
}
