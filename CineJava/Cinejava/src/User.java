/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class User {
    private int id;
    private char username;
private char email;
   private char password;
   private int user_status_id;
   private int user_details_id;
   private int user_type_id;
   private int transaciones_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getUsername() {
        return username;
    }

    public void setUsername(char username) {
        this.username = username;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public int getUser_status_id() {
        return user_status_id;
    }

    public void setUser_status_id(int user_status_id) {
        this.user_status_id = user_status_id;
    }

    public int getUser_details_id() {
        return user_details_id;
    }

    public void setUser_details_id(int user_details_id) {
        this.user_details_id = user_details_id;
    }

    public int getUser_type_id() {
        return user_type_id;
    }

    public void setUser_type_id(int user_type_id) {
        this.user_type_id = user_type_id;
    }

    public int getTransaciones_id() {
        return transaciones_id;
    }

    public void setTransaciones_id(int transaciones_id) {
        this.transaciones_id = transaciones_id;
    }
   
}
