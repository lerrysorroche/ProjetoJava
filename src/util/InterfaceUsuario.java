package util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuario {

    Scanner scanner = new Scanner(System.in);

    public double pedirValorImovel() {
        double valorImovel;
        System.out.print("\nDigite o valor do imóvel: ");
        valorImovel = scanner.nextDouble();
        while (valorImovel <= 0) {
            try {
                System.out.print("\nO valor precisa ser positivo!");
                System.out.print("\nDigite o valor do imóvel: ");
                valorImovel = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return valorImovel;
    }

    public int pedirPrazoFinanciamento() {
        int prazoFinanciamento;
        System.out.print("Digite o prazo do financiamento: ");
        prazoFinanciamento = scanner.nextInt();
        while (prazoFinanciamento <= 0) {
            try {
                System.out.print("\nO prazo precisa ser positivo!");
                System.out.print("\nDigite o prazo do financiamento: ");
                prazoFinanciamento = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return prazoFinanciamento;
    }

    public double pedirTaxaJurosAnual() {
        double taxaJurosAnual;
        System.out.print("Digite a taxa de juros anual: ");
        taxaJurosAnual = scanner.nextDouble();
        while (taxaJurosAnual <= 0) {
            try {
                System.out.print("\nO taxa de juros precisa ser positiva!");
                System.out.print("\nDigite a taxa de juros anual: ");
                taxaJurosAnual = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return taxaJurosAnual;
    }

    public double pedirAreaConstruida() {
        double areaConstruida;
        System.out.print("Digite a área construida em m²: ");
        areaConstruida = scanner.nextDouble();
        while (areaConstruida <= 0) {
            try {
                System.out.print("\nA área precisa ser positiva.");
                System.out.print("\nDigite a área construida em m²: ");
                areaConstruida = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return areaConstruida;
    }

    public double pedirAreaTerreno() {
        double areaTerreno;
        System.out.print("Digite a área do terreno em m²: ");
        areaTerreno = scanner.nextDouble();
        while (areaTerreno <= 0) {
            try {
                System.out.print("\nA área precisa ser positiva.");
                System.out.print("\nDigite a area do terreno em m²: ");
                areaTerreno = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return areaTerreno;
    }

    public double pedirNumeroVagasGaragem() {
        double numeroVagasGaragem;
        System.out.print("Digite o número de vagas de garagem: ");
        numeroVagasGaragem = scanner.nextDouble();
        while (numeroVagasGaragem <= 0) {
            try {
                System.out.print("\nO número precisa ser positivo.");
                System.out.print("\nDigite o número de vagas de garagem: ");
                numeroVagasGaragem = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return numeroVagasGaragem;
    }

    public double pedirNumeroAndar() {
        double numeroAndar;
        System.out.print("Digite o número do andar: ");
        numeroAndar = scanner.nextDouble();
        while (numeroAndar <= 0) {
            try {
                System.out.print("\nO número precisa ser positivo.");
                System.out.print("\nDigite o número do andar: ");
                numeroAndar = scanner.nextDouble();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return numeroAndar;
    }

    public String pedirTipoZona() {
        System.out.print("Digite o tipo de zona (residencial ou comercial): ");
        String tipoZona = scanner.next();
        while (!tipoZona.equals("residencial") && (!tipoZona.equals("comercial"))) {
            try {
                System.out.print("\nPrecisa ser residencial ou comercial.");
                System.out.print("\nDigite o tipo de zona (residencial ou comercial): ");
                tipoZona = scanner.next();

            } catch (InputMismatchException e) {
                System.out.print("\nInválido!");
                scanner.next();
            }
        }
        return tipoZona;
    }
}