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
    
      
    public int banco(int tuDinero){
        costo = 3000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 8000;    
        }
        return dineroGenerado;
    }
    
     public int puerto(int tuDinero){
        costo = 6000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 11000;    
        }
        return dineroGenerado;
    }
     
      public int colegio(int tuDinero){
        costo = 9000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 14000;    
        }
        return dineroGenerado;
    }
      
       public int universidad(int tuDinero){
        costo = 12000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 17000;    
        }
        return dineroGenerado;
    }
       
        public int estacionDeTren(int tuDinero){
        costo = 24000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 19000;    
        }
        return dineroGenerado;
    }
        
         public int aeropuerto(int tuDinero){
        costo = 39000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 23000;    
        }
        return dineroGenerado;
    }
         
          public int hospital(int tuDinero){
        costo = 55000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            dineroGenerado = 0;          
        }else{
            System.out.println("Se va a construir. . .");
        dineroGenerado = 29000;    
        }
        return dineroGenerado;
    }
    
    
    
    
   
    
}
