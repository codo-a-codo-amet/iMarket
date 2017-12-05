//<editor-fold defaultstate="collapsed" desc="Legal">
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//</editor-fold>
/* Coded by Federico Belchior */
/* FedericoBelchior@gmail.com */

package cinetest;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class AlertBox {
    public static void display (String title, String message){
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        
        window.setTitle(title);
        window.setMinWidth(250);
        window.setMinHeight(150);
        
       Label label = new Label();
       label.setText(message);
       Button closeButton = new Button("Close the window");
       closeButton.setOnAction(e-> window.close());
       
       VBox layout = new VBox(10);
       layout.getChildren().addAll(label, closeButton);
       layout.setAlignment(Pos.CENTER);
       
       Scene scene = new Scene(layout);
       window.setScene(scene);
       window.showAndWait();
        
    }
}
