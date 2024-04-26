package modelo;

public class Apartamento extends Financiamento{

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);

    }

    public double calcularPagamentoMensal() {
        double jurosMensal = this.getTaxaJurosAnual() / 100 / 12;
        int prazoFinanciamentoEmMeses = this.getPrazoFinanciamento() * 12;
        double numeroPotencia = Math.pow(1 + jurosMensal, prazoFinanciamentoEmMeses);
        return this.valorImovel * (jurosMensal * numeroPotencia / (numeroPotencia - 1));
    }

}
