/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOManager;
import model.UserState;

/**
 *
 * @author alumno
 */
public class controllerUserState {

    private DAOManager objUser;
    private UserState oUS;
    
    public controllerUserState() {
        this.oUS = new UserState();
        this.objUser = DAOManager.getInstance();
    }

    public void run() {
        oUS.setStateName("Activo");
        
        oUS.getValues().get(0).getLeft();
        oUS.getValues().get(0).getRight();
        
        System.out.println("yy "+oUS.getStateName());
        
        if (!objUser.Create(oUS)){
            System.out.println("Error");
        }else{
            System.out.println("Se ingreso correctamente");
        }
        
    }

    
}
