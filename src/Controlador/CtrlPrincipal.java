/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ConversionMoneda;
import Vista.FormularioConversionMoneda;

/**
 *
 * @author papu_master
 */
public class CtrlPrincipal {
    private FormularioConversionMoneda vista;
    private ConversionMoneda operacion;
    
    public CtrlPrincipal(FormularioConversionMoneda vis, ConversionMoneda ope){
        this.vista = vis;
        this.operacion = ope;
        
        this.eventos();
        this.iniciar();
    }
    
    private void eventos(){
        this.vista.getBtnDolar().addActionListener(e->calcularDolar());
        this.vista.getBtnEuro().addActionListener(e->calcularEuro());
        this.vista.getBtnYen().addActionListener(e->calcularYen());
        this.vista.getBtnEsterlina().addActionListener(e->calcularEsterlina());
        this.vista.getBtnLimpiar().addActionListener(e->limpiarCampos());
    }
    
    private void iniciar(){
        this.vista.setTitle("Conversión Moneda Mexicana");
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
    
    public void limpiarCampos(){
        this.vista.setTxtCantidadPesos("");
        this.vista.setLblResultado("");
    }
    
    public void calcularDolar(){
        this.operacion.setCantPesosMexa(Double.parseDouble(this.vista.getTxtCantidadPesos().getText()));
        this.vista.setLblResultado(Double.toString(this.operacion.Dolar()));
    }
    
    public void calcularEuro(){
        this.operacion.setCantPesosMexa(Double.parseDouble(this.vista.getTxtCantidadPesos().getText()));
        this.vista.setLblResultado(Double.toString(this.operacion.Euro()));
    }
    
    public void calcularYen(){
        this.operacion.setCantPesosMexa(Double.parseDouble(this.vista.getTxtCantidadPesos().getText()));
        this.vista.setLblResultado(Double.toString(this.operacion.Yen()));
    }
    
    public void calcularEsterlina(){
        this.operacion.setCantPesosMexa(Double.parseDouble(this.vista.getTxtCantidadPesos().getText()));
        this.vista.setLblResultado(Double.toString(this.operacion.Esterlina()));
    }
}
