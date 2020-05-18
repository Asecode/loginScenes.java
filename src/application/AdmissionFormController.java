package application;

//import java.awt.TextField;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class AdmissionFormController {

	Date date = new Date();
	//String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
	
	
	@FXML private TextField fname;
	@FXML private TextField lname; 
	@FXML private TextField tele;
	@FXML private ChoiceBox<String> classNumberBox, genderBox,teachNumberBox;
	@FXML private TextField idnum;
	
	ObservableList<String> classNumberList = FXCollections.observableArrayList("30001","30002","30003");
	ObservableList<String> teachNumberList = FXCollections.observableArrayList("20001","20002","20003");
	ObservableList<String> genderType = FXCollections.observableArrayList("M","F");
	
	@FXML private Button submit;
	
	@FXML
	private void initialize() {
		//String url = "jdbc:mysql://localhost:3306/database1?useUnicode=true&useJDBCCompliantTimezoneShift=ture&useLegacyDatetimeCode=false&serverTimezone=UTC";
		//String userID = "root";
		//String password = "Rich@24a";
		
		classNumberBox.setValue("30001");
		classNumberBox.setItems(classNumberList);
		
		teachNumberBox.setValue("20001");
		teachNumberBox.setItems(teachNumberList);
		
		genderBox.setValue("M");
		genderBox.setItems(genderType);
		
		
	}
	
	@FXML
	private void onSubmitBtnClicked() {
		//ring firstName = fname.getText();
		//ring lastName = lname.getText();
		//ring Tele = tele.getText();
		
		

		try {
			//Create a Connection to the database
			Connection myCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/adienbra3?useUnicode=true&useJDBCCompliantTimezoneShift=ture&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Rich@24a");
			
			//Create a Statement
			Statement myStat = myCon.createStatement();
			
			//execute statement
			myStat.executeUpdate("insert into student"
					+ "(idstudent,fname,lname,gender,date_admit,tele,idclass,idstaff)"
					+ "values(idnum.getText(),fname.getText(),lname.getText(),genderBox.getSelectionModel().getSelectedItem(),java.sql.Date(date_str.getTime()),tele.getText(),classNumberBox.getSelectionModel().getSelectedItem(),teachNumberBox.getSelectionModel().getSelectedItem() )");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
