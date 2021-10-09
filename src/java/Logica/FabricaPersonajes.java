/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public abstract class FabricaPersonajes {

    public Personaje iniciarPersonaje(String naturaleza, String nombre, int vida, float altura, String foto) {
        Personaje p = crearPersonaje();
        p.setNaturaleza(naturaleza);
        p.setNombre(nombre);
        p.setVida(vida);
        p.setAltura(altura);
        p.setFoto(foto);
        System.out.println("Se ha creado correctamente un personaje de tipo " + naturaleza + "!");
        return p;
    }

    public abstract Personaje crearPersonaje();
}
