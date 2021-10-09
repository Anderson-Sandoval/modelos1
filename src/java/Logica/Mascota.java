/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class Mascota {

    private String tipo, color, poder, foto;
    private int danoPoder;

    public Mascota(){}
    
    public void mostrarCaracteristicas(){
        System.out.println("Soy una mascota de tipo: " + tipo +
                "\nSoy de color: " + color +
                "\nMi poder es: " + poder +
                "\nEl dano que hago es: " + danoPoder +
                "\nEsta es mi foto: " + foto);
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public int getDanoPoder() {
        return danoPoder;
    }

    public void setDanoPoder(int danoPoder) {
        this.danoPoder = danoPoder;
    }

}
