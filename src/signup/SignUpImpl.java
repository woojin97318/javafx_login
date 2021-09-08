package signup;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.AlertClass;
import common.db.DBClass;
import common.exit.Exit;
import common.exit.ExitImpl;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SignUpImpl implements SignUp{
	Parent root;
	DBClass db = new DBClass();
	AlertClass alert = new AlertClass();
	
	public void setRoot(Parent root) {
		this.root = root;
	}
	
	@Override
	public void signUp() {
		TextField suName = (TextField)root.lookup("#suName");
		TextField suId = (TextField)root.lookup("#suId");
		PasswordField suPw = (PasswordField)root.lookup("#suPw");
		PasswordField suPwOk = (PasswordField)root.lookup("#suPwOk");
		RadioButton rdoMan = (RadioButton)root.lookup("#rdoMan");
		RadioButton rdoWoman = (RadioButton)root.lookup("#rdoWoman");
		ComboBox<String> cmbAge = (ComboBox<String>)root.lookup("#cmbAge");
		
		if(suName.getText() == "") {
			alert.alertErr("이름을 입력하세요.");
			suName.requestFocus();
		}else if(suId.getText() == "") {
			alert.alertErr("아이디를 입력하세요.");
			suId.requestFocus();
		}else if(suPw.getText() == "") {
			alert.alertErr("비밀번호를 입력하세요.");
			suPw.requestFocus();
		}else if(suPwOk.getText() == "") {
			alert.alertErr("비밀번호 확인을 입력하세요.");
			suPwOk.requestFocus();
		}else if(!suPw.getText().equals(suPwOk.getText())) {
			alert.alertErr("비밀번호가 틀립니다.");
			suPwOk.requestFocus();
		}else if(cmbAge.getValue() == null) {
			alert.alertErr("나이를 선택해 주세요");
			cmbAge.requestFocus();
		}else {
			try {
				String sql = "insert into member values(?, ?, ?, ?, ?)";
				PreparedStatement ps = db.conn.prepareStatement(sql);
				ps.setString(1, suId.getText());
				ps.setString(2, suPw.getText());
				ps.setString(3, suName.getText());
				if(rdoMan.isSelected())
					ps.setString(4, "남성");
				else
					ps.setString(4, "여성");
				ps.setString(5, cmbAge.getValue().toString());
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			alert.alertInfo("회원이 되신것을 환영합니다.");
			suName.clear();
			suId.clear();
			suPw.clear();
			suPwOk.clear();
		}
	}
	@Override
	public void signUpExit() {
		Exit lc = new ExitImpl();
		lc.setRoot(root);
		lc.windowClose();
	}
}
