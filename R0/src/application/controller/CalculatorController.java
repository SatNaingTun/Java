package application.controller;

import application.services.SNTException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class CalculatorController {

	@FXML
    private TextField tf_r0;

    @FXML
    private TextField tf_contact;

    @FXML
    private TextField tf_period;

    @FXML
    private Button btn_calculate;
    
    double r0;
    double contact;
    double period;

    @FXML
    void calculate(ActionEvent event) {
    try {	
    if(tf_r0.getText().isEmpty()&&tf_contact.getText().isEmpty()&&tf_period.getText().isEmpty())
    {
    	throw new SNTException("This application can only calculate one value");
    }
    
    if(tf_r0.getText().isEmpty())
    {
    	//    	r0=Double.parseDouble(tf_r0.getText());
    	contact=Double.parseDouble(tf_contact.getText());
    	period=Double.parseDouble(tf_period.getText());
    	
    	r0=contact*period;
    	
    	tf_r0.setText(String.valueOf(r0));
    	
    	
    	
    }
    
    else if(tf_contact.getText().isEmpty())
    {
    	r0=Double.parseDouble(tf_r0.getText());
    	contact=Double.parseDouble(tf_contact.getText());
    	period=Double.parseDouble(tf_period.getText());
    	
    	contact=r0/period;
    	
    	tf_contact.setText(String.valueOf(contact));
    	
    	
    }
    
    else if(tf_period.getText().isEmpty())
    {
    	r0=Double.parseDouble(tf_r0.getText());
    	contact=Double.parseDouble(tf_contact.getText());
//    	period=Double.parseDouble(tf_period.getText());
    	
    	period=r0/contact;
    	
    	tf_period.setText(String.valueOf(period));
    	
    	
    }
    
    }
    
    catch(Exception ex) {
    	SNTException.getAlert(AlertType.ERROR, "Error", "Calculate Error", ex.getMessage());
    	
    }
    }
}
