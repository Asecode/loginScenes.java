package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;

public class TLoginPageController {
	
	ObservableList<String> classNumberList = FXCollections.observableArrayList("One","Two","Three");
	
	@FXML
	private ChoiceBox<String> classNumberBox;
	
	@FXML
	private Button loginBtn;
	
	@FXML
	private void initialize() {
	
		classNumberBox.setValue("One");
		classNumberBox.setItems(classNumberList);
	}
	
	@FXML
	private void onLoginBtnClicked() throws Exception{
		Stage stage2;
		Parent root2;
		
		stage2 = (Stage) loginBtn.getScene().getWindow();
		root2 = FXMLLoader.load(getClass().getResource("IndividualClassPage.fxml"));
		
		Scene scene2 = new Scene(root2);
		stage2.setScene(scene2);
		stage2.show();
	}
	
	
	
	
}
