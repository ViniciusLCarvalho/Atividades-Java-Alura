package PraticandoEncapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisciplina;
    private List<Double> notas;

    public Disciplina(String nome) {
        this.nomeDisciplina = nome;
        this.notas = new ArrayList<>();
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    int contar(){
        return notas.size();
    }

    void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            notas.add(nota);
        } else {
            System.out.println("Nota inválida ignorada: "+nota);
        }
    }

    double calcularMedia(){
        if(notas.isEmpty()) return 0;

        double soma = 0;
        for (double f : notas) {
            soma += f; 
        }
        double media = soma / notas.size();

        return media;
    }
}
