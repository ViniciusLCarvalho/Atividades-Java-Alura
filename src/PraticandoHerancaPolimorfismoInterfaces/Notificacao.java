package PraticandoHerancaPolimorfismoInterfaces;

public class Notificacao {
    protected String destinatario;
    protected String mensagem;

    public Notificacao(String dest, String msg){
        this.destinatario = dest;
        this.mensagem = msg;
    }

    void enviar(){};
}
