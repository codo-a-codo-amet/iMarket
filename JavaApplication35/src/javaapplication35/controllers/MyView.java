/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication35.controllers;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MyView {
    protected List<IMockViewEventListener> list_listener;
    
    public MyView(){
        list_listener = new ArrayList();
    }
    
    public void AddEventListener(IMockViewEventListener listener){
        list_listener.add(listener);
    }
    
    public void RemoveEventListener(IMockViewEventListener listener){
        list_listener.remove(listener);
    }
    for (int i = 0; i < list_listener.size(); i++) {
            IMockViewEventListener listener = list_listener.get(i);
            
            // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event event = new Event(evt, 0, evt);
            
            // El objeto event viaja hacia los que estan escuchando a la vista
            listener.listen(event);
            
        }
}
