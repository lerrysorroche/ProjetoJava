package modelo;

public class Apartamento extends Financiamento{

    private int numeroVagasGaragem;
    private int numeroAndar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int numeroVagasGaragem, int numeroAndar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.numeroVagasGaragem = numeroVagasGaragem;
        this.numeroAndar = numeroAndar;
    }

    public double calcularPagamentoMensal() {
        double jurosMensal = this.getTaxaJurosAnual() / 100 / 12;
        int prazoFinanciamentoEmMeses = this.getPrazoFinanciamento() * 12;
        double numeroPotencia = Math.pow(1 + jurosMensal, prazoFinanciamentoEmMeses);
        return this.getValorImovel() * (jurosMensal * numeroPotencia / (numeroPotencia - 1));
    }

}
