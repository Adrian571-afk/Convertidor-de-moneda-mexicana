/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author papu_master
 */
public class ConversionMoneda {
    private double cantPesosMexa;

    public double getCantPesosMexa() {
        return cantPesosMexa;
    }

    public void setCantPesosMexa(double cantPesosMexa) {
        this.cantPesosMexa = cantPesosMexa;
    }
    
   public double Dolar(){
       return this.cantPesosMexa * 0.058;
   }
   
   public double Euro(){
       return this.cantPesosMexa * 0.05;
   }
   
   public double Yen(){
       return this.cantPesosMexa * 9;
   }
   
   public double Esterlina(){
       return this.cantPesosMexa * 0.044;
   }
    
}
