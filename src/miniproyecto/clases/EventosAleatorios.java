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
    Random NumeroAleatorio = new Random();
    Scanner sc = new Scanner(System.in);
    int eleccion;
    Balance b;
    int naleatorio = 40;

    public EventosAleatorios(int dineroActual, int dineroGenerado, Balance b)
    {
        super();
        this.b = b;
        
    }
    
    void imprimirMenu1(){
        System.out.println("La gente está decepcionada con la gestión");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Ignorar la situación         : 40% de ganar 90.000€, 60% perder 50.000€ " );
        System.out.println(" 2. Hablar en público            : 10% de ganar 200.000€, 90% de perder TODO");
        System.out.println(" 3. Prometer mejoras             : Ganar 10.000€");
    }
    
    void imprimirMenu2(){
        System.out.println("Hay muchos incendios últimamente...");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Ignorar la situación         : Pierde 12.000€ " );
        System.out.println(" 2. Instalar extintores nuevos   : Pierde 40.000€ + Baja la probabilidad de que vuelva a salir este evento");
    }
    
    void imprimirMenu3(){
        System.out.println("Un inversor chino ha venido a ver tu ciudad");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Chinos FUERAAAA      : 50% Ganar 10.000€ o 50% de Perder" );
        System.out.println(" 2. Dejar que tome fotos : 5% de Ganar 500.000 o 95% de Perder 1.000.000€");
    }
    
    void imprimirMenu4(){
        System.out.println("Unos hombres de negro exigen que pagues 'la deuda'");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Pagar  : Pierde un 30% de tu dinero" );
        System.out.println(" 2. Correr : 70% de Perder el 80% de tu dinero");
    }
     
    void ev_Quejas(){
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        System.out.println("num_aleatorio_generado:" + aleatorio);
        if (aleatorio <= 6) {
            imprimirMenu1();
        
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
            case 1:{
                aleatorio = NumeroAleatorio.nextInt(100-1);               
                if (aleatorio <= 40) {
                    b.setDineroActual(b.getDineroActual() + 90000);
                    System.out.println("Al final el tema ha pasado de largo con éxito, + 90.000 €");
                    System.out.println("Ahora tienes: " + b.getDineroActual() + " €");
                }else{
                    System.out.println("Vaya, han hecho huelga por ello, -50000 €");
                    b.setDineroActual(b.getDineroActual() - 50000);
                    System.out.println("Ahora tienes: " + b.getDineroActual() + " €");
                }               
                break;          
            }case 2: {
                aleatorio = NumeroAleatorio.nextInt(100-1); 
                if (aleatorio <= 10) {                 
                    System.out.println("Has convencido a la gente con tu discurso, barbaridad");
                    b.setDineroActual(b.getDineroActual() + 200000);
                }else{
                    System.out.println("DESASTREEEEEEEEEEEEEE");
                    if (b.dineroActual < 0) {
                        
                    }else{
                    b.setDineroActual( b.getDineroActual()- b.getDineroActual()) ;
                    }
                }                           
                break;
            
            }case 3:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);               
                if (aleatorio <= 100) {
                    b.setDineroActual(b.getDineroActual() + 10000);
                    System.out.println("A lo seguro perro, toma los 10.000€");
                    System.out.println("Ahora tienes: " + getDineroActual() + " €");
                }else{
                    System.out.println("Nada");
                   
                }
                
                break;
                
            }default:
                throw new AssertionError();
        }
        
        
        
    }
    
    
    
    } // EVENTO QUEJAS
    
    
    void ev_Incendios(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        System.out.println("num_aleatorio_generado:" + aleatorio);
        if (aleatorio <= naleatorio) {
            imprimirMenu2();
        
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);               
                if (aleatorio <= naleatorio) {
                    b.setDineroActual(b.getDineroActual() -12000);
                    System.out.println("Que desastre jefe");
                    System.out.println("Ahora tienes: " + b.getDineroActual() + " €");
                }else{
                    System.out.println("esto no deberia de irj skjs");
                }               
                break;          
            }case 2: {
                                            
                    System.out.println("Ahora debería de haber menos incendios");
                    b.setDineroActual(b.getDineroActual() - 40000);
                    naleatorio = naleatorio -20;
                                          
                break;
                       
            }default:
                throw new AssertionError();
        }
        
        
        
    }
    
    
    
    } //EVENTOS INCENDIOS
    
    void ev_inversorChino(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        System.out.println("num_aleatorio_generado:" + aleatorio);
        if (aleatorio <= 10) {
            imprimirMenu3();
        
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);               
                if (aleatorio <= 50) {
                    b.setDineroActual(b.getDineroActual() -50000);
                    System.out.println("Bueno, tu racismo te ha costado 50.000");
                    System.out.println("Ahora tienes: " + b.getDineroActual() + " €");
                }else{
                    b.setDineroActual(b.getDineroActual() +50000);
                    System.out.println("esto no deberia de irj skjs");
                }               
                break;          
            }case 2: {
                if (aleatorio <= 5) {                          
                    System.out.println("");
                    b.setDineroActual(b.getDineroActual() + 50000);
                }else{
                    b.setDineroActual(b.getDineroActual() - 1000000);              
                }                          
                break;
                       
            }default:
                throw new AssertionError();
        }
        
        
        
    }
    
    
    
    } // EVENTO INVERSOR CHINO
    
    void deuda(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        System.out.println("num_aleatorio_generado:" + aleatorio);
        if (aleatorio <= 10) {
            imprimirMenu4();
        
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);               
               
                    b.setDineroActual(b.getDineroActual() - b.getDineroActual());
                    System.out.println("Bueno, tu racismo te ha costado 50.000");
                    
                }               
                break;          
            }case 2: {
                if (aleatorio <= 5) {                          
                    System.out.println("");
                    b.setDineroActual(b.getDineroActual() + 50000);
                }else{
                    b.setDineroActual(b.getDineroActual() - 1000000);              
                }                          
                break;
               
            }default:
                throw new AssertionError();
        }
        
        
        
    }
    
}
