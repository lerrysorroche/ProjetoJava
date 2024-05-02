package modelo;

import util.AcrescimoMaiorDoQueJurosException;

public class Casa extends Financiamento{

    private double areaConstruida;
    private double areaTerreno;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida, double areaTerreno) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
        this.areaTerreno = areaTerreno;
    }

    private void adicionarJurosOuAcrescimo(double valorJuros, double valorAcrescimo) throws AcrescimoMaiorDoQueJurosException {
        if (valorAcrescimo > valorJuros) {
            throw new AcrescimoMaiorDoQueJurosException("O acréscimo de R$80,00 é maior que os juros!");
        }
    }

    public double calcularPagamentoMensal() {
        double parcelaSemJuros = (this.getValorImovel() / (this.getPrazoFinanciamento() * 12));
        double parcelaComJuros = (this.getValorImovel() / (this.getPrazoFinanciamento() * 12)) * (1 + (this.getTaxaJurosAnual() / 100 / 12));
        double valorJuros = parcelaComJuros - parcelaSemJuros;
        double valorAcrescimo = 80;
        try {
            adicionarJurosOuAcrescimo(valorJuros, valorAcrescimo);
            return (this.getValorImovel() / (this.getPrazoFinanciamento() * 12)) * (1 + (this.getTaxaJurosAnual() / 100 / 12)) + valorJuros;
        } catch (AcrescimoMaiorDoQueJurosException e) {
            return (this.getValorImovel() / (this.getPrazoFinanciamento() * 12)) * (1 + (this.getTaxaJurosAnual() / 100 / 12)) + valorAcrescimo;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n----------- FINANCIAMENTO DE CASA -----------\n");
        sb.append("Valor do Imóvel:               R$ ").append(this.getValorImovel()).append("\n");
        sb.append("Prazo do financimento:         ").append(this.getPrazoFinanciamento()).append(" anos.").append("\n");
        sb.append("Taxa de juros anual:           ").append(this.getTaxaJurosAnual()).append("% ao ano.").append("\n");
        sb.append("Área construída:               ").append(this.areaConstruida).append("\n");
        sb.append("Área do terreno:               ").append(this.areaTerreno).append("\n");
        sb.append("Pagamento mensal:              R$ ").append(calcularPagamentoMensal()).append("\n");
        sb.append("Valor do financiamento:        R$ ").append(calcularTotalPagamento()).append("\n");
        return sb.toString();
    }
}
