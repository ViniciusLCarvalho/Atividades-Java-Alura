package CalculadoraSalaRetangular;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    
    @Override
    public void calcularArea(double altura, double largura){
        double area;
        area = altura * largura;
        System.out.println("Area: "+area+" m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura){
        double perimetro;
        perimetro = 2 * (altura + largura);
        System.out.println("Perimetro: "+perimetro+" cm");
    }
}
