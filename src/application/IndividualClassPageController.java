package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class IndividualClassPageController {
	Connection myConn = null;
	PreparedStatement myStat = null;
	ResultSet myRs = null;
	
	String url = "jdbc:mysql://localhost:3306/adienbra3?useUnicode=true&useJDBCCompliantTimezoneShift=ture&useLegacyDatetimeCode=false&serverTimezone=UTC";
	String userID = "root";
	String password = "Rich@24a";
	
	
	
	@FXML
	private TableView<Student> attendanceSheet;
	
	@FXML private TableColumn<Student,String> ID;
	@FXML private TableColumn<Student,String> name;
	@FXML private TableColumn<Student,RadioButton> present;
	
	
	
	private void initialize() {
		
		//attendanceSheet.getColumns().addAll(ID,name,present);
		ID.setCellValueFactory(new PropertyValueFactory<Student,String>("ID"));
		name.setCellValueFactory(new PropertyValueFactory<Student,String>("name"));
		present.setCellValueFactory(new PropertyValueFactory<Student,RadioButton>("present"));
		
		//ObservableList<Student> info = FXCollections.observableArrayList();
		
		attendanceSheet.setItems(getStudents());
	}
	
	private ObservableList getStudents() {
		
		ObservableList<Student> info = FXCollections.observableArrayList();
		try {
			//Get a connection to the database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adienbra3?useUnicode=true&useJDBCCompliantTimezoneShift=ture&useLegacyDatetimeCode=false&serverTimezone=UTC","root","Rich@24a");
			
			//Create a statement
			Statement myStat = myConn.createStatement();
			//Execute sql query
			ResultSet myRs = myStat.executeQuery("select * from student");
			//Process the result set
			while(myRs.next()) {
				//System.out.println(myRs.getString("first_name") +", "+ myRs.getString("last_name"));
				Student student = new Student(Integer.toString(myRs.getInt("idstudent")),myRs.getString("fname") + myRs.getString("lname"), new RadioButton(null));
				
				info.add(student);
				
			}
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}
		
		return info;
		
	}

}
