package br.com.alura.screenmatch.exercicios;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public void calcularArea(double altura, double largura) {
        System.out.println("a area é: " + altura*largura);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        System.out.println("o primetro é: "+ (altura+largura) *2 );
    }
}
