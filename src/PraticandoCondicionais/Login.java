package PraticandoCondicionais;

public record Login(int senha) {
    public String verificaSenha(){
        int senhaBD = 123456;

        return (senhaBD == this.senha) ? "permitido!" : "negado!";
    }
}
