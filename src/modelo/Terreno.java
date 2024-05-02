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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n---------- FINANCIAMENTO DE TERRENO ----------\n");
        sb.append("Valor do Imóvel:               R$ ").append(this.getValorImovel()).append("\n");
        sb.append("Prazo do financimento:         ").append(this.getPrazoFinanciamento()).append(" anos.").append("\n");
        sb.append("Taxa de juros anual:           ").append(this.getTaxaJurosAnual()).append("% ao ano.").append("\n");
        sb.append("Tipo de zona:                  ").append(this.tipoZona).append("\n");
        sb.append("Pagamento mensal:              R$ ").append(calcularPagamentoMensal()).append("\n");
        sb.append("Valor do financiamento:        R$ ").append(calcularTotalPagamento()).append("\n");
        return sb.toString();
    }

}
