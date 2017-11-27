/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOUser;
import model.DBManagedObject;
import model.User;
import view.viewUser;


/**
 *
 * @author alumno
 */
public class controllerUser {

    protected viewUser unaVista;
    private DAOUser objUser;
    private User oUser;
    
    public controllerUser(viewUser Vista) {
        this.unaVista = Vista;
        this.oUser = new User();
        this.objUser = new DAOUser();
        

    }

    public void run() {
        
        unaVista.EscribirFormulario();
        oUser.setUsername(unaVista.getUsername());
        oUser.setEmail(unaVista.getEmail());
        oUser.setPassword(unaVista.getPassword());
        
        System.out.println("yy "+oUser);
        
        if (!objUser.Create(oUser)){
            System.out.println("Error");
        }else{
            System.out.println("Se ingreso correctamente");
            System.out.println("Se registro un usuario: "+unaVista.getUsername()+" con el email "+unaVista.getEmail());
        }
        
    }

    
}
