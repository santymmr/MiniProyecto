/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.clases;

import java.util.Scanner;


/**
 *
 * @author dam1
 */
public class Juego {
    
    Balance balance;
    Construcciones construcciones;
    
    public Juego() {
        balance = new Balance(10000,2000);          
    }
      
 
    public void bucleJugable(){
        
         Scanner sc = new Scanner(System.in);
        
        //CONSTRUCTORES
        
        GestionDias gd = new GestionDias(1,1,2000);
        
        
       int dineroActual = 10000;
       int deuda = 200000;
       int input;
  
        for (int i = 0; deuda != 0; i++) {
            
        
   
       
    String barraHorizontal = "*********************************************************";
    String barraVertical = "***                                                   ***";

System.out.println(barraHorizontal);
System.out.println(barraVertical);
System.out.printf("***                  %-30s***\n", gd.toString().trim());
System.out.println(barraVertical);
System.out.println("***                 Dinero Actual:"+dineroActual+"         ***");
System.out.println("***                 Deuda:"+deuda+"         ***");
System.out.println(barraVertical);
System.out.println(barraVertical);
System.out.println("***                 1. Construir                         ***");
System.out.println("***                 2. Pagar Deuda                       ***");
System.out.println(barraVertical);
System.out.println(barraVertical);
System.out.println(barraHorizontal);

       
        input = sc.nextInt();
        
        switch (input) {
            case 1:
                System.out.println("Construcción");
                System.out.println(" 1. Banco            | Coste: 3000€  | Genera: 8000€ / Semana");
                System.out.println(" 2. Puerto           | Coste: 6000€  | Genera: 11000€ / Semana");
                System.out.println(" 3. Colegio          | Coste: 9000€  | Genera: 14000€ / Semana");
                System.out.println(" 4. Universidad      | Coste: 12000€ | Genera: 17000€ / Semana");
                System.out.println(" 5. Estación de Tren | Coste: 24000€ | Genera: 19000€ / Semana");
                System.out.println(" 6. Aeropuerto       | Coste: 39000€ | Genera: 23000€ / Semana");
                System.out.println(" 7. Hospital         | Coste: 55000€ | Genera: 29000€ / Semana");
                
                input = sc.nextInt();
                switch (input) {
                    case 1:                     
                        construcciones.banco(dineroActual); 
                        break;
                    case 2:    
                        construcciones.puerto(dineroActual);
                        break;
                    case 3:
                        construcciones.colegio(dineroActual);
                        break;
                    case 4:
                        construcciones.universidad(dineroActual);
                        break;
                    case 5:
                        construcciones.estacionDeTren(dineroActual);
                        break;
                    case 6:
                        construcciones.aeropuerto(dineroActual);
                        break;
                    case 7:
                        construcciones.hospital(dineroActual);
                    default:
                        throw new AssertionError();
                }
                break;
                
            case 2:
                System.out.println("Tu deuda es de: " + deuda + "€");
                System.out.println("¿Cuánto quieres pagar?");
                input = sc.nextInt();
                if (input > dineroActual) {
                    System.out.println("No tienes tanto rey");
                }else{
                deuda = deuda - input;
                dineroActual = dineroActual - input;
                System.out.println("Ahora queda: " + deuda + "€ de deuda");
                }
                break;
            default:
                throw new AssertionError();
        }
        
        }//for
    }
    
}
