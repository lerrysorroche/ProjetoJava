package util;

import java.util.Scanner;

public class InterfaceUsuario {

    Scanner scanner = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel;
        System.out.print("\nDigite o valor do imóvel: ");
        valorImovel = scanner.nextDouble();
        while (valorImovel <= 0) {
            System.out.print("\nO valor precisa ser positivo.");
            System.out.print("\nDigite o valor do imóvel: ");
            valorImovel = scanner.nextDouble();
        }
        return valorImovel;
    }

    public int pedirPrazoFinanciamento(){
        int prazoFinanciamento;
        System.out.print("Digite o prazo do financiamento em anos: ");
        prazoFinanciamento = scanner.nextInt();
        while (prazoFinanciamento <= 0) {
            System.out.print("\nO prazo precisa ser positivo.");
            System.out.print("\nDigite o prazo do financiamento em anos: ");
            prazoFinanciamento = scanner.nextInt();
        }
        return prazoFinanciamento;
    }

    public double pedirTaxaJurosAnual(){
        double taxaJurosAnual;
        System.out.print("Digite a taxa de juros anual: ");
        taxaJurosAnual = scanner.nextDouble();
        while (taxaJurosAnual <= 0) {
            System.out.print("\nA taxa precisa ser positiva.");
            System.out.print("\nDigite a taxa de juros anual: ");
            taxaJurosAnual = scanner.nextDouble();
        }
        return taxaJurosAnual;
    }

    public double pedirAreaConstruida() {
        double areaConstruida;
        System.out.print("Digite a area construida em m²: ");
        areaConstruida = scanner.nextDouble();
        while (areaConstruida <= 0) {
            System.out.print("\nO valor precisa ser positivo.");
            System.out.print("\nDigite a area construida em m²: ");
            areaConstruida = scanner.nextDouble();
        }
        return areaConstruida;
    }

    public double pedirAreaTerreno() {
        double areaTerreno;
        System.out.print("Digite a area do terreno em m²: ");
        areaTerreno = scanner.nextDouble();
        while (areaTerreno <= 0) {
            System.out.print("\nO valor precisa ser positivo.");
            System.out.print("\nDigite a area do terreno em m²: ");
            areaTerreno = scanner.nextDouble();
        }
        return areaTerreno;
    }
}