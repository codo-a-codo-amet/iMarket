/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOManager;
import model.Pair;
import model.User;
import view.viewUser;


/**
 *
 * @author alumno
 */
public class controllerUser {

    protected viewUser unaVista;
    private DAOManager objUser;
    private User oUser;
    
    public controllerUser() {
        this.oUser = new User();
        this.objUser = DAOManager.getInstance();
        

    }

    public controllerUser(viewUser Vista) {
        this.unaVista = Vista;
        this.oUser = new User();
        this.objUser = DAOManager.getInstance();
        

    }

    
    public void run() {
        
        oUser.setUsername("wac");
        oUser.setEmail("wac@wac.com");
        oUser.setPassword("1234");
        oUser.setUser_details_ID("1");
        oUser.setUser_state_ID("1");
        oUser.setUser_types_ID("1");
        
        oUser.getValues().get(0).getLeft();
        oUser.getValues().get(0).getRight();
        
        System.out.println("yy "+oUser.getUsername());
        
        if (!objUser.Create(oUser)){
            System.out.println("Error");
        }else{
            System.out.println("Se ingreso correctamente");
            //System.out.println("Se registro un usuario: "+unaVista.getUsername()+" con el email "+unaVista.getEmail());
        }
        
    }

    
}
