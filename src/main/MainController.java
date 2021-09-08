package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;
import signin.SignIn;
import signin.SignInImpl;

public class MainController implements Initializable{
	Parent root;
	SignIn si;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		si = new SignInImpl();
	}

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void loginBtn() {
		si.loginProc(root);
	}
	
	public void signupBtn() {
		si.signUpProc();
	}
	
	public void exitBtn() {
		si.setRoot(root);
		si.exitProc();
	}
}
