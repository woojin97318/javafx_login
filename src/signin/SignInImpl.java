package signin;

import common.exit.Exit;
import common.exit.ExitImpl;
import javafx.scene.Parent;

public class SignInImpl implements SignIn{
	Parent root;
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void signUpProc() {
		// 회원가입 창 이동
		SignUpProc sup = new SignUpProc();
		sup.signUpProc();
	}

	@Override
	public void exitProc() {
		// 창 닫기
		Exit lc = new ExitImpl();
		lc.setRoot(root);
		lc.windowClose();
	}

	@Override
	public void loginProc() {
		// 로그인 버튼 클릭
	}

}
