/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenador;

import ico.fes.hardware.CPU;
import ico.fes.hardware.Monitor;
import ico.fes.hardware.Mouse;
import ico.fes.hardware.Teclado;

/**
 *
 * @author pablo
 */
public class Ordenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Universidad Nacional Autonoma de Mexico");
        System.out.println("Facultad de Estudios Superiores Aragon");
        System.out.println("Trejo Ramirez Juan Pablo");
        System.out.println("Programacion Orientada a Objetos");
        System.out.println("Grupo:2209");
        System.out.println("----------------------------------------");
        
        Teclado t1 = new Teclado("HyperX", "Alloy fps pro", 102, 0);
        System.out.println(t1);
        Mouse m1 = new Mouse("Logitech", "G502 Hero", "Alambrico");
        System.out.println(m1);
        Monitor p1 = new Monitor("Msi", "G241VC LED", 24);
        System.out.println(p1);
        CPU c1 = new CPU("Ryzen", "2600", 3600);
        System.out.println(c1);
       
    }
    
}
