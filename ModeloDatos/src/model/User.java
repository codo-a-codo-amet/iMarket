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
 *
 * @author walter
 */
public class User extends DBManagedObject {

    private int id;
    private String username;
    private String email;
    private String password;
    private String user_state_ID;
    private String user_details_ID;
    private String user_types_ID;

    public User() {
        nameTable = "user";
        listColumns = new ArrayList<>();
        listColumns.add("username");
        listColumns.add("email");
        listColumns.add("password");
        listColumns.add("user_state_ID");
        listColumns.add("user_details_ID");
        listColumns.add("user_details_ID");

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

    public String getUser_state_ID() {
        return user_state_ID;
    }

    public void setUser_state_ID(String user_state_ID) {
        this.user_state_ID = user_state_ID;
    }

    public String getUser_details_ID() {
        return user_details_ID;
    }

    public void setUser_details_ID(String user_details_ID) {
        this.user_details_ID = user_details_ID;
    }

    public String getUser_types_ID() {
        return user_types_ID;
    }

    public void setUser_types_ID(String user_types_ID) {
        this.user_types_ID = user_types_ID;
    }

    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(username, "String"));
        listValues.add(new Pair<>(email, "String"));
        listValues.add(new Pair<>(password, "String"));
        listValues.add(new Pair<>(user_state_ID, "Integer"));
        listValues.add(new Pair<>(user_details_ID, "Integer"));
        listValues.add(new Pair<>(user_types_ID, "Integer"));

        return listValues;
    }

}
