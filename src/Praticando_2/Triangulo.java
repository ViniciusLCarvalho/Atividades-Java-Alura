package Praticando_2;

public record Triangulo(int lado1, int lado2, int lado3) {
    public void calculaTriangulo(){
        
        boolean oneLados = (this.lado3 + this.lado1) > this.lado2;
        boolean twoLados = (this.lado1 + this.lado2) > this.lado3;
        boolean threeLados = (this.lado2 + this.lado3) > this.lado1;

        if (oneLados && twoLados && threeLados) {
            System.out.println("Os lados podem formar um triangulo");
        } else {
            System.out.println("Os lados não podem formar um triangulo");
        }
    }
}
