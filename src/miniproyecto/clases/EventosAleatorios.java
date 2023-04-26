/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.clases;

import java.util.HashSet;
import miniproyecto.clases.Balance;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class EventosAleatorios extends Balance {
    Random NumeroAleatorio = new Random(100-1);
    Scanner sc = new Scanner(System.in);
    int eleccion;
    Balance b;

    public EventosAleatorios(int dineroActual, int dineroGenerado) {
        super(dineroActual, dineroGenerado);
    }
    
    void imprimirMenu(){
        System.out.println("La gente está decepcionada con la gestión >:c");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Ignorar la situación --> 40% de ganar 8.000€, 60% perder 3000€ " );
        System.out.println(" 2. Hablar en público --> 40% de que la siguiente construcción sea gratuita");
        System.out.println(" 3. Pos subir los impuestos jaja --> 20% de ganar 15.000€, 80% de que la siguiente construcción sea un 30% mas cara.");
    }
     
    void ev_Quejas(){
        int aleatorio = NumeroAleatorio.nextInt();
        if (aleatorio < 10) {
            imprimirMenu();
        }
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
            case 1:{
                aleatorio = NumeroAleatorio.nextInt();               
                if (aleatorio < 40) {
                    b.setDineroActual(dineroActual+8000);
                    System.out.println("Al final el tema ha pasado de largo con éxito, + 8000 €");
                    System.out.println("Ahora tienes: " + getDineroActual() + " €");
                }else{
                    System.out.println("Vaya, han hecho huelga por ello, - 3000 €");
                    b.setDineroActual(dineroActual-3000);
                    System.out.println("Ahora tienes: " + getDineroActual() + " €");
                }               
                break;          
            }case 2: {
                aleatorio = NumeroAleatorio.nextInt(); 
                if (aleatorio < 40) {                 
                    System.out.println("Has convencido a la gente con tu discurso, Tienes una construcción gratis");
                    //Implementar la construsion gratis.
                }else{
                    System.out.println("No ha sucedido nada...");                          
                }                           
                break;
            
            }case 3:{
                
                aleatorio = NumeroAleatorio.nextInt();               
                if (aleatorio < 20) {
                    setDineroActual(dineroActual+15000);
                    System.out.println("Vaya dictadura mas guapa te estas montando + 15.000 €");
                    System.out.println("Ahora tienes: " + getDineroActual() + " €");
                }else{
                    System.out.println("La gente se ha cabreado mas, no abras Twitter, 30% mas cara la siguiente construcción");
                    // IMPLEMENTAR ESA WEA
                }
                
                break;
                
            }default:
                throw new AssertionError();
        }
        
        
        
    }
    
    
    
    
    
    
    
    
}
