/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class FabricaHumanos extends FabricaPersonajes {

    private Humano h = new Humano();
    
    @Override
    public Personaje crearPersonaje() {
        return h.crear();
    }
}
