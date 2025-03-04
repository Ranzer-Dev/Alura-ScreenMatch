package exercicios;

public class TabuadaMultiplicacao implements Tabuada{

    @Override
    public void mostraTabuada(int numero) {
        System.out.println("Essa é a tabuada do: "+numero);
        for (int i = 0; i <= 10; i++){
            System.out.println(numero+" * " + i + " = " +i*numero);
        }
    }
}
