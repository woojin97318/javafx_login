package common.exit;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class ExitImpl implements Exit{
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
