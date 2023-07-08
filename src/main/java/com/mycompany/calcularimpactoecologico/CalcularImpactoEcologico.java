/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularimpactoecologico;

import java.util.ArrayList;

/**
 *
 * @author HESOYAM
 */
public class CalcularImpactoEcologico {

    public static void main(String[] args) {
       
         Edificio edificio = new Edificio();
        // Asignar un valor al atributo consumoEnergia
        edificio.consumoEnergia = 1000; // Ejemplo de consumo de energía en kilovatios/hora

        double impactoCarbono = edificio.obtenerImpactoEcologico();
        System.out.println("El impacto ecológico del carbono del edificio es: " + impactoCarbono + " kg CO2eq");
               
        
    //huella de carbono del Auto

 Auto auto = new Auto();
        // Asignar valores a los atributos emisionesCO2PorKilometro y kilometrosRecorridos
        auto.EmisionesCO2PorKilometro = 0.2; // Ejemplo de emisiones de CO2 por kilómetro
        auto.KilometrosRecorridos =100; // Ejemplo de kilómetros recorridos

        double huellaCarbono = auto.obtenerImpactoEcologico();
        System.out.println("La huella de carbono del auto es: " + huellaCarbono + " kg CO2eq");    
        
     
       
     
    //Huella de carbono de la bicicleta   
      Bicicleta bicicleta = new Bicicleta();
        // Asignar valores a los atributos de la bicicleta, como las emisiones de carbono

    bicicleta.emisionesFabricacion = 10.5; // Ejemplo de emisiones de carbono en kg CO2eq durante la fabricación
    bicicleta.emisionesMantenimiento = 2.8; // Ejemplo de emisiones de carbono en kg CO2eq durante el mantenimiento
    bicicleta.emisionesMateriales = 4.2; // Ejemplo de emisiones de carbono en kg CO2eq debido a los materiales utilizados


        
        

        double emisionesdecarbono = bicicleta.obtenerImpactoEcologico();
        System.out.println("La huella de carbono de la bicicleta es: " + emisionesdecarbono + " kg CO2eq");   
     
        
        
         System.out.println("-------------------------------------------------");   
        // System.out.println("La huella de carbono de la bicicleta es: " + emisionesdecarbono + " kg CO2eq");   
        
        
       ArrayList<ImpactoEcologico> objetos = new ArrayList<>();

        // Crear objetos y agregarlos al ArrayList
        objetos.add(edificio);

        
        objetos.add(auto);

       
        objetos.add(bicicleta);

        // Iterar a través del ArrayList y llamar a obtenerImpactoEcologico() en forma polimórfica
        for (ImpactoEcologico objeto : objetos) {
            double impacto = objeto.obtenerImpactoEcologico();
            String nombreObjeto = obtenerNombreObjeto(objeto);
            System.out.println(nombreObjeto + ": Impacto ecológico: " + impacto + " kg CO2eq");
        }
    }

    public static String obtenerNombreObjeto(ImpactoEcologico objeto) {
        if (objeto instanceof Edificio) {
            return "Edificio";
        } else if (objeto instanceof Auto) {
            return "Auto";
        } else if (objeto instanceof Bicicleta) {
            return "Bicicleta";
        }
        return "Objeto desconocido";
    }
}
