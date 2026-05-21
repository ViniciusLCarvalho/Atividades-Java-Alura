package PraticandoCondicionais;

public record Numeros(int valor) {
    public String verificaParImpar(){
        return (this.valor % 2 == 0)? "par" : "impar";
    }
}
