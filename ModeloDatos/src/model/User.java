/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * En esta clase estan todas las propiedades del objeto User
 * @author walter
 */
public class User extends DBManagedObject{

    private int id;
    private String username;
    private String email;
    private String password;

    public User() {
        nameTable = "user";
        listColumns = new ArrayList<>();
        listColumns.add("username");
        listColumns.add("email");
        listColumns.add("password");
        
        listValues = new ArrayList<>();        
    }

    public User(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    } 
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(username, "String"));
        listValues.add(new Pair<>(email, "String"));
        listValues.add(new Pair<>(password, "String"));
        
        return listValues;
    }

    
    
    
        
    
}
