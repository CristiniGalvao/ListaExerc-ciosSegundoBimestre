/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosobreempregados;

/**
 *
 * @author aluno
 */
public class Gerente extends Empregado {

    private String departamento;

    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String toString() {
        return "Nome: " + this.getNome() + " Salario: " + this.getSalario()+ " Departamento: "+this.departamento;
    }
}
