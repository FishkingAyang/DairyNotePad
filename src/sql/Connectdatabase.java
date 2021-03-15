package sql;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger; 
import sql.Launching;
public class Connectdatabase {
    String drivename="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3307/calendar?useUnicode=true&characterEncoding=utf-8&useSSL=false";
    String user="root";
    String password="123456";
    String insql;
    String upsql;
    String delsql;
    String sql="select id,passwords from admin";  
    String name;
    int select_1;
    Connection conn;
    ResultSet rs=null;
 
    public Connection ConnectMysql(){
                try{
            Class.forName(drivename);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if (!conn.isClosed()) {
                //System.out.println("Succeeded connecting to the Database!");
            } else {
                //System.out.println("Falled connecting to the Database!");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
         return conn;
    }
         public void CutConnection(Connection conn) throws SQLException{
             try{
                if(rs!=null);
                if(conn!=null);
             }catch(Exception e){
             e.printStackTrace();
             }finally{
            rs.close();
            conn.close();
             }
         }
         class user{
        	 int state=0;
             String id="";
             String passwords="";
             public void setId(String userid){
                 this.id=userid;
             }
             public void setPassword(String passwords){
                 this.passwords=passwords;
             }
             public void setState(int state){
            	 this.state=state;
             }
             public String getId(){
                 return id;
             }
             public String getPassword(){
                 return passwords;
             }
             public Integer getState(){
            	 return state;
             }
         }
         public boolean InsertSql(user user){
             try{
 
                  insql="insert into admin(id,passwords,state) values(?,?,?)";
                 PreparedStatement ps=conn.prepareStatement(insql);
                 ps.setString(1, user.getId());
                 ps.setString(2, user.getPassword());
                 ps.setInt(3, user.getState());
                 int result=ps.executeUpdate();
                 if(result>0)
                     return true;
             }catch(Exception e){
             }
             return false;
         }
 
 
         public void SelectSql(String sql){
             try{
                 Statement statement=conn.createStatement();
                 rs=statement.executeQuery(sql);
                 
             }catch(Exception e){
             }
 
         }
         public boolean UpdateSql(String upsql){
             try {
                 PreparedStatement ps = conn.prepareStatement(upsql);
                 int result=ps.executeUpdate();
                 if(result>0)
                     return true;
             } catch (SQLException ex) {
                 Logger.getLogger(Connectdatabase.class.getName()).log(Level.SEVERE, null, ex);
             }
             return false;
              }
         public boolean DeletSql(String delsql){
 
        try {
            PreparedStatement ps = conn.prepareStatement(delsql);
            int result=ps.executeUpdate(delsql);
            if(result>0)
                return true;
        } catch (SQLException ex) {
            Logger.getLogger(Connectdatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
         }

  }
