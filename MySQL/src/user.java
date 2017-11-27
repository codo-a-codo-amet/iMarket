/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class user {

private int ID,User_state_ID,User_details_ID; 
private String Username,Email,Password,Create_time;    

public user(){
}

public user(int id,String username,String email,String password,int user_state_id,int user_details_id){
    this.ID=id;
    this.Username=username;
    this.Email=email;
    this.Password=password;
    this.User_state_ID=user_state_id;
    this.User_details_ID=user_details_id;
}


public int getID(){
    return ID;
}

public void setID(int ID){
    this.ID=ID;
}

public String getUsername(){
    return Username;
}

public void setUsername(String Username){
    this.Username=Username;
}

public String getEmail(){
    return Email;
}

public void setEmail(String Email){
    this.Email=Email;
}

public String getPassword(){
    return Password;
}

public void setPassword(String Password){
    this.Password=Password;
}

public int getUser_state_ID(){
    return User_state_ID;
}

public void setUser_state_ID(int User_state_ID){
    this.User_state_ID=User_state_ID;
}

public int getUser_details_ID(){
    return User_details_ID;
}

public void get_User_details_ID(int User_details_ID){
    this.User_details_ID=User_details_ID;
}
}
