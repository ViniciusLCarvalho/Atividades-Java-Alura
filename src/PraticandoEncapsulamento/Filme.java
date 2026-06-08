package PraticandoEncapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Integer> avaliacoes;

    public Filme(String titulo){
        this.titulo = titulo;
        this.avaliacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    void adicionarAvaliacao(int nota){
        if (nota >= 1 && nota <= 5) {
            avaliacoes.add(nota);
        } else {
            System.out.println("Nota inválida. Por favor, insira um valor entre 1 e 5.");
        }
    }

    double calcularMedia(){
        int soma = 0;
        for (int nota : avaliacoes) {
            soma += nota;
        }
        return (double) soma / avaliacoes.size();
    }
}
