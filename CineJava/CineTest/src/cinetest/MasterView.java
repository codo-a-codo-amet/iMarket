/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import java.net.URL;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.text.html.HTML;
import netscape.javascript.JSObject;
import org.w3c.dom.Document;

/**
 *
 * @author alumno
 */
public class MasterView {
    private WebView myView;
    private Document HTMLDocumnt;

    public WebView getMyView() {
        return myView;
    }
    public MasterView() {
        this.myView = new WebView();
        WebEngine myWebEngine = myView.getEngine();
        myWebEngine.setJavaScriptEnabled(true);
        URL url = this.getClass().getResource("/Web/index.html");

        //Load Page Status
        myWebEngine.getLoadWorker().stateProperty().addListener(
                (ObservableValue<? extends Worker.State> ov, Worker.State oldState,
                        Worker.State newState) -> {
                    if (newState == Worker.State.SUCCEEDED) {
                        JSObject win = (JSObject) myWebEngine.executeScript("window");
                        
                        win.setMember("jHelper", new JavaHelper());
                    }
                }
        );

        myWebEngine.documentProperty().addListener(
                (ObservableValue<? extends Document> ov, Document oldDoc, Document doc) -> {
                    if (doc != null) {
                        if (doc.getElementsByTagName("form").getLength() > 0) {
                            this.HTMLDocumnt = doc;
                            System.out.println("Cargo el form");
                            
                        }
                    }
                });

        myWebEngine.load(url.toString());
    }
    
    public String getElementByID(String id){
       return HTMLDocumnt.getElementById(id).toString();
    }
}
