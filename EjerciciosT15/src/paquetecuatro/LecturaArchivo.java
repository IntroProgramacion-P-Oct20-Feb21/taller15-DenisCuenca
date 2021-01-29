/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetecuatro;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class LecturaArchivo {
   
    // lee registro del archivo
    public static void leerRegistros() {

        String cadenaFinal = "";
        String nombreCanton;
        String numeroEstablecimientos;
        int numeroEstablecimientosEntero;
        // 1. Se abre el archivo
        try // lee registros del archivo, usando el objeto Scanner
        {
            Scanner entrada = new Scanner(new File("data/datos1.csv"));

            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split(","));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                // recuerde en el ArrayList existe elementos de tipo 
                // String
                nombreCanton = linea_partes.get(0);
                numeroEstablecimientos = linea_partes.get(1); 
                numeroEstablecimientosEntero = Integer.parseInt(numeroEstablecimientos);
                
                // agregar código aquí
                
                
            } // fin de while
            entrada.close();
        } // fin de try
        catch (Exception e) {
            System.err.printf("Error, revise: %s\n", e);
            System.exit(1); 
        } // fin de catch
        
        System.out.printf("%s\n", cadenaFinal);
    } // fin del m�todo leerRegistros
    // cierra el archivo y termina la aplicaci�n

    
} 