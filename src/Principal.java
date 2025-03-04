
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        //Objeto filme
        Filme berserk = new Filme();
        berserk.setNome("Berserk");
        berserk.setAnoDeLancamento(1990);
        berserk.setDuracaoEmMinutos(130);
        berserk.setIncluidoNoPlano(true);

        berserk.exibeFixaTecnica();
        berserk.avaliacao(9.1);
        berserk.avaliacao(9.3);
        berserk.avaliacao(10);

        //System.out.println("Média de avaliações do filme: "+berserk.retornaMedia());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFixaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(berserk);
        calculadora.inclui(lost);
        System.out.println("Tempo total para marotonar: "+ calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(berserk);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}