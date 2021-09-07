package common.cancel;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class LoginCancelImpl implements LoginCancel{

	@Override
	public void windowClose(Parent root) {
		Stage stage = (Stage)root.getScene().getWindow();
		stage.close();
	}
	
}
