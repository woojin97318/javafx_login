package signup;

import common.cancel.LoginCancel;
import common.cancel.LoginCancelImpl;
import javafx.scene.Parent;

public class SignUpImpl implements SignUp{
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void signUpExit() {
		LoginCancel lc = new LoginCancelImpl();
		lc.setRoot(root);
		lc.windowClose();
	}

}
