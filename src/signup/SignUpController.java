package signup;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class SignUpController implements Initializable{
	Parent root;
	SignUp su;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		su = new SignUpImpl();
	}

	public void signupBtn() {
		
	}
	
	public void exitBtn() {
		su.setRoot(root);
		su.signUpExit();
	}

}
