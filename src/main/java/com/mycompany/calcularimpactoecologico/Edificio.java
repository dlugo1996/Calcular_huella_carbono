/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpactoecologico;

/**
 *
 * @author HESOYAM
 */
public class Edificio implements ImpactoEcologico {
    double consumoEnergia;

    // Constructor y otros atributos y métodos de la clase Edificio

    @Override
    public double obtenerImpactoEcologico() {
        // Lógica específica para calcular el impacto ecológico del carbono del edificio
        double impactoCarbono = consumoEnergia * 2.5;
        return impactoCarbono;
    }
}
