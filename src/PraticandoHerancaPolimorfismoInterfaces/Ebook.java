package PraticandoHerancaPolimorfismoInterfaces;

public class Ebook extends Midia{
    private String formato;

    public Ebook(String t, String aP, String f){
        super(t, aP);
        this.formato = f;
    }

    public String getFormato() {
        return formato;
    }

    void exibir(){
        System.out.printf("Código: %s | Revista: \" %s \" - Formato: %s\n", gerarCodigo(), getTitulo(), formato);
    }
}
