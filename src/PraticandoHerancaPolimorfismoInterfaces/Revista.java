package PraticandoHerancaPolimorfismoInterfaces;

public class Revista extends Midia{
    private int edicao;

    public Revista(String t, String aP, int e){
        super(t, aP);
        this.edicao = e;
    }

    public int getEdicao() {
        return edicao;
    }

    void exibir(){
        System.out.printf("Código: %s | Revista: \" %s \" - Edição: %d\n", gerarCodigo(), getTitulo(), edicao);
    }
}
