/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpactoecologico;

/**
 *
 * @author HESOYAM
 */
public class Auto implements ImpactoEcologico {
     double EmisionesCO2PorKilometro;
     double KilometrosRecorridos;

    // Constructor, atributos y métodos de la clase Auto

    @Override
    public double obtenerImpactoEcologico() {
        // Lógica específica para calcular la huella de carbono del auto
        double huellaCarbono = EmisionesCO2PorKilometro * KilometrosRecorridos;
        return huellaCarbono;
    }
}
        