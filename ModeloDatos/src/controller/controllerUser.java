/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.DAOManager;
import model.DBManagedObject;
import model.User;


/**
 *
 * @author alumno
 */
public class controllerUser implements IController{

    private DAOManager objUser;
    private User oUser;
    
    public controllerUser() {
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
        }
        
    }

    @Override
    public List<?> listValues(DBManagedObject obj) {
        return obj.listColumns;
    }

    
}
