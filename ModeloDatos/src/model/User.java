/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 * En esta clase estan todas las propiedades del objeto User
 * @author walter
 */
public class User {

    private int id;
    private String username;
    private String email;
    private String password;
    private Date create_time;

    public User() {
    }

    public User(int id, String username, String email, String password, Date create_time) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.create_time = create_time;
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

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    
    
    
        
    
}
