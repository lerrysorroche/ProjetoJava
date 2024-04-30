package main;

import modelo.Casa;
import modelo.Financiamento;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.util.*;

public class Main {
    public static void main(String[] args){

        int i;
        List <Financiamento> listaDeFinanciamentos = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double valorImovel;
        int prazoFinanciamento;
        double taxaJurosAnual;
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;
        double areaConstruida;
        double areaTerreno;

        // Loop mantido para caso seja usado no futuro.
        for (i = 0; i < 1; i++) {
            System.out.print("\n************ " + (i + 1) + "º FINANCIAMENTO ************");
            valorImovel = interfaceUsuario.pedirValorImovel();
            prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();
            areaConstruida = interfaceUsuario.pedirAreaConstruida();
            areaTerreno = interfaceUsuario.pedirAreaTerreno();
            Casa casa1 = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno);
            listaDeFinanciamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno));
            System.out.print("\n------- RESUMO DO " + (i + 1) + "º FINANCIAMENTO -------");
            casa1.imprimirFinanciamento();
        }

        // Financiamento de 1 casa, 2 apartamentos e 1 terreno informado diretamente.
        Casa casa2 = new Casa(375000, 30, 8, 180, 250);
        listaDeFinanciamentos.add(new Casa(375000, 30, 8, 180, 250));
        System.out.print("\n------- RESUMO DO 2º FINANCIAMENTO -------");
        casa2.imprimirFinanciamento();

        Apartamento apartamento1 = new Apartamento(250000, 20, 10, 1, 5);
        listaDeFinanciamentos.add(new Apartamento(250000, 20, 10, 1, 5));
        System.out.print("\n------- RESUMO DO 3º FINANCIAMENTO -------");
        apartamento1.imprimirFinanciamento();

        Apartamento apartamento2 = new Apartamento(490000, 30, 9, 2, 12);
        listaDeFinanciamentos.add(new Apartamento(490000, 30, 9, 2, 12));
        System.out.print("\n------- RESUMO DO 4º FINANCIAMENTO -------");
        apartamento2.imprimirFinanciamento();

        Terreno terreno1 = new Terreno(150000, 10, 12, "Residencial");
        listaDeFinanciamentos.add(new Terreno(150000, 10, 12, "Residencial"));
        System.out.print("\n------- RESUMO DO 5º FINANCIAMENTO -------");
        terreno1.imprimirFinanciamento();

        for (Financiamento v : listaDeFinanciamentos) {
            totalValorImoveis = totalValorImoveis + v.getValorImovel();
            totalValorFinanciamentos = totalValorFinanciamentos + v.calcularTotalPagamento();
        }

        System.out.print("\n----------------------------------------------------");
        System.out.printf("\nVALOR TOTAL DE TODOS IMÓVEIS:         R$ %.2f", totalValorImoveis);
        System.out.printf("\nVALOR TOTAL DE TODOS FINANCIAMENTOS:  R$ %.2f\n\n", totalValorFinanciamentos);
    }
}
