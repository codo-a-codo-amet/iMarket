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
public class UserDatails extends DBManagedObject{
    private int ID;
    private String name;
    private String surname;
    private String dni;
    private String birth_date;
    private String address;
    private String telephone;
    
    public UserDatails() {
        nameTable = "user_details";
        listColumns = new ArrayList<>();
        listColumns.add("name");
        listColumns.add("surname");
        listColumns.add("dni");
        listColumns.add("birth_date");
        listColumns.add("address");
        listColumns.add("telephone");

        listValues = new ArrayList<>();
        
    }    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public List<Pair<String, String>> getValues() {
        listValues.add(new Pair<>(name, "String"));
        listValues.add(new Pair<>(surname, "String"));
        listValues.add(new Pair<>(dni, "String"));
        listValues.add(new Pair<>(birth_date, "Date"));
        listValues.add(new Pair<>(address, "String"));
        listValues.add(new Pair<>(telephone, "String"));

        return listValues;
    }
    
    
    
    
    
    
    
    
}
