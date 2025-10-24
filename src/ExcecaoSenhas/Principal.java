package ExcecaoSenhas;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String password = null;
        
        System.out.println("Digite sua senha :");
        password = x.nextLine();
        x.close();
        try {
            validarSenha(password);
            System.out.println("Senha válida. Acesso permitido");
        } catch (SenhaInvalidaException e) {
            System.out.println("Erro | "+e.getMessage());
        }
    }

    public static void validarSenha(String senha){
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
