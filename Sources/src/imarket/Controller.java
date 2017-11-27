/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imarket;
import java.awt.Event;
import java.awt.event.ActionEvent;
/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener{
  
    protected MainView main_view;

    public Controller() {
        main_view = new MainView();
        main_view.setVisible(true);
    }
    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        main_view.AddEventListener(this);
}

    @Override
    public void listen(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}