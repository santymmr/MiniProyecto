/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniproyecto.clases;

/**
 *
 * @author dam1
 */
public class GestionDias {
    int dia;
    int mes;
    int anyo;

    public GestionDias(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    @Override
    public String toString() {
        return + dia + "/" + mes + "/" + anyo;
    }
    
    public void cambioDiaAMes31(){
        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 31){
                
            dia = 0;
            if (getMes() <= 12) {
                mes = getMes() + 1;
            }else{
                anyo = getAnyo() + 1;
            }
                              
        }
    }
    
    public void cambioDiaAMes30(){
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30){
                
            dia = 0;
            if (getMes() <= 12) {
                mes = getMes() + 1;
            }else{
                anyo = getAnyo() + 1;
            }   
     
        }   
    }
      public void cambioDiaAMes29(){
        if ((mes == 2) && dia == 29){
                
            dia = 0;
            if (getMes() <= 12) {
                mes = getMes() + 1;
            }else{
                anyo = getAnyo() + 1;
            }
            
            
        }
        
       
    }
      
       public void cambioAnyo(){
            if ((mes == 12) && dia == 31){
                dia = 0;
                mes = 0;
            }
        }
      
      public void cambioDia(){
          dia++;
      }
    
      
      
    
}
