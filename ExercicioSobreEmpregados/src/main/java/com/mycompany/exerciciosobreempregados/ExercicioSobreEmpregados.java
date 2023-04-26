/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exerciciosobreempregados;

/**
 *
 * @author aluno
 */
public class ExercicioSobreEmpregados {

    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Dean", 3800, "RH");
        Vendedor vendedor1 = new Vendedor("Sam", 1500, 100);

        System.out.println(gerente1.toString());
        System.out.println(vendedor1.toString());
    }
}
