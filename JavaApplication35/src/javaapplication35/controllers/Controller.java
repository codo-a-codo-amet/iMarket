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

    private String controllerName;
    
    private Object mockView;

   

    public Controller(String controllerName) {
        this.controllerName = controllerName;
    }

    @Override
    public void loadingController() {
        System.out.println("Cargando Controller "+this.controllerName);
    }
    
    public void showController(){
        System.out.println("Mostrando Controller "+this.controllerName);
    }
    
    public void hideController(){
        System.out.println("Ocultando Controller "+this.controllerName);
    }
    
    @Override
    public void killingController() {
        System.out.println("Eliminando Controller "+this.controllerName);
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }
    
     public Object getMockView() {
        return mockView;
    }

    public void setMockView(Object mockView) {
        this.mockView = mockView;
    }
    
    public String toString(){
        return "El controlador es "+controllerName ;
    }
}
