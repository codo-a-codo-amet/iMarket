/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Date;
import model.DAOPay;
import model.Pay;
import view.viewPay;

/**
 *
 * @author walter
 */
public class controllerPay {
 
    protected viewPay unaVista;
    private DAOPay objPay;
    private Pay oPay;

    public controllerPay(viewPay Vista) {
        this.unaVista = Vista;
        this.oPay = new Pay();
        this.objPay = new DAOPay();
        
    }

    public void run() {
        
        unaVista.EscribirFormulario();
        oPay.setDescripcion(unaVista.getDes());
        
        if (!objPay.Create(oPay)){
            System.out.println("Error");
        }else{
            System.out.println("Se ingreso correctamente");
            System.out.println("Forma de Pago: "+unaVista.getDes());
        }
        
    }
    
}
