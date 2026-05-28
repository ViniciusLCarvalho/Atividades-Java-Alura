package PraticandoPOO;

public record Alunos(String nome, double nota1, double nota2) {
    void calculaMedia(){
        double m = (this.nota1 + this.nota2) / 2;
        System.out.println("Aluno: "+this.nome);
        System.out.printf("Nota 1: %.1f\n",this.nota1);
        System.out.printf("Nota 2: %.1f\n",this.nota2);
        System.out.printf("Média: %.1f\n",m);
        if (m >= 7) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
