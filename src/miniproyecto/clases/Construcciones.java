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
    Balance balance;
    
    
    public Construcciones(String nombre, int dineroGenerado, int costo) {
        this.nombre = nombre;
        this.dineroGenerado = dineroGenerado;
        this.costo = costo;
    }
      
    public int generarDinero(){
        dineroGenerado += 5000;
        return dineroGenerado;
    }
    
      
    public boolean banco(int tuDinero){
        costo = 3000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;          
        }else{
            System.out.println("Se va a construir. . .");
           
        }
        return true;
    }
    
     public boolean puerto(int tuDinero){
        costo = 6000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;
            
        }else{
            System.out.println("Se va a construir. . .");
            
        }
        return true;
    }
     
      public boolean colegio(int tuDinero){
        costo = 9000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;         
        }else{
            System.out.println("Se va a construir. . .");
           
        }
        return true;
    }
      
       public boolean universidad(int tuDinero){
        costo = 12000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;          
        }else{
            System.out.println("Se va a construir. . .");
            
        }
        return true;
    }
       
        public boolean estacionDeTren(int tuDinero){
        costo = 24000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;          
        }else{
            System.out.println("Se va a construir. . .");
          
        }
        return true;
    }
        
         public boolean aeropuerto(int tuDinero){
        costo = 39000;
              
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;         
        }else{
            System.out.println("Se va a construir. . .");
           
        }
        return true;
    }
         
          public boolean hospital(int tuDinero){
        costo = 55000;             
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;         
        }else{
            System.out.println("Se va a construir. . .");        
        }
        return true;
    }
          
          public boolean bolsa(int tuDinero){
        costo = 125000;             
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;         
        }else{
            System.out.println("Se va a construir. . .");        
        }
        return true;
    }
          
          
           public boolean minas(int tuDinero){
        costo = 285000;             
        if (tuDinero < costo) {
            System.out.println("No tienes fondos para comprar eso.");
            return false;         
        }else{
            System.out.println("Se va a construir. . .");        
        }
        return true;
    }
          
    
}
