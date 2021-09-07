package common.cancel;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginCancelImpl implements LoginCancel{
	Parent root;
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void windowClose() {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	
}
