package PraticandoHerancaPolimorfismoInterfaces;

public class Aluno {
    private String nome, tipo;

    public Aluno(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    void identificar(){
        System.out.printf("Aluno: %s - Tipo: %s\n", nome, tipo);
    }
}
