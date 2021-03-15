package sql;

import java.sql.*;
import sql.Connectdatabase.user;

public class Register {
	String newid="";
	String newpassword="";
	String renewpassword="";
	int return_b;
          public Register(){
         }
          public void Register_a(String a,String b,String c){
        	newid=a;
        	newpassword=b;
        	renewpassword=c;
          }
          public int Register_return(){
        	  return return_b;
          }
          public  void Register_b() throws SQLException{
        	  Connectdatabase cd=new Connectdatabase();
        	  user user=cd.new user();
        	  cd.sql="select id,passwords from admin";
              cd.ConnectMysql();
        	  cd.SelectSql(cd.sql);
        	  while(cd.rs.next()){
        		  if(newid.equals(cd.rs.getString(1))){
        			  return_b=1;
        			  break;
        		  }
        		  else if(!newpassword.equals(renewpassword)){
        			  return_b=3;
        		      break;
        		  }
        		  else
        			  {return_b=2;
        			   user.setId(newid);
        			   user.setPassword(newpassword);
        			   user.setState(0);
        		       cd.InsertSql(user);
        			  }
        	  }
          }
}