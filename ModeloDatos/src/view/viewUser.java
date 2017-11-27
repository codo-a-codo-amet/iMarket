/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class viewUser {

    private String username;
    private String email;
    private String password;

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
   
    Scanner teclado = new Scanner(System.in);
    
    public void EscribirFormulario() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Formulario de registro de Usuario");
        System.out.println("Ingrese un Usuario:");
        String usuario = teclado.nextLine();
        setUsername(usuario);
        System.out.println("Ingrese un email:");
        String email = teclado.nextLine();
        setEmail(email);
        System.out.println("Ingrese un Password:");
        String pass = teclado.nextLine();
        setPassword(pass);
        System.out.println("+++++++++++++++++++++++++");
    }


    
}
