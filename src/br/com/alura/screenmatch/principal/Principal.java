package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //Objeto filme
        Filme berserk = new Filme("Berserk", 1980);
        //berserk.setNome();
        berserk.setDuracaoEmMinutos(130);
        berserk.setIncluidoNoPlano(true);

        berserk.exibeFixaTecnica();
        berserk.avaliacao(9.1);
        berserk.avaliacao(9.3);
        berserk.avaliacao(10);

        Filme attackOnTitan = new Filme("attackOnTitan",2025);
        attackOnTitan.setDuracaoEmMinutos(132);
        //attackOnTitan.setNome("attackOnTitan");
        attackOnTitan.avaliacao(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(berserk);
        listaDeFilmes.add(attackOnTitan);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro filme: "+ listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme: "+ listaDeFilmes.get(1).getNome());

        //System.out.println("Média de avaliações do filme: "+berserk.retornaMedia());


//        Serie lost = new Serie();
//        lost.setNome("Lost");
//        lost.setAnoDeLancamento(2000);
//        lost.exibeFixaTecnica();
//        lost.setTemporadas(10);
//        lost.setEpisodiosPorTemporada(10);
//        lost.setMinutosPorEpisodio(50);
//        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());
//
//        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
//        calculadora.inclui(berserk);
//        calculadora.inclui(lost);
//        System.out.println("Tempo total para marotonar: "+ calculadora.getTempoTotal());
//
//        FiltroRecomendacao filtro = new FiltroRecomendacao();
//        filtro.filtra(berserk);
//
//        Episodio episodio = new Episodio();
//        episodio.setNumero(1);
//        episodio.setSerie(lost);
//        episodio.setTotalVisualizacoes(300);
//        filtro.filtra(episodio);
    }
}