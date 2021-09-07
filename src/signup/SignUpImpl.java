package signup;

import common.exit.Exit;
import common.exit.ExitImpl;
import javafx.scene.Parent;

public class SignUpImpl implements SignUp{
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void signUpExit() {
		Exit lc = new ExitImpl();
		lc.setRoot(root);
		lc.windowClose();
	}

}
