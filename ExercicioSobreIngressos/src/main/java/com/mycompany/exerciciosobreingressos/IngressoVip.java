/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosobreingressos;

/**
 * @author GABRIELLA CRISTINI GALVÃO RA:00240549;
 */
public class IngressoVip extends Ingresso {

    private float valorAdicional;
    
    public IngressoVip(float valor, float valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public float getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
    
    public String toString(){
        return "Valor do ingresso Vip: "+(this.getValor() + this.getValorAdicional());
    }
}
