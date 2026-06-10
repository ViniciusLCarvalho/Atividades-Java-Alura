package PraticandoHerancaPolimorfismoInterfaces;

public class Midia {
    private String titulo;
    private String anoPublicacao;

    public Midia(String t, String aP){
        this.titulo = t;
        this.anoPublicacao = aP;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAnoPublicacao() {
        return anoPublicacao;
    }

    public String gerarCodigo(){
        return "LIB-" + titulo.substring(0,3) + anoPublicacao;
    }
}