package application.services;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class SNTException extends RuntimeException {


public SNTException(String message) {
	super(message);
}


public static void getAlert(AlertType type,String title,String header,String context) {
	Alert al=new Alert(type);
	al.setTitle(title);
	al.setHeaderText(header);
	al.setContentText(context);
	al.showAndWait();
}
}
