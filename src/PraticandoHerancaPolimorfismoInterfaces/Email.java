package PraticandoHerancaPolimorfismoInterfaces;

public class Email extends Notificacao {
    private String assunto;

    public Email(String dest, String msg, String assunto) {
        super(dest, msg);
        this.assunto = assunto;
    }
    
    @Override
    void enviar() {
        System.out.printf("\nEnviando Email para: %s\nAssunto: %s\nCorpo: %s\n", destinatario, assunto, mensagem);
    }
}
