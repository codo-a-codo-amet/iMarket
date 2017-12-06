/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOManager;
import model.Pay;

/**
 *
 * @author walter
 */
public class controllerPay {
 
    private Pay oPay;
    private DAOManager objPay;

    public controllerPay() {
        this.oPay = new Pay();
        this.objPay = DAOManager.getInstance();
        
        
    }

    public void run() {
        oPay.setID("1");
        oPay.setDescription("Tarjeta");

//        oPay.getValues().get(0).getLeft();
//        oPay.getValues().get(0).getRight();
        
//        if (!objPay.Create(oPay)){
//            System.out.println("Error");
//        }else{
//            System.out.println("Se ingreso correctamente");
//            System.out.println("Forma de Pago: "+oPay.getDescription());
//        }

        if (!objPay.Update(oPay)){
            System.out.println("Error");
        }else{
            System.out.println("Se actualizo correctamente");
            System.out.println("Forma de Pago: "+oPay.getDescription());
        }
        
    }
    
}
