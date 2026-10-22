/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvc_con_formulario;


import Controlador.CtrlPrincipal;
import Modelo.ConversionMoneda;
import Vista.FormularioConversionMoneda;


/**
 *
 * @author papu_master
 */
public class MVC_Con_Formulario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FormularioConversionMoneda vista = new FormularioConversionMoneda();
        ConversionMoneda conversion = new ConversionMoneda();
        CtrlPrincipal controlador = new CtrlPrincipal(vista, conversion);
    }
    
}
