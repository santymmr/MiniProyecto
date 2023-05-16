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
    int naleatorio = 22;
    int naleatorio2 = 15;
    int naleatorio3 = 12;
    

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
        System.out.println(" 1. Chinos FUERAAAA      : 50/50 de perder o ganar 50.000€" );
        System.out.println(" 2. Dejar que tome fotos : 5% de Ganar 500.000 o 95% de Perder 1.000.000€");
    }
    
    void imprimirMenu4(){
        System.out.println("Unos hombres de negro exigen que pagues 'la deuda'");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Pagar  : Pierde un 30% de tu dinero, y reduce la probabilidad de este evento" );
        System.out.println(" 2. Correr : 70% de Perder el 80% de tu dinero, o bien 30% de que no pase nada, Cada vez que huyas, habrá mas probabilidades de este evento.");
    }
    
     void imprimirMenu5(){
         int interes = 30;
        System.out.println("Y esta carta del banco... hay que pagar intereses");
        System.out.println("¿Qué debería hacer?...");
        System.out.println(" 1. Haré como que no lo he visto  : Sube tu deuda 70.000€ y el interes a pagar un 10%" );
        System.out.println(   "2. Pagar : Actualmente debería de pagar un " + interes +"% de tu dinero actual");
    }
     
    void ev_Quejas(){
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        //System.out.println("num_aleatorio_generado:" + aleatorio);
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
                System.out.println("Ese numero no fufa");
                
        
        }
        
        
    }
    
    
    
    } // EVENTO QUEJAS
    
    
    void ev_Incendios(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        //System.out.println("num_aleatorio_generado:" + aleatorio);
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
                    naleatorio = naleatorio -9;
                        
                break;
                       
            }default:
                
        
        
        }
        
    }
    
    
    
    } //EVENTOS INCENDIOS
    
    void ev_inversorChino(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        //System.out.println("num_aleatorio_generado:" + aleatorio);
        if (aleatorio <= 10) {
            imprimirMenu3();
        
      
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);               
                if (aleatorio <= 50) {
                    b.setDineroActual(b.getDineroActual() -50000);
                    System.out.println("Bueno, tu racismo te ha costado 50.000€");
                    System.out.println("Ahora tienes: " + b.getDineroActual() + " €");
                }else{
                    b.setDineroActual(b.getDineroActual() +50000);
                    System.out.println("Al man se le han caido 50.000€ pa ti");
                }               
                break;          
            }case 2: {
                if (aleatorio <= 5) {     
                    
                    System.out.println("Numero aleatorio: " + aleatorio);
                    System.out.println("Ennove 1.500.000 pa ti");
                    b.setDineroActual(b.getDineroActual() + 1500000);
                }else{
                    System.out.println("CAGASTE -1.000.000€");
                    b.setDineroActual(b.getDineroActual() - 1000000);              
                }                          
                break;
                       
            }default:
                
        }
        
        
        
    }
    

    
    } // EVENTO INVERSOR CHINO
    
    void deuda(){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        //System.out.println("num_aleatorio_generado:" + aleatorio);
        //System.out.println("naleatorio2: " + naleatorio2);
        
        if (aleatorio < naleatorio2) {
            imprimirMenu4();
       
            
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                aleatorio = NumeroAleatorio.nextInt(100-1);
                if (b.getDineroActual() > 0) {
                     int aux = (int) (b.getDineroActual() - (b.getDineroActual()*0.3));
                    b.setDineroActual(aux);
                    //System.out.println("Diablo perdiste: " + aux);
                    naleatorio2 = naleatorio2 - 5;
                    System.out.println("Ahora esta gente no debería salir tanto");
                }else{
                    int aux = (int) (b.getDineroActual() + (b.getDineroActual()*0.3));
                    b.setDineroActual(aux);
                    //System.out.println("Diablo perdiste: " + aux);
                    naleatorio2 = naleatorio2 - 5;
                    System.out.println("Ahora esta gente no debería salir tanto");
                }
                }  
                
                break;          
            case 2: {
                if (aleatorio <=70) {                          
                   int aux = (int) (b.getDineroActual() - (b.getDineroActual()*0.8));
                    b.setDineroActual( aux);
                    System.out.println("Has Pagado: "+ aux);            
                   
                }else if (aleatorio >= 30){
                    System.out.println("Has salido corriendo... y no te han podido seguir, pero están buscandote");  
                    naleatorio2 = naleatorio2 + 5;
                }   
                
                break;
        
        }default:
               
        }
        
           }
        
     } // FIN DEL EVENTO DEUDA
    
    
     int intereses(int deuda){
        int ranAlto = 100;
        int ranBajo = 1;
        int aleatorio = NumeroAleatorio.nextInt(100-1);
        //System.out.println("num_aleatorio_generado:" + aleatorio);
        //System.out.println("naleatorio2: " + naleatorio2);
        
        if (aleatorio < naleatorio3) {
            imprimirMenu5();
            int interes = 30;
            double interesCalc = 0.3;
            
        eleccion = sc.nextInt();
        
        switch (eleccion) {
           
            case 1:{
                
                
                System.out.println("Ignorada padre...");
                deuda = deuda + 70000;
                interes = interes + 10;
                System.out.println("Ahora la interes ha subido a un " + interes + "%");
                System.out.println("Y tu deuda es ahora " + deuda + " mas cara");
                return deuda;
          
                }  
                  
            case 2: {
               int aux = (int) (b.getDineroActual() - (b.getDineroActual()*interesCalc));
                    b.setDineroActual(aux);
                System.out.println("Has pagado las deudas por ahora");
                naleatorio3 = naleatorio3 - 3;
                
                return deuda = deuda + 0;
                
                
        
        }default:
               
        }
        
           }
        
            return deuda = deuda + 0;
     }
     
    
}
