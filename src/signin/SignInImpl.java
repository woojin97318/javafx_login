package signin;

import common.exit.Exit;
import common.exit.ExitImpl;
import javafx.scene.Parent;
import signup.SignUpProc;

public class SignInImpl implements SignIn{
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void signUpProc() {
		SignUpProc sup = new SignUpProc();
		sup.signUpProc();
	}

	@Override
	public void exitProc() {
		Exit lc = new ExitImpl();
		lc.setRoot(root);
		lc.windowClose();
	}

	@Override
	public void loginProc() {

	}

}
