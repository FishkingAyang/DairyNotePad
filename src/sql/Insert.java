package sql;

import java.sql.SQLException;
import sql.Connectdatabase.user;
import 日历记事本.*;

public class Insert{
    String newid="";
    String newpassword="";
	
    public Insert(){

	    }
    
    public void Insert_a(String a,String b){
	   	 newid=a;
	   	 newpassword=b;
	    }
    
    public void Insert_b() throws SQLException{
	    Connectdatabase cd=new Connectdatabase();
	    sql.Connectdatabase.user user=cd.new user();
	    cd.ConnectMysql();
	    user.setId(newid);
	    user.setPassword(newpassword);
	    user.setState(0);
	    cd.InsertSql(user);
    }
   
}

