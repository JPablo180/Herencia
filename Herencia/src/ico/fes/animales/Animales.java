/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.animales;

/**
 *
 * @author pablo
 */
public class Animales {
   private int numeroPatas;
   private String raza;
   private String hablar;

    public Animales() {
    }

    public Animales(int numeroPatas, String raza, String hablar) {
        this.numeroPatas = numeroPatas;
        this.raza = raza;
        this.hablar = hablar;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    @Override
    public String toString() {
        return "Animales{" + "numeroPatas=" + numeroPatas + ", raza=" + raza + ", hablar=" + hablar + '}';
    }
   

}
   