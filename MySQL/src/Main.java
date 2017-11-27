
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here     
        int contador=26;
        DBConnect connect = new DBConnect();
        connect.getData();
   //     do{
   //     user p1 = new user(contador,"Bart","Bart@hotmail.com","Simpson",2,1);
   //     DBConnect on = new DBConnect();
   //     on.insertData(p1);
   //     contador++;
   //     }while(contador<227);
    }
    
}
