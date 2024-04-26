package modelo;

public class Financiamento {

    protected double valorImovel;
    protected int prazoFinanciamento;
    protected double taxaJurosAnual;

    public double getValorImovel() {
        return this.valorImovel;
    }

    public int getPrazoFinanciamento() {
        return this.prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return this.taxaJurosAnual;
    }

    public Financiamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual){
        this.valorImovel = valorImovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double calcularPagamentoMensal() {
        return (this.valorImovel / (this.prazoFinanciamento * 12)) * (1 + (this.taxaJurosAnual / 100 / 12));
    }

    public double calcularTotalPagamento() {
        return this.calcularPagamentoMensal() * this.prazoFinanciamento * 12;
    }

    public void imprimirFinanciamento() {
        System.out.printf("\nValor do imóvel:          R$ %.2f\n", this.valorImovel);
        System.out.printf("Pagamento mensal:         R$ %.2f\n", this.calcularPagamentoMensal());
        System.out.printf("Valor do financiamento:   R$ %.2f\n\n", this.calcularTotalPagamento());
    }

}