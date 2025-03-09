import br.com.alura.screenmatch.exercicios.Produto;
import br.com.alura.screenmatch.exercicios.ProdutoPerecivel;

import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {
        /*Pessoa rodolfo = new Pessoa();
        rodolfo.nome = "Rodolfo";
        rodolfo.falar("\nOla, Mundo!");*/

       /* Calculadora multiplica = new Calculadora();
        System.out.println("\nesse é o dobro do numero inserido: " + multiplica.dobra(2));*/

        /*Musica musica = new Musica();
        musica.artista = "Anjo Rodolfo";
        musica.titulo = "A Batalha";
        musica.anoDeLancamento = 2025;

        musica.exibirFichaTecnica();
        musica.avaliar(10);
        musica.avaliar(9);
        musica.avaliar(9);
        System.out.println("A media de avaliação é: "+musica.calcularMediaAvaliacoes());*/

        /*ModeloCarro celta = new ModeloCarro();
        celta.setNomeDoModelo("Celata");
        celta.precoMedioAno();
        celta.fichaTecnica();*/

        /*Aluno priscila = new Aluno();
        priscila.nome = "Priscila";
        priscila.idade = 25;
        priscila.verCadastro();*/

        /*Gato garfield = new Gato();
        garfield.arranharMoveis();
        garfield.emitirSom();

        Cachorro ravena = new Cachorro();
        ravena.abanarRabo();
        ravena.emitirSom();*/

        /*VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);*/

        /*ConversorMoeda conversor = new ConversorMoeda();
        conversor.setTaxaCambio(5.88);
        conversor.converterDolarParaReal(100);*/

        /*CalculadoraSalaRetangular calcRetangular = new CalculadoraSalaRetangular();
        calcRetangular.calcularArea(10,10);
        calcRetangular.calcularPerimetro(10,10);*/

        /*TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostraTabuada(3);*/

        /*ConversorTemperaturaPadrao conveTempe = new ConversorTemperaturaPadrao();
        conveTempe.celsiusParaFahrenheit(2);
        conveTempe.fahrenheitParaCelsius(2);*/

        /*Livro livro = new Livro();
        livro.precoFinal(10);
        livro.precoFinal(60);

        ProdutoFisico produto = new ProdutoFisico();
        produto.precoFinal(500);*/

        /*Produto velaArtesenal = new Produto("vela artesenal",25.0,13);
        Produto bottom = new Produto("Bottom", 8.0, 20);
        Produto caderno = new Produto("caderno", 70.0, 200);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(velaArtesenal);
        produtos.add(bottom);
        produtos.add(caderno);

        System.out.println("O tamanho da lista é: " + produtos.size());
        System.out.println("O item 2 da lista é: " + produtos.get(1).getNome());
        System.out.println(produtos.toString());

        for (int i = 0; i < produtos.size(); i++){
            System.out.println(produtos.get(i).getNome());
        }*/

        ProdutoPerecivel vela = new ProdutoPerecivel("vela", 25.0,5, "14-12-1995");
        System.out.println(vela);
    }
}
