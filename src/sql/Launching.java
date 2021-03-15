package sql;
//登陆用的java连接sql代码及判断
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import sql.Connectdatabase.user;

public class Launching{
	String newid="";
	String newpassword="";
	int return_a;
	      public void setreturn_a(int a){//外部设置登录状态
	    	  this.return_a = a;
	      }
          public Launching(){
         }
          public void Launching_a(String a,String b){
        	newid=a;
        	newpassword=b;
          }//向Login的textField获取返回值
          public int update_return(){
        	  return return_a;
          }//返回给Login返回值
          public  void Launching_b() throws SQLException{
        	  Connectdatabase cd=new Connectdatabase();
        	  user user=cd.new user();
              cd.ConnectMysql();
        	  cd.SelectSql(cd.sql);//调用数据库中所有id和passwords的数据
        	  while(cd.rs.next()){
        		  if(newpassword.equals(cd.rs.getString(2))&&newid.equals(cd.rs.getString(1))){
        			  return_a=3;
        			  cd.upsql="update admin set state=0 where state=1";
        			  cd.UpdateSql(cd.upsql);
        			  cd.upsql="update admin set state=1 where id='"+newid+"'";
        			  cd.UpdateSql(cd.upsql);
        			  break;
        		  }//比较输入的用户名与密码在数据库是否存在
        		  else if(newpassword.equals("")||newid.equals("")){  
                      return_a=2;
        		      break;
        		      }//确认输入的用户名或者密码是否为空
        		  else
        			  return_a=1;
        		  }
     }  
}
