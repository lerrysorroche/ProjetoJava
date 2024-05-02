package main;

import modelo.Casa;
import modelo.Financiamento;
import modelo.Apartamento;
import modelo.Terreno;
import util.InterfaceUsuario;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){

        ArrayList <Financiamento> listaDeFinanciamentos = new ArrayList<>();
        InterfaceUsuario interfaceUsuario = new InterfaceUsuario();

        double valorImovel;
        int prazoFinanciamento;
        double taxaJurosAnual;
        double totalValorImoveis = 0;
        double totalValorFinanciamentos = 0;
        double areaConstruida;
        double areaTerreno;

        // Financiamento de 1 casa com informações inseridas pelo usuário.
        valorImovel = interfaceUsuario.pedirValorImovel();
        prazoFinanciamento = interfaceUsuario.pedirPrazoFinanciamento();
        taxaJurosAnual = interfaceUsuario.pedirTaxaJurosAnual();
        areaConstruida = interfaceUsuario.pedirAreaConstruida();
        areaTerreno = interfaceUsuario.pedirAreaTerreno();
        Casa casa1 = new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno);
        listaDeFinanciamentos.add(new Casa(valorImovel, prazoFinanciamento, taxaJurosAnual, areaConstruida, areaTerreno));

        // Financiamento de 1 casa, 2 apartamentos e 1 terreno informado diretamente.
        Casa casa2 = new Casa(375000, 30, 8, 180, 250);
        listaDeFinanciamentos.add(new Casa(375000, 30, 8, 180, 250));

        Apartamento apartamento1 = new Apartamento(250000, 20, 10, 1, 5);
        listaDeFinanciamentos.add(new Apartamento(250000, 20, 10, 1, 5));

        Apartamento apartamento2 = new Apartamento(490000, 30, 9, 2, 12);
        listaDeFinanciamentos.add(new Apartamento(490000, 30, 9, 2, 12));

        Terreno terreno1 = new Terreno(150000, 10, 12, "Residencial");
        listaDeFinanciamentos.add(new Terreno(150000, 10, 12, "Residencial"));

        // Salvando os dados de cada financiamento em um arquivo .txt
        try {
            BufferedWriter escritor = new BufferedWriter(new FileWriter("dadosFinanciamentos.txt"));

            escritor.write(casa1.toString());
            escritor.write(casa2.toString());
            escritor.write(apartamento1.toString());
            escritor.write(apartamento2.toString());
            escritor.write(terreno1.toString());

            escritor.flush();
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Salvando os dados serializados dos financiamentos em arquivo .test
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("financiamentos.test"));

            oos.writeObject(casa1);
            oos.writeObject(casa2);
            oos.writeObject(apartamento1);
            oos.writeObject(apartamento2);
            oos.writeObject(terreno1);

            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Carregando os dados serializados dos financiamentos do arquivo .test
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("financiamentos.test"));

            Object objeto;
            while ((objeto = is.readObject()) != null) {
                if (objeto instanceof Financiamento) {
                    System.out.println(objeto);
               }
            }

            is.close();
        } catch (EOFException e) {
            System.out.println("Fim do arquivo!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Mostrando o valor total de todos imóveis e o valor total de todos financiamentos
        for (Financiamento v : listaDeFinanciamentos) {
            totalValorImoveis = totalValorImoveis + v.getValorImovel();
            totalValorFinanciamentos = totalValorFinanciamentos + v.calcularTotalPagamento();
        }

        System.out.print("\n----------------------------------------------------");
        System.out.printf("\nVALOR TOTAL DE TODOS IMÓVEIS:         R$ %.2f", totalValorImoveis);
        System.out.printf("\nVALOR TOTAL DE TODOS FINANCIAMENTOS:  R$ %.2f\n\n\n", totalValorFinanciamentos);
    }
}
