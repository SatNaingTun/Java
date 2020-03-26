package application.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

	@FXML
    private TextField tf_r0;

    @FXML
    private TextField tf_contact;

    @FXML
    private TextField tf_period;

    @FXML
    private Button btn_calculate;

    @FXML
    void calculate(ActionEvent event) {
    System.out.println("Calculate");
    }
}
