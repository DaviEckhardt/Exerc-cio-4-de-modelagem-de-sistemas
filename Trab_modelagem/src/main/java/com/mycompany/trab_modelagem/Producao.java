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
  
public class Producao extends Papel {
    private String papelProducao;

    public Producao(String nomePessoa, String papel, String papelProducao) {
        super(nomePessoa, papel);
        this.papelProducao = papelProducao;
    }

    public String getPapelProducao() {
        return papelProducao;
    }

    public void setPapelProducao(String papelProducao) {
        this.papelProducao = papelProducao;
    }
}

