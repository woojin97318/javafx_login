package signin;

import common.AlertClass;
import common.MemberDTO;
import common.db.DBClass;
import common.exit.Exit;
import common.exit.ExitImpl;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import signup.SignUpImpl;

public class SignInImpl implements SignIn {
	Parent root;
	SignUpImpl sui;
	MemberDTO dto;
	SignInProc sip = new SignInProc();
	DBClass db = new DBClass();

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
	public void loginProc(Parent root) {
		TextField fxId = (TextField)root.lookup("#fxId");
		TextField fxPw = (TextField)root.lookup("#fxPw");
		MemberDTO dto = sip.loginProc(fxId.getText());
		String msg = null;
		if(fxId.getText() == "") {
			msg = "아이디를 입력하세요";
		}else if(fxPw.getText() == ""){
			msg = "비밀번호를 입력하세요";
		}else if(dto != null) {
			if(dto.getPw().equals(fxPw.getText())) {
				msg = "로그인 성공";
			}else {
				msg = "비밀번호가 틀립니다";
			}
		}else{
			msg = "아이디가 존재하지 않습니다";
		}
		AlertClass.alertInfo(msg);
	}
}
