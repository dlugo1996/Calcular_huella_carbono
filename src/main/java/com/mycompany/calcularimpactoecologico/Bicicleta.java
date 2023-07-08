/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcularimpactoecologico;

/**
 *
 * @author HESOYAM
 */


public class Bicicleta implements ImpactoEcologico {
     double emisionesFabricacion; // Emisiones de carbono en kg CO2eq
     double emisionesMantenimiento; // Emisiones de carbono en kg CO2eq
     double emisionesMateriales; // Emisiones de carbono en kg CO2eq

    // Constructor, atributos y métodos de la clase Bicicleta

    @Override
    public double obtenerImpactoEcologico() {
        double emisionesdecarbono = emisionesFabricacion + emisionesMantenimiento + emisionesMateriales;
        return emisionesdecarbono;
    }
}
