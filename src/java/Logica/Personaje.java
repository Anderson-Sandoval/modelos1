/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public abstract class Personaje implements Cloneable {

    protected int vida;
    protected float altura;
    protected String nombre, naturaleza, foto;
    protected Mascota m;

    public abstract Personaje crear();

    public void decirCaracteristicas() {
        System.out.println("Naturaleza del pesonaje: " + getNaturaleza()
                + "\nNombre del personaje: " + getNombre()
                + "\nVida del personaje: " + getVida()
                + "\nAltura del personaje: " + getAltura()
                + "\nFoto del personaje: " + getFoto() + ". En caso de no concordar la altura con la foto del personaje, se atribuye a las dimensiones de esta :v"
                + "\nMascota: ");
        m.mostrarCaracteristicas();
    };
    
    public void setCaracteristicas(String nombre, int vida, float altura, String foto){
        this.nombre = nombre;
        this.vida = vida;
        this.altura = altura;
        this.foto = foto;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Personaje clonar() throws CloneNotSupportedException {
        // Es necesario hacer el typecast porque 'clone()' devuelve 'Object'
        return (Personaje) this.clone();
    }

    public Mascota getMascota() {
        return m;
    }

    public void setMascota(Mascota m) {
        this.m = m;
    }

}
