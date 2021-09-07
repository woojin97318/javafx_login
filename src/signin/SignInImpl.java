package signin;


import common.cancel.LoginCancel;
import common.cancel.LoginCancelImpl;
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
		LoginCancel lc = new LoginCancelImpl();
		lc.setRoot(root);
		lc.windowClose();
	}

	@Override
	public void loginProc() {

	}

}
