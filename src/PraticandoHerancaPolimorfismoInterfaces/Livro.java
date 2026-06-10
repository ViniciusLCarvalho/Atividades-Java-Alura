package PraticandoHerancaPolimorfismoInterfaces;

public class Livro extends Midia{
    private String autor;

    public Livro (String t, String aP, String a){
        super(t, aP);
        this.autor = a;
    }

    public String getAutor() {
        return autor;
    }

    void exibir(){
        System.out.printf("Código: %s | Livro: \" %s \" - Autor: %s\n", gerarCodigo(), getTitulo(), autor);
    }
}
