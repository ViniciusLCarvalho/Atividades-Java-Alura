package PraticandoEncapsulamento;

public class Usuario {
    private String senha;

    public Usuario(String senha){
        this.senha = senha;
    }

    public void setSenha(String senhaAtu, String novaSenha) {
        if (this.senha.equals(senhaAtu)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta. A senha não foi alterada");
        }
    }
}
