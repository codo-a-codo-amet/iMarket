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
public class UserState extends DBManagedObject{
    private int ID;
    private String stateName;
    
    public UserState() {
        nameTable = "user_state";
        listColumns = new ArrayList<>();
        listColumns.add("state_name");

        listValues = new ArrayList<>();
        
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(stateName, "String"));

        return listValues;
    }
    
    
    
    
    
    
    
    
}
