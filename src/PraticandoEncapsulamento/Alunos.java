package PraticandoEncapsulamento;

public class Alunos {
    private String nome;
    private int pontos;
    private int nivel;

    public Alunos (String nome){
        this.nome = nome;
        this.pontos = 0;
        this.nivel = 1;
    }

    void gaharPontos(int quant){
        this.pontos += quant;
        atualizarNivel();
    }

    void atualizarNivel(){
        this.nivel = (pontos / 100) + 1;
    }

    void exibirstatus(){
        System.out.printf("Nome: %s\nPontos: %d\nNivel: %d", nome, pontos, nivel);
    }
}
