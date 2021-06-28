/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

import java.awt.Color;

/**
 *
 * @author pablo
 */
public class Perro extends Animales{
   private Color color;
   private int edad;
    private int peso;

    public Perro() {
    }

    public Perro(Color color, int edad, int peso) {
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    public Perro(Color color, int edad, int peso, int numeroPatas, String raza, String hablar) {
        super(numeroPatas, raza, hablar);
        this.color = color;
        this.edad = edad;
        this.peso = peso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "color=" + color + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
   
   
    
}
