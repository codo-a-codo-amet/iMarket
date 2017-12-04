/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOManager;
import model.User;
import model.UserDatails;


/**
 *
 * @author alumno
 */
public class controllerUserDetails {

    private DAOManager objUser;
    private UserDatails oUD;
    
    public controllerUserDetails() {
        this.oUD = new UserDatails();
        this.objUser = DAOManager.getInstance();
    }

    public void run() {
        oUD.setName("Nombre");
        oUD.setSurname("Apellido");
        oUD.setDni("22333777");
        oUD.setBirth_date("1970-11-30");
        oUD.setAddress("Calle 1 567");
        oUD.setTelephone("44448888");
        
        oUD.getValues().get(0).getLeft();
        oUD.getValues().get(0).getRight();
        
        System.out.println("yy "+oUD.getName());
        
        if (!objUser.Create(oUD)){
            System.out.println("Error");
        }else{
            System.out.println("Se ingreso correctamente");
        }
        
    }

    
}
