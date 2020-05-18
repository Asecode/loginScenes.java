package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HLoginPageController {

@FXML private Button loginBtn;

@FXML
private void onLoginBtnClicked() throws Exception{
	Stage stage;
	Parent root;
	
	stage = (Stage) loginBtn.getScene().getWindow();
	root = FXMLLoader.load(getClass().getResource("HeadMasterPage.fxml"));
	
	Scene scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
}
}
