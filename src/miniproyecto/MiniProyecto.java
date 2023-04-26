/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniproyecto;

import java.util.Scanner;
import miniproyecto.clases.Balance;
import miniproyecto.clases.GestionDias;
import miniproyecto.clases.Juego;

/**
 *
 * @author dam1
 */
public class MiniProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
       Juego juego = new Juego();
       Scanner sc = new Scanner(System.in);
       
       
       juego.bucleJugable();
      
       
       
    }
    
}
