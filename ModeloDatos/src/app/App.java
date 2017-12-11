/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.FactoryController;
import model.DBManagedObject;


/**
 *
 * @author walter
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        DBManagedObject obj = FactoryController.getController("usertype");
        
        System.out.println("columna "+obj.getColumns().get(0));

        //Para ingresar los tipos de usuario
//        controllerUserType controllerUserType = new controllerUserType();
//        controllerUserType.run();        
                
        
    }

    
    
    
    
}
