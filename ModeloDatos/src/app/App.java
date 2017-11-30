/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.controllerUser;
import model.User;
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
        User db = new User();

        db.setUsername("walter ");
        db.setEmail("w@w.com ");
        db.setPassword("2344 ");

        for (int i = 0; i < db.listColumns.size(); i++) {
            System.out.println("cant colum " + i);
            System.out.println("colum " + db.getColumns().get(i));
            System.out.println("left " + db.getValues().get(i).getLeft());
            System.out.println("right " + db.getValues().get(i).getRight());
        }

        controllerUser controllerUser = new controllerUser(new viewUser());
        controllerUser.run();

    }

}
