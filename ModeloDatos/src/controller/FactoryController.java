/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.DBManagedObject;
import model.Null;
import model.Pay;
import model.Product;
import model.User;
import model.UserDatails;
import model.UserState;
import model.UserType;

/**
 *
 * @author wceba
 */
public class FactoryController {
    
    public static DBManagedObject getController(String controller){
        
        if (controller.equalsIgnoreCase("User")){
            return new User();
        }else if (controller.equalsIgnoreCase("UserDatails")){
            return new UserDatails();
        }else if (controller.equalsIgnoreCase("UserState")){
            return new UserState();
        }else if (controller.equalsIgnoreCase("UserType")){
            return new UserType();
        }else if (controller.equalsIgnoreCase("Pay")){
            return new Pay();
        }else if (controller.equalsIgnoreCase("Product")){
            return new Product();
        }else{
            return new Null();
        }

    }
    
    
    
}
