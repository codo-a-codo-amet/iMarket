/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DAOManager;
import model.UserType;

/**
 *
 * @author alumno
 */
public class controllerUserType {

    private DAOManager objUT;
    private UserType oUT;
    
    public controllerUserType() {
        this.oUT = new UserType();
        this.objUT = DAOManager.getInstance();
    }

    public void run() {
        oUT.setUserType("Vendedor");
        oUT.setID("1");
        
        oUT.getValues().get(0).getLeft();
        oUT.getValues().get(0).getRight();
        
        System.out.println("yy "+oUT.getUserType());
        
//        if (!objUT.Create(oUT)){
//            System.out.println("Error");
//        }else{
//            System.out.println("Se ingreso correctamente");
//        }

        if (!objUT.Update(oUT)){
            System.out.println("Error");
        }else{
            System.out.println("Se actualizo correctamente");
        }


        
    }

    
}
