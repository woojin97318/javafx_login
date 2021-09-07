package main;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class MainController implements Initializable{
	Parent root;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	public void setRoot(Parent root) {
		this.root = root;
	}
	
	public void loginBtn() {
		System.out.println("로그인");
	}
	
	public void signupBtn() {
		System.out.println("회원가입");
	}
	
	public void exitBtn() {
		System.out.println("나가기");
	}

}
