
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    private PreparedStatement psInsertar;
    
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://192.168.0.37:3306/mydb","alumno","codoacodo");
            st = con.createStatement();
            
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    public void getData(){
     try{
      String query = "select * from user";
      rs = st.executeQuery(query);
      System.out.println("Records from User Database");
      while(rs.next()){
          String ID = rs.getString("ID");
          String username = rs.getString("username");
          String email = rs.getString("email");
          String password = rs.getString("password");
          String create_time = rs.getString("create_time");
          String user_state_ID = rs.getString("user_state_ID");
          String user_details_ID = rs.getString("user_details_ID");
          System.out.println("ID: "+ID+" - "+"Username: "+username+" - "+"Email: "+email+" - "+"Password: "+password+" - "+"Create Time: "+create_time+" - "+"User_state_ID: "+user_state_ID+" - "+"User_details_ID: "+user_details_ID);
      }
      
     }catch(Exception ex){
         System.out.println(ex);
     }
    }
    public void insertData(user p) throws SQLException{
        psInsertar = con.prepareStatement("INSERT INTO user (ID,username,email,password,user_state_ID,user_details_ID)" + "VALUES (?,?,?,?,?,?)");
        psInsertar.setInt(1,p.getID());
        psInsertar.setString(2, p.getUsername());
        psInsertar.setString(3, p.getEmail());
        psInsertar.setString(4, p.getPassword());
        psInsertar.setInt(5, p.getUser_state_ID());
        psInsertar.setInt(6, p.getUser_details_ID());
        psInsertar.executeUpdate();
    }
}


//clase singleton
//hacer un insert