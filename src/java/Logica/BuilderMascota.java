/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author CRISTIAN CAMILO
 */
public class BuilderMascota implements Builder{
    
    private String tipo, color, poder, foto;
    private int danoPoder;

    public BuilderMascota() {
    }
    
    public BuilderMascota buildTipo(String tipo){
        this.tipo = tipo;
        return this;
    }
    
    public BuilderMascota buildColor(String color){
        this.color = color;
        return this;
    }
    
    public BuilderMascota buildPoder(String poder){
        this.poder = poder;
        return this;
    }
    
    public BuilderMascota buildFoto(String foto){
        this.foto = foto;
        return this;
    }
    
    public BuilderMascota buildDanoPoder(int dañoPoder){
        this.danoPoder = dañoPoder;
        return this;
    }
    
    @Override
    public Mascota build() {
        Mascota m = new Mascota();
        m.setTipo(this.tipo);
        m.setColor(this.color);
        m.setPoder(this.poder);
        m.setFoto(this.foto);
        m.setDanoPoder(this.danoPoder);
        return m;
    }
    
    
}
