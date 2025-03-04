package exercicios;

import java.util.Scanner;

public class Musica {
    public String titulo;
    public String artista;
    public int anoDeLancamento;
    public int numAvaliacoes;
    public double avaliacao;

    public void exibirFichaTecnica(){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nTitulo da musica: "+titulo);
        System.out.println("Nome do artista: "+ artista);
        System.out.println("Ano de lancamento: "+ anoDeLancamento);
    }
    public void avaliar(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes++;
        System.out.println(avaliacao);
    }
    public double calcularMediaAvaliacoes(){
        avaliacao = avaliacao/numAvaliacoes;
        return  avaliacao;
    }

}
