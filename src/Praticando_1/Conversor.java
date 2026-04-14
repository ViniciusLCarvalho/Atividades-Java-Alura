package Praticando_1;

public record Conversor(int celsius) {

    public double conversor(){
        return (this.celsius * 9/5) + 32;
    }
}
