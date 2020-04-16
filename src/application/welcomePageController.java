package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class welcomePageController {
	@FXML
	private Button headBtn,teachBtn;
	
	@FXML
	private void handleTeachBtnClicked() throws Exception{
		Stage stage1;
		Parent root1;
		
		stage1 = (Stage) teachBtn.getScene().getWindow();
		root1 = FXMLLoader.load(getClass().getResource("TLoginPage.fxml.fxml"));
		
		Scene scene1 = new Scene(root1);
		stage1.setScene(scene1);
		stage1.show();
	}
	
	@FXML
	private void handleHeadBtnClicked() throws Exception{
		Stage stage;
		Parent root;
		
		stage = (Stage) headBtn.getScene().getWindow();
		root = FXMLLoader.load(getClass().getResource("HLoginPage.fxml"));
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
}
