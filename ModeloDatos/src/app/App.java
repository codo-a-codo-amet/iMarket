/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import model.userDAO;

/**
 *
 * @author walter
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo!!!");
        userDAO u = new userDAO();
        u.List();
        System.out.println("Chau Mundo!!!");
    }
    
}
