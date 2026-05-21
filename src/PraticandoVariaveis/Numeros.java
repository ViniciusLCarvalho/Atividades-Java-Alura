package PraticandoVariaveis;

public record Numeros(int valor) {
    public String parOuImpar(){
        return (this.valor % 2 == 0) ? "par" : "impar";
    }
}
