package signup;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;

public class SignUpController implements Initializable{
	Parent root;
	SignUp su;
	
	public void setRoot(Parent root) {
		this.root = root;
		addComboBox();
	}
	
	public void addComboBox() {
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		if(cmbAge != null) {
			cmbAge.getItems().addAll("10대", "20대", "30대", "40대", "50대 이상");
		}
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		su = new SignUpImpl();
	}

	public void signupBtn() {
		su.setRoot(root);
		su.signUp();
	}
	
	public void exitBtn() {
		su.setRoot(root);
		su.signUpExit();
	}

}
