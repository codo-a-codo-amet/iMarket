/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication35.controllers;

/**
 * 
 * 
 */
public class Controller implements IController{

    @Override
    public void loadingController() {
        System.out.println("Cargando Controller");
    }

    @Override
    public void killingController() {
        System.out.println("Eliminando Controller");
    }
    
}
