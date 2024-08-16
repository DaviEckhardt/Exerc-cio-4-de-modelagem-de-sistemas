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
  
public class Ator extends Papel {
    private int idade;
    private char sexo;
    private String nacionalidade;

    public Ator(String nomePessoa, String papel, int idade, char sexo, String nacionalidade) {
        super(nomePessoa, papel);
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}

