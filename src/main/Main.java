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

        for (i = 0; i < 4; i++) {
            System.out.print("\n************ " + (i + 1) + "º FINANCIAMENTO ************");
            valorImovel = interfaceUsuario.pedirValorImovel();
            totalValorImoveis = totalValorImoveis + valorImovel;
            prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
            taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();
            Apartamento apartamento = new Apartamento(valorImovel, prazoFinanciamento, taxaJurosAnual);
            listaDeFinanciamentos.add(new Financiamento(valorImovel, prazoFinanciamento, taxaJurosAnual));
            System.out.print("\n------- RESUMO DO " + (i + 1) + "º FINANCIAMENTO -------");
            apartamento.imprimirFinanciamento();
            totalValorFinanciamentos = totalValorFinanciamentos + apartamento.calcularTotalPagamento();

        }

        System.out.print("----------------------------------------------------");
        System.out.printf("\nVALOR TOTAL DE TODOS IMÓVEIS:         R$ %.2f", totalValorImoveis);
        System.out.printf("\nVALOR TOTAL DE TODOS FINANCIAMENTOS:  R$ %.2f\n\n", totalValorFinanciamentos);
        System.out.printf("\nVALOR TOTAL DE TODOS FINANCIAMENTOS:  R$ %.2f\n\n", totalValorFinanciamentos);


    }
}
