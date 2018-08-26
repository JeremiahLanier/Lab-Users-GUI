/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classlabuser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Lanie
 */
public class ClassLabUser extends Application {
    TextArea display = new TextArea();
    
    
    @Override
    public void start(Stage primaryStage) {
    
    //Create Labels
    Label firstName = new Label("First Name");
    TextField fNameF = new TextField();
    
    Label lastName = new Label("Last Name");
     TextField lNameF = new TextField();
     
    Label address = new Label("Address");
    TextField addressF = new TextField();
    
    Label age = new Label("Age");
    TextField ageF = new TextField();
    
    Label phoneNumber = new Label("Phone Number");
    TextField phoneF  = new TextField();
    
    
   
    
    
    
    
    
        Button btn = new Button();
        btn.setText("Submit");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                display.appendText("Hello " + fNameF.getText() + " " + lNameF.getText());
                display.appendText("\nYour age is "+ ageF.getText());
                display.appendText("\nYour address is " + addressF.getText());
                display.appendText("\nYour Number is " + phoneF.getText());
            }
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(firstName, fNameF, lastName, lNameF, address, addressF,
              age, ageF, phoneNumber, phoneF, btn, display);
        
        Scene scene = new Scene(root, 500, 450);
        
        primaryStage.setTitle("Lab Users!");
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
