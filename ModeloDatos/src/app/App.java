/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.controllerUser;
import java.util.ArrayList;
import model.DAOManager;
import model.DBManagedObject;
import model.Pair;
import view.viewUser;

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

        controllerUser controllerUser = new controllerUser(new viewUser());
        controllerUser.run();


        DAOManager ou = DAOManager.getInstance();
        DBManagedObject db = new DBManagedObject();
        
        db.listValues.add(new Pair<>("String", "Hola"));
//        ArrayList<Pair> a = new ArrayList<>();
//
//        Pair p = new Pair("String", "Hola");
//        
//        a.add(p);
//        a.add(new Pair("String", "Chau"));
//        
        System.out.println("y "+db.getColumns().get(0));

    }

}
