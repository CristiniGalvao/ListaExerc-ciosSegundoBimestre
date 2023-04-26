/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosobreempregados;

/**
 *
 * @author aluno
 */
public class Vendedor extends Empregado {

    private float percentualComicao;

    public Vendedor(String nome, float salario, float percentualComicao) {
        super(nome, salario);
        this.percentualComicao = percentualComicao;
    }

    public float getPercentualComicao() {
        return percentualComicao;
    }

    public void setPercentualComicao(float percentualComicao) {
        this.percentualComicao = percentualComicao;
    }

    public String toString() {
        return "Nome: " + this.getNome() + " Salario Sem Comissão: " + this.getSalario() + " Percentual Comissão: "
                + this.getPercentualComicao() + " Salario Com Comissão: " + (this.getSalario() + this.getPercentualComicao());
    }
}
