/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.DAOPay;
import model.Pay;

/**
 *
 * @author walter
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");
        Pay pay = new Pay();
        DAOPay p = new DAOPay();
        
        pay.setDescripcion("Vendedor");
        System.out.println("El resultado es "+p.Create(pay));
        
        System.out.println("Chau Mundo!!!");
    }
    
}
