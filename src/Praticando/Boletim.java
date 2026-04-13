package Praticando;

public record Boletim(double nota1, double nota2, double nota3) {

    public double calculaMédia(){
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }
}
