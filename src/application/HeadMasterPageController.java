package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HeadMasterPageController {

	@FXML private Button admitBtn;
	
	@FXML
	private void onAdmitBtnClicked() throws Exception{
		Stage stage3;
		Parent root3;
		
		stage3 = (Stage) admitBtn.getScene().getWindow();
		root3 = FXMLLoader.load(getClass().getResource("AdmissionForm.fxml"));
		
		Scene scene3 = new Scene(root3);
		stage3.setScene(scene3);
		stage3.show();
		
	}
	
}
