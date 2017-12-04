/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walter
 */
public class UserType extends DBManagedObject{
    private int ID;
    private String userType;
    
    public UserType() {
        nameTable = "user_types";
        listColumns = new ArrayList<>();
        listColumns.add("user_types");

        listValues = new ArrayList<>();
        
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String usertype) {
        this.userType = usertype;
    }


    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(userType, "String"));

        return listValues;
    }
    
    
    
    
    
    
    
    
}
