/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOPay;
import model.Pay;
import view.ViewConsole;

/**
 *
 * @author walter
 */
public class controllerApp {
protected ViewConsole unaVista;

    public controllerApp(ViewConsole Vista) {
        this.unaVista = Vista;
    }

    public void run() {
        
        unaVista.EscribirFormulario();

        System.out.println("Usuario:"+unaVista.getU());
        
//        System.out.println("Hola Mundo!!!");
//        Pay pay = new Pay();
//        DAOPay p = new DAOPay();
//        
//        pay.setDescripcion("Vendedor");
//        System.out.println("El resultado es "+p.Create(pay));
//        
//        System.out.println("Chau Mundo!!!");
        
    }
}
