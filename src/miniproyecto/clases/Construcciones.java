/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.clases;

/**
 *
 * @author dam1
 */
public class Construcciones {
    
    String nombre;
    int dineroGenerado;
    int costo;

    public Construcciones(String nombre, int dineroGenerado, int costo) {
        this.nombre = nombre;
        this.dineroGenerado = dineroGenerado;
        this.costo = costo;
    }
      
    public int generarDinero(){
        dineroGenerado += 5000;
        return dineroGenerado;
    }
    
      
    
   
    
}
