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
        if (stackOfControllersIsEmpty()){
            addControllerToStack(new Controller("Inicial"));
        }
    }

    public void start() {
        
        
    }

    @Override
    public void addControllerToStack(Controller controller) {
        controller.loadingController();
        if(!stackOfControllersIsEmpty()){
            controllers.peek().hideController();
        }
        controllers.push(controller);
        controllers.peek().showController();
    }

    @Override
    public void removeControllerFromStack() {
        
        if (!peekTheStack().getControllerName().equalsIgnoreCase("inicial")){
            controllers.peek().killingController();
            controllers.pop();
        }
        controllers.peek().showController();
        
    }

    @Override
    public boolean stackOfControllersIsEmpty() {
        return controllers.isEmpty();
    }

    @Override
    public Controller peekTheStack() {
        return controllers.peek();
    }

    
}
