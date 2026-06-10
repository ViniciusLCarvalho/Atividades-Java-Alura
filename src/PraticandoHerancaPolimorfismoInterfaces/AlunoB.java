package PraticandoHerancaPolimorfismoInterfaces;

public class AlunoB extends Pessoa {
    private double nota;

    public AlunoB(String nome, int idade, Double nota){
        super(nome, idade);
        this.nota = nota;
    }

    public void exibir(){
        System.out.printf("Aluno: %s - Idade: %d - Nota: %.1f", getNome(), getIdade(), nota);
    }
}
