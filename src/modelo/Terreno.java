package modelo;

public class Terreno extends Financiamento{

    private String tipoZona;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, String tipoZona) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.tipoZona = tipoZona;
    }

    public double calcularPagamentoMensal() {
        return (this.getValorImovel() / (this.getPrazoFinanciamento() * 12)) * (1 + (this.getTaxaJurosAnual() / 100 / 12)) * 1.02;
    }

}
