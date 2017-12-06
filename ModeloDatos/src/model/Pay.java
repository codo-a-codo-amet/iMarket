/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author walter
 */
public class Pay extends DBManagedObject{
    private String ID;
    private String description;

    public Pay() {
        nameTable = "pay";
        listColumns = new ArrayList<>();
        listColumns.add("ID");
        listColumns.add("description");

        listValues = new ArrayList<>();
    
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(ID, "Integer"));
        listValues.add(new Pair<>(description, "String"));

        return listValues;
    }

    
    
}
