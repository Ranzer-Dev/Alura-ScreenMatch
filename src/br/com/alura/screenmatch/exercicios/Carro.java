package br.com.alura.screenmatch.exercicios;

import java.util.Scanner;

public class Carro {
    private String nomeDoModelo;
    private double[] precoMedio = new double[3];

    public double[] getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(double[] precoMedio) {
        this.precoMedio = precoMedio;
    }

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public void precoMedioAno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o preço medio do 1º ano");
        precoMedio[0] = scan.nextDouble();
        System.out.println("Qual o preço medio do 2º ano");
        precoMedio[1] = scan.nextDouble();
        System.out.println("Qual o preço medio do 3º ano");
        precoMedio[2] = scan.nextDouble();
    }

    public double[] maiorMenorPreco(double[] preco) {
        double maiorPreco = preco[0];
        double menorPreco = preco[0];
        for (int a = 0; a < preco.length; a++) {
            if (preco[a] < menorPreco) {
                menorPreco = preco[a];
            } else {
                maiorPreco = preco[a];
            }
        }
        return new double[]{maiorPreco, menorPreco};
    }

    public void fichaTecnica(){
        System.out.println("Modelo: "+ nomeDoModelo);
        System.out.println("Preço ano 1: "+ precoMedio[0]);
        System.out.println("Preço ano 2: : "+ precoMedio[1]);
        System.out.println("Preço ano 3: : "+ precoMedio[2]);
        System.out.println("Menor preço: "+ maiorMenorPreco(precoMedio)[1]);
        System.out.println("Maior preço: "+ maiorMenorPreco(precoMedio)[0]);
    }
}
