/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
  
public class Ingresso {
    private int numeroIngresso;
    private int assentoIngresso;
    private String tipoIngresso;
    private float valorIngresso;
    private String dataHoraCompra;

    public Ingresso(int numeroIngresso, int assentoIngresso, String tipoIngresso, float valorIngresso, String dataHoraCompra) {
        this.numeroIngresso = numeroIngresso;
        this.assentoIngresso = assentoIngresso;
        this.tipoIngresso = tipoIngresso;
        this.valorIngresso = valorIngresso;
        this.dataHoraCompra = dataHoraCompra;
    }

    public int getNumeroIngresso() {
        return numeroIngresso;
    }

    public void setNumeroIngresso(int numeroIngresso) {
        this.numeroIngresso = numeroIngresso;
    }

    public int getAssentoIngresso() {
        return assentoIngresso;
    }

    public void setAssentoIngresso(int assentoIngresso) {
        this.assentoIngresso = assentoIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    public float getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(float valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getDataHoraCompra() {
        return dataHoraCompra;
    }

    public void setDataHoraCompra(String dataHoraCompra) {
        this.dataHoraCompra = dataHoraCompra;
    }

    public void imprimirIngresso() {
        System.out.println("Ingresso Nº: " + numeroIngresso);
        System.out.println("Assento: " + assentoIngresso);
        System.out.println("Tipo: " + tipoIngresso);
        System.out.println("Valor: R$ " + valorIngresso);
        System.out.println("Data/Hora da Compra: " + dataHoraCompra);
    }
}

