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
  
public class Papel {
    private String nomePessoa;
    private String papel;

    public Papel(String nomePessoa, String papel) {
        this.nomePessoa = nomePessoa;
        this.papel = papel;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }
}

