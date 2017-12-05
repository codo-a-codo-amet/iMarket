/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.*;
import java.util.*;

/**
 * En esta clase estan los metodos para comunicarse con la Base de datos
 *
 * @author walter
 */
public class DAOManager implements IAcctionDB {

    private static DAOManager instance = null;
    
    Database db = new Database();
    List lista;

    private DAOManager() {
        lista = new ArrayList();
        
    }

    public static DAOManager getInstance(){
        if(instance == null){
            instance = new DAOManager();
        }
        
        return instance;
    }
    
    @Override
    public Boolean Create(DBManagedObject obj) {
        Connection cn;
        PreparedStatement pst;
        
        String signo="?";
        String coma=",";
        String valores = "";
        String columnas = "";
        
        int cantColumnas = obj.getColumns().size();
        
        for (int i = 0; i < cantColumnas; i++) {
            if (i < cantColumnas) {
                columnas += obj.getColumns().get(i);
                valores += signo;
                if (i<cantColumnas-1){
                    columnas += coma;
                    valores += coma;
                }
            }
        }

        String sql = "INSERT INTO " + obj.getTableName() + " (" + columnas + ") VALUES (" + valores + ")";

        Boolean respuesta = Boolean.FALSE;

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);

            for (int i = 0; i < cantColumnas; i++) {
                
                String type = obj.listValues.get(i).getRight();
                String val = obj.listValues.get(i).getLeft();
                System.out.println("type "+type);
                
                switch (type) {
                    case "String":
                        pst.setString(i+1, obj.listValues.get(i).getLeft());
                        break;
                    case "Integer":
                        pst.setInt(i+1, Integer.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Boolean":
                        pst.setBoolean(i+1, Boolean.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Double":
                        pst.setDouble(i+1, Double.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Date":
                        pst.setDate(i+1, java.sql.Date.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    default:
                        System.out.println("Dato no definido");
                        break;
                }

            }

            int filas = pst.executeUpdate();

            respuesta = Boolean.TRUE;

            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Se produjo un error al conectarse: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public List<?> ListBy(String campo, String criterio) {
        return null;
    }

    @Override
    public Boolean Update(DBManagedObject obj) {
        Connection cn;
        PreparedStatement pst;
        
        String signo="?";
        String coma=",";
        String valores = "";
        String columnas = "";
        
        int cantColumnas = obj.getColumns().size();
        
        for (int i = 1; i < cantColumnas; i++) {
            if (i < cantColumnas) {
                columnas += obj.getColumns().get(i);
                valores += signo;
                if (i<cantColumnas-1){
                    columnas += coma;
                    valores += coma;
                }
            }
        }

        String sql = "UPDATE " + obj.getTableName() + " SET " + columnas + " = " + valores + " WHERE ID = ?";
        System.out.println("sql "+sql);
        Boolean respuesta = Boolean.FALSE;

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);

            for (int i = 0; i < cantColumnas; i++) {
                String type = obj.listValues.get(i).getRight();
                String val = obj.listValues.get(i).getLeft();
                System.out.println("type "+type);
                
                switch (type) {
                    case "String":
                        pst.setString(i+1, obj.listValues.get(i).getLeft());
                        break;
                    case "Integer":
                        pst.setInt(i+1, Integer.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Boolean":
                        pst.setBoolean(i+1, Boolean.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Double":
                        pst.setDouble(i+1, Double.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Date":
                        pst.setDate(i+1, java.sql.Date.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    default:
                        System.out.println("Dato no definido");
                        break;
                }

            }

            int filas = pst.executeUpdate();

            respuesta = Boolean.TRUE;

            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Se produjo un error al conectarse: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public Boolean Delete(DBManagedObject obj) {
        return null;
    }

    @Override
    public List<?> List(DBManagedObject obj) {
        return null;
    }

}
