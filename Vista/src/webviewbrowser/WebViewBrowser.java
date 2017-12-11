/*
 * Copyright (c) 2012 Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package webviewbrowser;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import jdk.nashorn.api.scripting.JSObject;
import org.w3c.dom.Document;
import org.w3c.dom.html.HTMLFormElement;

/**
 * Demonstrates a WebView object accessing a web page.
 *
 * @see javafx.scene.web.WebView
 * @see javafx.scene.web.WebEngine
 */
public class WebViewBrowser extends Application {
private List<IViewEventListener> list_listeners;
    @Override
    public void start(Stage primaryStage) throws Exception {
        
         list_listeners = new ArrayList<>();
        Pane root = new Pane();
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

        VBox.setVgrow(root, Priority.ALWAYS);
        root.setMaxWidth(Double.MAX_VALUE);
        root.setMaxHeight(Double.MAX_VALUE);

        WebView view = new WebView();
        //view.setMinSize(500, 400);
        //view.setPrefSize(500, 400);
        final WebEngine eng = view.getEngine();
        URL file_url = this.getClass().getResource("/htmlsrc/newhtml.html");
        eng.load(file_url.toString());
        GridPane grid = new GridPane();
        grid.setVgap(5);
        grid.setHgap(5);

        grid.getChildren().addAll(view);
        root.getChildren().add(grid);

        eng.locationProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("QUe?");
            }
        });
           eng.documentProperty().addListener(
                (ObservableValue<? extends Document> ov, Document oldDoc, Document doc) -> {
                    if (doc != null) {
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
        );
       // eng.documentProperty().addListener(  );
        //eng.getLoadWorker().stateProperty().addListener(
                //(observable, oldValue, newValue)
               // -> {
                   // System.out.println("Worker " + observable);
           /* JSObject window = (JSObject) eng.executeScript("window");
            JavaBridge bridge = new JavaBridge();
            window.setMember("java", bridge);
            eng.executeScript("console.log = function(message)\n"
                    + "{\n"
                    + "    java.log(message);\n"
                    + "};");*/
       // });

    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Create a resizable WebView pane
     */
    public class WebViewPane extends Pane {

        public WebViewPane() {

            final TextField locationField = new TextField("http://www.oracle.com/us/index.html");
            locationField.setMaxHeight(Double.MAX_VALUE);
            Button goButton = new Button("Go");
            goButton.setDefaultButton(true);
            EventHandler<ActionEvent> goAction = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    // eng.load(locationField.getText().startsWith("http://") ? locationField.getText()
                    //       : "http://" + locationField.getText());
                }
            };
            goButton.setOnAction(goAction);
            locationField.setOnAction(goAction);

        }

        @Override
        protected void layoutChildren() {
            List<Node> managed = getManagedChildren();
            double width = getWidth();
            double height = getHeight();
            double top = getInsets().getTop();
            double right = getInsets().getRight();
            double left = getInsets().getLeft();
            double bottom = getInsets().getBottom();
            for (int i = 0; i < managed.size(); i++) {
                Node child = managed.get(i);
                layoutInArea(child, left, top,
                        width - left - right, height - top - bottom,
                        0, Insets.EMPTY, true, true, HPos.CENTER, VPos.CENTER);
            }
        }
    }
}
