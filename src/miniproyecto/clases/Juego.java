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
    GestionDias fecha = new GestionDias(1,1,2023);
    int cuentaBanco = 0, cuentaPuerto = 0, cuentaColegio = 0, cuentaUniversidad = 0, cuentaEstacionDeTren = 0, cuentaAeropuerto = 0, cuentaHospital = 0;
    EventosAleatorios eventos;
    
    public Juego() {
       
        balance = new Balance();  
        balance.setDineroGenerado(0);
        balance.setDineroActual(6000);
        eventos = new EventosAleatorios(balance.dineroActual,balance.dineroGenerado);
    }
      
 
    public void bucleJugable(){
        
         Scanner sc = new Scanner(System.in);
        
        //CONSTRUCTORES
        
        
        GestionDias gd = new GestionDias(1,1,2000);
        
        
       int dineroActual = 10000;
       int deuda = 2000000;
       int input;
  
       
       
       
       
        for (int i = 1; deuda > 0; i++) {
            
        
   
       
    String barraHorizontal = "****************************************************************";
    String barraVertical = "***                                                          ***";

System.out.println(barraHorizontal);
System.out.println(barraVertical);
System.out.println("***                   " + fecha.toString() + "                               ***");
System.out.println(barraVertical);
System.out.println("***                 Dinero Actual:"+balance.getDineroActual()+"                       ***");
System.out.println("***                 Deuda:"+deuda+"                             ***");
System.out.println(barraVertical);
System.out.println(barraVertical);
System.out.println("***                 1. Construir                             ***");
System.out.println("***                 2. Pagar Deuda                           ***");
System.out.println("***                 3. Pasar día                             ***");
System.out.println(barraVertical);
System.out.println(barraVertical);
System.out.println(barraHorizontal);
System.out.println("***                 Bancos: "+cuentaBanco+"                                ***");
System.out.println("***                 Puertos: "+cuentaPuerto+"                               ***");
System.out.println("***                 Colegios: "+cuentaColegio+"                              ***");
System.out.println("***                 Universidades: "+cuentaUniversidad+"                         ***");
System.out.println("***                 Estaciones de Tren: "+cuentaEstacionDeTren+"                    ***");
System.out.println("***                 Aeropuertos: "+cuentaAeropuerto+"                           ***");
System.out.println("***                 Hospitales: "+cuentaHospital+"                            ***");
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
                        Construcciones banco = new Construcciones("Banco",8000,3000);
                        if (banco.banco(balance.getDineroActual()) == false) {
                            
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 3000);
                        balance.setDineroGenerado(balance.getDineroGenerado() + 8000);
                        cuentaBanco++;
                        }
                        break;
                    case 2:
                        Construcciones puerto = new Construcciones("Puerto",11000,6000);
                        if(puerto.puerto(balance.getDineroActual()) == false) {
                        
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 6000);
                        balance.setDineroGenerado(balance.getDineroGenerado() + 11000);
                        cuentaPuerto++;
                        }
                        break;
                    case 3:
                        Construcciones colegio = new Construcciones("Colegio",14000,9000);
                        if(colegio.colegio(balance.getDineroActual()) == false) {
                        
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 9000);
                        balance.setDineroGenerado(balance.getDineroGenerado()+14000);
                        cuentaColegio++;
                        }
                        break;
                    case 4:
                        Construcciones universidad = new Construcciones("Universidad",17000,12000);
                        if(universidad.universidad(balance.getDineroActual()) == false) {
                            
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 12000);
                        balance.setDineroGenerado(balance.getDineroGenerado()+17000);
                        cuentaUniversidad++;
                        }
                        break;
                    case 5:
                        Construcciones estacionDeTren = new Construcciones("Estación de Tren",19000,24000);
                        if(estacionDeTren.estacionDeTren(balance.getDineroActual()) == false) {
                            
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 24000);
                        balance.setDineroGenerado(balance.getDineroGenerado()+19000);
                        cuentaEstacionDeTren++;
                        }
                        break;
                    case 6:
                        Construcciones aeropuerto = new Construcciones("Aeropuerto",23000,39000);
                        if(aeropuerto.aeropuerto(balance.getDineroActual()) == false) {
                            
                        }else{
                        balance.setDineroActual(balance.getDineroActual() - 39000);
                        balance.setDineroGenerado(balance.getDineroGenerado()+23000);
                        cuentaAeropuerto++;
                        }
                        break;
                    case 7:
                        Construcciones hospital = new Construcciones("Hospital",29000,55000);                  
                        if (hospital.hospital(balance.getDineroActual()) == false) {          
                        }else{ 
                        balance.setDineroActual(balance.getDineroActual() - 55000);
                        balance.setDineroGenerado(balance.getDineroGenerado()+29000);
                        cuentaHospital++;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
                
            case 2:
                System.out.println("Tu deuda es de: " + deuda + "€");
                System.out.println("¿Cuánto quieres pagar?");
                input = sc.nextInt();
                if (input > balance.getDineroActual()) {
                    System.out.println("No tienes tanto rey");
                }else{
                deuda = deuda - input;
                balance.setDineroActual( balance.getDineroActual()- input);
                System.out.println("Ahora queda: " + deuda + "€ de deuda");
                }
                break;
                
                
            case 3:
                System.out.println("Pasando día...");
                break;
            default:
                System.out.println("Numero incorrecto");
                
                break;
                        
        }
        
        
        
        fecha.cambioDiaAMes29();
        fecha.cambioDiaAMes30();
        fecha.cambioDiaAMes31();
        fecha.cambioAnyo();
        fecha.cambioDia();
        //eventos.ev_Quejas();
        
        
        if (i % 7 == 0  ) {
               System.out.println("Has generado "+ balance.getDineroGenerado() + " esta semana");
               balance.setDineroActual(balance.getDineroActual() + balance.getDineroGenerado());
           }
            
             
        
        }//for
        
        System.out.println("OLEE HAS GANAO!");
        
    }
    
   
          
           
   
}
