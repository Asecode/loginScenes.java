package application;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.RadioButton;

public class Student {
	
	private SimpleStringProperty ID;
	private SimpleStringProperty name;
	private RadioButton present;
	
	Student(String ID, String name, RadioButton present) {
		this.ID = new SimpleStringProperty(ID);
		this.name = new SimpleStringProperty(name);
		this.present = new RadioButton();
	}
	
	public String getID() {
		return ID.get();
	}
	
	public void setID(String ID) {
		this.ID.set(ID);
	}
	
	public String getName() {
		return name.get();
	}
	
	public void setName(String name) {
		this.name.set(name);
	}
	
	public Boolean getPresentState() {
		return present.isSelected();
	}
	
	public void setPresentState(RadioButton present) {
		this.present.setSelected(true);
	}

}
