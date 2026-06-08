package PraticandoEncapsulamento;

public class Logins {
    private String login;
    private String senha;

    public Logins(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    boolean validarSenha(String login, String senha){
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
