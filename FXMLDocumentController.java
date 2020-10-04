/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aurora;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 *
 * @author talia
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button logIn, signUp, airport, abt1, abt2, abt3, abt4, prehome, home, sleep, food, exer, meds, hobbies, mood;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException  {
        Stage stage;
        Parent root;
        
        if(event.getSource()==logIn){
            stage = (Stage) logIn.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("login.fxml"));
        }
        
        else if(event.getSource()==signUp){
            stage = (Stage) signUp.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("about.fxml"));
        }
        
        else if (event.getSource()==airport){
            stage = (Stage) airport.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("airport.fxml"));
        }
        
        else if (event.getSource()==abt1){
            stage = (Stage) abt1.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("about1.fxml"));
        }
        
        else if (event.getSource()==abt2){
            stage = (Stage) abt2.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("about2.fxml"));
        }
                
        else if (event.getSource()==abt3){
            stage = (Stage) abt3.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("about3.fxml"));
        }
                        
        else if (event.getSource()==abt4){
            stage = (Stage) abt4.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("about4.fxml"));
        }
        
        else if (event.getSource()==prehome){
            stage = (Stage) prehome.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("prehome.fxml"));
        }
        
        else if (event.getSource()==home){
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("home.fxml"));
        }
        
        else if (event.getSource()==sleep){
            stage = (Stage) sleep.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("sleep.fxml"));
        }
        
        else if (event.getSource()==food){
            stage = (Stage) food.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("food.fxml"));
        }
        
        else if (event.getSource()==exer){
            stage = (Stage) exer.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("exer.fxml"));
        }
        
        else if (event.getSource()==meds){
            stage = (Stage) meds.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("meds.fxml"));
        }
        
        else if (event.getSource()==hobbies){
            stage = (Stage) hobbies.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("hobbies.fxml"));
        }
        
        
        else if (event.getSource()==mood){
            stage = (Stage) mood.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("mood.fxml"));
        }
        
        else {
            stage = (Stage) home.getScene().getWindow();
            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        }
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    // log in
    
    @FXML
    private Label label;

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    public void submit() {
        System.out.println(username.getText());
        System.out.println(password.getText());   
    }
        
    ObservableList list=FXCollections.observableArrayList();

    @FXML
    private TextField firstname, lastname, weight, height;
    
    @FXML
    private DatePicker birthday;
    
    @FXML
    private Button next;

    @FXML
    public void next() {
        System.out.println(firstname.getText());
        System.out.println(lastname.getText());
        System.out.println(weight.getText());
        System.out.println(height.getText());
        System.out.println(birthday.getValue());
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
