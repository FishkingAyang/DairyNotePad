package sql;
import java.sql.*;
import sql.Connectdatabase.user;

public class Logout {
	String newid="";
	String newpassword="";
	int return_c;
          public Logout(){
         }
          public void Logout_a(String a,String b){
        	newid=a;
        	newpassword=b;
          }
          public int Logout_return(){
        	  return return_c;
          }
          public  void Logout_b() throws SQLException{
        	  Connectdatabase cd=new Connectdatabase();
        	  user user=cd.new user();
              cd.ConnectMysql();
              cd.upsql="update admin set state=0 where state=1";
              cd.UpdateSql(cd.upsql);
              cd.upsql="update admin set state=1 where id='00000000'";
              cd.UpdateSql(cd.upsql);
              return_c=1;
          }
}

