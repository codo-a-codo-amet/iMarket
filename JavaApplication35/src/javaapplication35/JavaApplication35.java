/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication35;

import javaapplication35.controllers.Controller;
import javaapplication35.controllers.MasterController;

/**
 *
 * 
 */
public class JavaApplication35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // MasterController controller = new MasterController();
        MasterController controller = MasterController.getInstance();
        controller.peekTheStack();
        controller.addControllerToStack(new Controller("Pagina 2"));
        controller.peekTheStack();
        controller.addControllerToStack(new Controller("Pagina 3"));
        controller.peekTheStack();
        controller.removeControllerFromStack();
        controller.peekTheStack();
        
    }
    
}
