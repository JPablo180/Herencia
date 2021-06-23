/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.hardware;

/**
 *
 * @author pablo
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int nemueroDeTeclas;
    private int multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int nemueroDeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.nemueroDeTeclas = nemueroDeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNemueroDeTeclas() {
        return nemueroDeTeclas;
    }

    public void setNemueroDeTeclas(int nemueroDeTeclas) {
        this.nemueroDeTeclas = nemueroDeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", nemueroDeTeclas=" + nemueroDeTeclas + ", multimedia=" + multimedia + '}';
    }
    
}
