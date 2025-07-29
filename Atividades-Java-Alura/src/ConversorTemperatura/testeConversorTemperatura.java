package ConversorTemperatura;

public class testeConversorTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao converte = new ConversorTemperaturaPadrao();

        converte.celsiusParaFahrenheit(21.5);
        converte.celsiusParaFahrenheit(54.5);
    }
}
