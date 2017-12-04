/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.controllerUser;
import controller.controllerUserDetails;
import controller.controllerUserState;
import controller.controllerUserType;


/**
 *
 * @author walter
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        controllerApp unControlador = new controllerApp(new ViewConsole());
//        unControlador.run();

//        controllerPay controllerPay = new controllerPay(new viewPay());
//        controllerPay.run();
//        User db = new User();
//
//        db.setUsername("walter ");
//        db.setEmail("w@w.com ");
//        db.setPassword("2344 ");
//
//        for (int i = 0; i < db.listColumns.size(); i++) {
//            System.out.println("cant colum " + i);
//            System.out.println("colum " + db.getColumns().get(i));
//            System.out.println("left " + db.getValues().get(i).getLeft());
//            System.out.println("right " + db.getValues().get(i).getRight());
//        }

        //Para ingresar un usuario
        controllerUser controllerUser = new controllerUser();
        controllerUser.run();

        //Para ingresar los datos del usuario
        //controllerUserDetails controllerUserDetails = new controllerUserDetails();
        //controllerUserDetails.run();

        //Para ingresar los estados de los usuarios
        //controllerUserState controllerUserState = new controllerUserState();
        //controllerUserState.run();

        //Para ingresar los tipos de usuario
        //controllerUserType controllerUserType = new controllerUserType();
        //controllerUserType.run();        
        
    }

    
    
    
    
}
