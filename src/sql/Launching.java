package sql;
//��½�õ�java����sql���뼰�ж�
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
	      public void setreturn_a(int a){//�ⲿ���õ�¼״̬
	    	  this.return_a = a;
	      }
          public Launching(){
         }
          public void Launching_a(String a,String b){
        	newid=a;
        	newpassword=b;
          }//��Login��textField��ȡ����ֵ
          public int update_return(){
        	  return return_a;
          }//���ظ�Login����ֵ
          public  void Launching_b() throws SQLException{
        	  Connectdatabase cd=new Connectdatabase();
        	  user user=cd.new user();
              cd.ConnectMysql();
        	  cd.SelectSql(cd.sql);//�������ݿ�������id��passwords������
        	  while(cd.rs.next()){
        		  if(newpassword.equals(cd.rs.getString(2))&&newid.equals(cd.rs.getString(1))){
        			  return_a=3;
        			  cd.upsql="update admin set state=0 where state=1";
        			  cd.UpdateSql(cd.upsql);
        			  cd.upsql="update admin set state=1 where id='"+newid+"'";
        			  cd.UpdateSql(cd.upsql);
        			  break;
        		  }//�Ƚ�������û��������������ݿ��Ƿ����
        		  else if(newpassword.equals("")||newid.equals("")){  
                      return_a=2;
        		      break;
        		      }//ȷ��������û������������Ƿ�Ϊ��
        		  else
        			  return_a=1;
        		  }
     }  
}
