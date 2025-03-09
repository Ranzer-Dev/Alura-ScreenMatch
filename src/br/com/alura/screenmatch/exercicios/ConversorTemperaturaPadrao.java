package br.com.alura.screenmatch.exercicios;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius*1.8+32;
        System.out.println(celsius + " Celsius para Fahrenheit valem: "+ fahrenheit+" Fahrenheit");
    }

    @Override
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = fahrenheit/1.8-32;
        System.out.println(fahrenheit + " Fahrenheit para Celsius valem: "+ celsius+" Fahrenheit");
    }
}
