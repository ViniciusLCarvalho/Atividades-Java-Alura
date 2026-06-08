package PraticandoEncapsulamento;

import java.util.Scanner;

public class PrincipalLogins {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int tentativas = 3;
        Logins aluno = new Logins("aluno2026", "escola@123");


        while (tentativas > 0) {
            System.out.println("Digite o seu usuário: ");
            String usuario = x.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = x.nextLine();

            if (aluno.validarSenha(usuario, senha)) {
                System.out.println("Login bem-sucedido");
                break;
            } else {
                tentativas--;
                if (tentativas == 0) {
                    System.out.println("Acesso bloqueado. Contate o administrador.");
                } else {
                    System.out.println("Senha incorreta. Tentativas restantes: "+tentativas);
                }
            }
        }
        x.close();
    }
}
