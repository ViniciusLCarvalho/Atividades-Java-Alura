package Praticando_2;

public record Login(int senha) {
    public String verificaSenha(){
        int senhaBD = 123456;

        return (senhaBD == this.senha) ? "permitido!" : "negado!";
    }
}
