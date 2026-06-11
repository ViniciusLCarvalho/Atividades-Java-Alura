package PraticandoHerancaPolimorfismoInterfaces;

public class Sms extends Notificacao {

    public Sms(String dest, String msg) {
        super(dest, msg);
    }
    
    @Override
    void enviar() {
        System.out.printf("\nEnviando SMS para: %s\nMensagem: %s\n", destinatario, mensagem);
    }
}
