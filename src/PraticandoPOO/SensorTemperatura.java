package PraticandoPOO;

public record SensorTemperatura(String local, double tempAtual) {
    void exibirRelatorio(){
        System.out.println("Sensor no local: "+this.local);
        System.out.printf("Temperatura: %.1f ºC\n", this.tempAtual);
        
        if (this.tempAtual > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
