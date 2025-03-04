package exercicios;

public class Livro implements Calculavel{

    @Override
    public void precoFinal(double precoAtual) {
        double novoPrecoAtual = 0;
        if (precoAtual > 50 && precoAtual < 100){
            novoPrecoAtual = precoAtual*0.95;//desconto de 5%
            System.out.println("Foi aplicado um desconto de 5% preço final: "+novoPrecoAtual);
        } else if (precoAtual > 100) {
            novoPrecoAtual = precoAtual*0.90;//desconto de 10%
            System.out.println("Foi aplicado um desconto de 10% preço final: "+novoPrecoAtual);
        } else {
            System.out.println("aproveite a promoção! (consulte o vendedor)");
        }
    }
}
