package sql;

import java.sql.*;
import sql.Connectdatabase;
import sql.Connectdatabase.user;

public class Judgement {
	String judge="";
	String judge1="";
	int return_judge;
	public Judgement(){
		
	}
	public void Judgement_b(String a,String b){
		judge=a;
		judge1=b;
		
	}
	public int Judgement_c(){
		return return_judge;
	}
	public void Judgement_a() throws SQLException{
		Connectdatabase cd=new Connectdatabase();
        cd.ConnectMysql();
        cd.sql="select id,passwords from admin";
        cd.SelectSql(cd.sql);
        while(cd.rs.next()){
        	if(judge.equals(cd.rs.getString(1))&&judge1.equals(cd.rs.getString(2))){
        		return_judge=1;
        		break;
        	}
        	else
        		return_judge=0;
        }
	}
}
