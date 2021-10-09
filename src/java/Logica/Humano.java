/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Humano extends Personaje {

    public Humano(){
        
    }
        
    @Override
    public Personaje crear() {
        return new Humano();
    }
    
}
