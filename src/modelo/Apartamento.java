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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n-------- FINANCIAMENTO DE APARTAMENTO --------\n");
        sb.append("Valor do Imóvel:               R$ ").append(this.getValorImovel()).append("\n");
        sb.append("Prazo do financimento:         ").append(this.getPrazoFinanciamento()).append(" anos.").append("\n");
        sb.append("Taxa de juros anual:           ").append(this.getTaxaJurosAnual()).append("% ao ano.").append("\n");
        sb.append("Número de vagas de garagaem:   ").append(this.numeroVagasGaragem).append("\n");
        sb.append("Número do andar:               ").append(this.numeroAndar).append("\n");
        sb.append("Pagamento mensal:              R$ ").append(calcularPagamentoMensal()).append("\n");
        sb.append("Valor do financiamento:        R$ ").append(calcularTotalPagamento()).append("\n");
        return sb.toString();
    }

}
