/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class FabricaMagos extends FabricaPersonajes {

    private Mago m = new Mago();

    @Override
    public Personaje crearPersonaje() {
        return m.crear();
    }
}
