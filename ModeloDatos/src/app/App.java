/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.controllerApp;
import controller.controllerPay;
import view.ViewConsole;
import view.viewPay;

/**
 *
 * @author walter
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        controllerApp unControlador = new controllerApp(new ViewConsole());
        unControlador.run();
        
//        controllerPay controllerPay = new controllerPay(new viewPay());
//        controllerPay.run();

    }
    
}
