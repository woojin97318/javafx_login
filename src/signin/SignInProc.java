package signin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.MemberDTO;
import common.db.DBClass;

public class SignInProc {
   DBClass db;
   public MemberDTO loginProc(String inputId) {
      MemberDTO dto = null;      
      String sql = "select * from member where id = ?";
      try {
         PreparedStatement ps = db.conn.prepareStatement(sql);
         ps.setString(1, inputId);
         ResultSet rs = ps.executeQuery();
         if(rs.next()) {
            dto = new MemberDTO();
            dto.setId(rs.getString("id"));
            dto.setPw(rs.getString("pw"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      return dto;
   }

}