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
    private String ID;
    private String userType;
    
    public UserType() {
        nameTable = "user_types";
        listColumns = new ArrayList<>();
        listColumns.add("user_types");
        listColumns.add("ID");

        listValues = new ArrayList<>();
        
    }    

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
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
        listValues.add(new Pair<>(ID, "Integer"));

        return listValues;
    }
    
    
    
    
    
    
    
    
}
