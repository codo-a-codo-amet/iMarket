/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication35.controllers;

import java.util.Stack;

/**
 * 
 * 
 */
public class MasterController implements IMasterController{
    Stack <Controller> controllers;
    public MasterController() {
        controllers = new Stack<>();
        
    }

    public void start() {
        
        
    }

    @Override
    public void addControllerToStack(Controller controller) {
        controllers.push(controller);
    }

    @Override
    public void removeControllerFromStack() {
        controllers.pop();
    }

    
}
