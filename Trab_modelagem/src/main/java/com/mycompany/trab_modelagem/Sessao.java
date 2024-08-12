/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab_modelagem;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private String estadoSessao;  // Valores possíveis: "Aberta", "Em Andamento", "Encerrada"
    private int ingressosSessao;
    private int ingressosComprados;
    private Filme filme;
    private Sala sala;
    private List<Ingresso> ingressos;

    public Sessao(Date dataSessao, String horaSessao, String estadoSessao, Filme filme, Sala sala) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.estadoSessao = estadoSessao;
        this.filme = filme;
        this.sala = sala;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosComprados = 0;
        this.ingressos = new ArrayList<>();
    }

    // Métodos Getters e Setters
    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        this.estadoSessao = estadoSessao;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosSessao - ingressosComprados;
    }

    public Filme getFilme() {
        return filme;
    }

    public Sala getSala() {
        return sala;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    // Método para vender ingressos
    public void venderIngresso(Ingresso ingresso) {
        if (getIngressosRestantes() > 0) {
            ingressos.add(ingresso);
            ingressosComprados++;
            System.out.println("Ingresso vendido com sucesso!");
        } else {
            System.out.println("Não há mais ingressos disponíveis.");
        }
    }

    // Método para exibir os dados da sessão
    public void exibirSessao() {
        System.out.println("Data: " + dataSessao);
        System.out.println("Hora: " + horaSessao);
        System.out.println("Estado: " + estadoSessao);
        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Sala: " + sala.getNomeSala());
        System.out.println("Ingressos disponíveis: " + getIngressosRestantes());
        System.out.println("Ingressos vendidos: " + ingressosComprados);
        System.out.println("Total de ingressos: " + ingressosSessao);
    }
}

