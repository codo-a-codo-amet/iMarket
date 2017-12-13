/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaevent;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.w3c.dom.Document;
import org.w3c.dom.html.HTMLAnchorElement;
import org.w3c.dom.html.HTMLFormElement;
import org.w3c.dom.html.HTMLTitleElement;

/**
 *
 * @author Himuro
 */
public class VistaEvent extends Application {
    private List<IViewEventListener> list_listeners;
    @Override
    public void start(Stage primaryStage) {
        
        WebView wv = new WebView();
        WebEngine engine = wv.getEngine();
        URL local_url = this.getClass().getResource("/viewHtml/index.html");
        engine.load(local_url.toString());
        
        list_listeners = new ArrayList<>();
      
        engine.locationProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
             String cadena[]=observable.getValue().split("[?,&,=]");
                System.out.println(cadena[2]+ "  "+ cadena[4]+"  "+cadena[6]+ "  "+ cadena[8]);
            }
            
        });
        
        engine.documentProperty().addListener(
                (ObservableValue<? extends Document> ov, Document oldDoc, Document doc)-> {
                    if (doc != null) {
                        System.out.println("no esta null");
                        if (doc.getElementsByTagName("title").getLength() > 0) {
                            HTMLTitleElement miTitle = (HTMLTitleElement) doc.getElementsByTagName("title").item(0);
                            System.out.println( miTitle.getAttribute("id"));
                             if ("inicio".equals(miTitle.getAttribute("id"))){
                                 System.out.println("Estas en la pagina de: "+miTitle.getAttribute("id"));
                                 Event evento = new Event("inicio", null, EventType.ROOT);
                                   for (Iterator<IViewEventListener> iterator = list_listeners.iterator(); iterator.hasNext();) {
                                    IViewEventListener next = iterator.next();
                                    next.listen(evento);
                                       System.out.println("evento " + evento.getSource().toString());
                                   }
                             }else if("productos".equals(miTitle.getAttribute("id"))) {
                                 System.out.println("Estas en la pagina de: "+miTitle.getAttribute("id")); 
                             }else if("categoria".equals(miTitle.getAttribute("id"))) {
                                 System.out.println("Estas en la pagina de: "+miTitle.getAttribute("id")); 
                             }else if("miCuenta".equals(miTitle.getAttribute("id"))) {
                                 System.out.println("Estas en la pagina de: "+miTitle.getAttribute("id")); 
                                   if (doc.getElementsByTagName("form").getLength() > 0) {
                                        HTMLFormElement form = (HTMLFormElement) doc.getElementsByTagName("form").item(0);
                                        System.out.println(form.getAttribute("action"));
                                        if ("lalalala".equals(form.getAttribute("action"))) {
                                        System.out.println("ATRODE!");
                                        Event evento = new Event("submi", null, EventType.ROOT);
                                        for (Iterator<IViewEventListener> iterator = list_listeners.iterator(); iterator.hasNext();) {
                                        IViewEventListener next = iterator.next();
                                        next.listen(evento);
                                    
                                }
                            }
                        }
                        }
                    }
                }
                }
        );
        
        Scene s = new Scene(wv);
        primaryStage.setScene(s);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //Button btn = new Button();
        //btn.setText("Say 'Hello World'");
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            
           // @Override
           // public void handle(ActionEvent event) {
           //     System.out.println("Hello World!");
           // }
        //});
        
        //StackPane root = new StackPane();
        //root.getChildren().add(btn);
        
       // Scene scene = new Scene(root, 300, 250);
        
       // primaryStage.setTitle("Hello World!");
       // primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
