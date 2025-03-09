package br.com.alura.screenmatch.exercicios;

public class ProdutoFisico implements Calculavel{
    private boolean importado = true;

    @Override
    public void precoFinal(double precoAtual) {
        if (precoAtual > 20){
            double novoPrecoAtual = precoAtual * 1.05;//aplicando taxa de importação 5%
            System.out.println("Taxa de importação aplicada, novo valor: "+ novoPrecoAtual);
        }
    }
}
