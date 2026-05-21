package PraticandoCondicionais;

import java.util.Scanner;

public class PrincipalLogin {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite sua senha:");
        Login l = new Login(x.nextInt());
        x.close();
        System.out.println("Acesso "+l.verificaSenha());

    }
}
