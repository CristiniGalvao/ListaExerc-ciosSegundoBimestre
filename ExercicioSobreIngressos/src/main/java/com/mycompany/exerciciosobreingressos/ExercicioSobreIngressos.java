/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosobreingressos;

/**
 * @author GABRIELLA CRISTINI GALVÃO RA:00240549;
 */
public class ExercicioSobreIngressos {

    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso(50);
        IngressoVip ingresso2 = new IngressoVip(50,30);
        
        System.out.println(ingresso1.toString());
        System.out.println(ingresso2.toString());
    }
}
