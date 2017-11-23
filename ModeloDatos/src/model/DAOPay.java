/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;

/**
 *
 * @author walter
 */
public class DAOPay implements IAcctionDB{

    Database db = new Database();
    
    
    @Override
    public Boolean Create(DBManagedObject  obj) {

        Connection cn;
        PreparedStatement pst;
        String sql = "INSERT INTO pay (description) VALUES (?)";
        Boolean respuesta = Boolean.FALSE;
        
        try{
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());
            pst = cn.prepareStatement(sql);
            //pst.setString(1, pay.getDescripcion());
            int filas = pst.executeUpdate();
            respuesta = Boolean.TRUE;
            cn.close();            
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Se produjo un error al conectarse: "+ex.getMessage());
        }
        
        return respuesta;
    }

    @Override
    public Boolean Update(DBManagedObject  obj) {
        return null;
    }

    @Override
    public Boolean Delete(DBManagedObject  obj) {
        return null;
    }

    @Override
    public java.util.List<?> List(DBManagedObject  obj) {
        return null;
    }

    @Override
    public java.util.List<?> ListBy(String campo, String criterio) {
        return null;
    }
    
}
