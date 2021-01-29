/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteseis;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        double sueldos = LecturaArchivo.leerRegistros();
        System.out.printf("Promedio de sueldos %.2f\n", sueldos);
    }
    
}
