package exercicios;

public class ConversorMoeda implements ConversaoFinanceira{
    private double taxaCambio;

    public double getTaxaCambio() {
        return taxaCambio;
    }

    public void setTaxaCambio(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public void converterDolarParaReal(double valorDolar) {
        double valorEmReal = valorDolar*taxaCambio;
        System.out.println("valor em Real: " + valorEmReal);
    }
}
