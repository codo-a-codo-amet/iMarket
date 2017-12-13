/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.FactoryController;
import controller.controllerUser;
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

        DBManagedObject obj = FactoryController.getController("user");
        
        //Para ingresar los tipos de usuario
//        controllerUserType controllerUserType = new controllerUserType();
//        controllerUserType.run();        

        //Para listar usuarios
        controllerUser controllerUser = new controllerUser();
        controllerUser.run();  
        
    }

    
    
    
    
}
