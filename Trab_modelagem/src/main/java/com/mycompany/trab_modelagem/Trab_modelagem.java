/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trab_modelagem;

/**
 *
 * @author User
 */

 /*
    Davi Monken Eckhardt - 202265019AB
    Lívia Faria Guirão - 202165087AB
  */
  
import java.util.Date;
public class Trab_modelagem {
    public static void main(String[] args) {
        // Criando objetos
        Genero genero = new Genero("Ação");
        Ator ator1 = new Ator("John Doe", "Protagonista", 35, 'M', "Americana");
        Ator ator2 = new Ator("Jane Smith", "Co-protagonista", 28, 'F', "Britânica");
        Direcao direcao = new Direcao("James Cameron", "Diretor", "Direção Geral");
        Producao producao1 = new Producao("Anna Lee", "Produtora", "Produção Executiva");
        Producao producao2 = new Producao("Michael Bay", "Produtor", "Produção");

        Filme filme = new Filme("Deadpool & Wolverine", 2024, "20th Century Studios", "EUA", "2h07m", genero);
        filme.addPapel(ator1);
        filme.addPapel(ator2);
        filme.addPapel(direcao);
        filme.addPapel(producao1);
        filme.addPapel(producao2);

        Sala sala = new Sala(1, "Sala IMAX", 200);

        Sessao sessao = new Sessao(new Date(), "20:00", "Aberta", filme, sala);

        // Criando ingressos
        Ingresso ingresso1 = new Ingresso(1, 10, "Inteira", 50.00f, new Date().toString());
        Ingresso ingresso2 = new Ingresso(2, 11, "Meia-entrada", 25.00f, new Date().toString());

        // Exibindo dados da sessão antes da venda de ingressos
        System.out.println("Dados da Sessão antes da venda de ingressos:");
        sessao.exibirSessao();

        // Vendendo ingressos
        sessao.venderIngresso(ingresso1);
        sessao.venderIngresso(ingresso2);

        // Exibindo dados da sessão após a venda de ingressos
        System.out.println("\nDados da Sessão após a venda de ingressos:");
        sessao.exibirSessao();

        // Exibindo dados dos ingressos vendidos
        System.out.println("\nIngressos vendidos:");
        ingresso1.imprimirIngresso();
        ingresso2.imprimirIngresso();
    }
}

