package ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double temp){
        double f;

        // F = (C x 1,8) + 32

        f = (temp * 1.8) + 32;

        System.out.println("Celsisus: "+temp+" Para Fahrenheit: "+f);
    }

    @Override
    public void fahrenheitParaCelsius(double temp) {
        double c;

        // C = (F - 32) / 1,8

        c = (temp - 32) / 1.8;

        System.out.println("Fahrenheit: "+temp+" Para Celsius: "+c);
    }

}
