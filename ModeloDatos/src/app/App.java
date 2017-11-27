/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.controllerApp;
import controller.controllerPay;
import java.util.ArrayList;
import java.util.List;
import model.DAOUser;
import model.DBManagedObject;
import model.Pair;
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
//        controllerApp unControlador = new controllerApp(new ViewConsole());
//        unControlador.run();

//        controllerPay controllerPay = new controllerPay(new viewPay());
//        controllerPay.run();
        DAOUser ou = new DAOUser();
        DBManagedObject db = new DBManagedObject();
        
        db.getColumns().add("h");
//        db.getColumns().add("o");
//        db.getColumns().add("l");
//        db.getColumns().add("a");

        ArrayList<Pair> a = new ArrayList<>();

        Pair p = new Pair("String", "Hola");
        
        a.add(p);
        a.add(new Pair("String", "Chau"));
        
        System.out.println("y "+db.getColumns().get(1));
        //List<Pair<String, String>> listValues = db.listValues;

    }

}
