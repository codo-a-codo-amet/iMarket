/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinetest;

import java.net.URL;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker.State;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;
import org.w3c.dom.*;
import org.w3c.dom.html.*;

/**
 *
 * @author alumno
 */
public class CineTest extends Application {
    private Document HTMLDocumnt = null;
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cine Java");

        MasterView mView = new MasterView();
        mView.getElementByID("email");
        //BOTON TEST
        //myButton = new Button("Alert Box");
        //myButton.setOnAction(e-> AlertBox.display("Title", "Ventana Test"));
        Pane root = new Pane();
        root.getChildren().add(0, mView.getMyView());
        //root.getChildren().add(1, myButton);

        Scene scene = new Scene(root, 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
