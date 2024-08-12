/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab_modelagem;

/**
 *
 * @author User
 */
public class Direcao extends Papel {
    private String papelDirecao;

    public Direcao(String nomePessoa, String papel, String papelDirecao) {
        super(nomePessoa, papel);
        this.papelDirecao = papelDirecao;
    }

    public String getPapelDirecao() {
        return papelDirecao;
    }

    public void setPapelDirecao(String papelDirecao) {
        this.papelDirecao = papelDirecao;
    }
}

