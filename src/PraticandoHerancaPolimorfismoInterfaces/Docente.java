package PraticandoHerancaPolimorfismoInterfaces;

public class Docente extends Pessoa{
    private String disciplina;

    public Docente (String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibir(){
        System.out.printf("Docente: %s - Idade: %d - Disciplina: %s", getNome(), getIdade(), disciplina);
    }
}
