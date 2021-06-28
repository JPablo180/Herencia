/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import ico.fes.animales.Gato;
import ico.fes.animales.Perro;
import java.awt.Color;

/**
 *
 * @author pablo
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro galleta = new Perro(Color.black, 3, 6, 4, "mestizo", "guau");
        System.out.println(galleta);
        
        Gato Cation = new Gato(Color.orange, 3, 5, 4, "Gato Europeo", "miau");
        System.out.println(Cation);
  
    }
    
}

