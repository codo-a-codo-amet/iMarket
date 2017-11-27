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
public class DAOUser implements IAcctionDB {

    Database db = new Database();
    List lista;

    public DAOUser() {
        lista = new ArrayList();
    }

    @Override
    public Boolean Create(DBManagedObject obj) {
        Connection cn;
        PreparedStatement pst;
        String valores = "?";

        for (int i = 0; i < obj.getColumns().size(); i++) {
            if (i < obj.getColumns().size()) {
                valores += ",";
            }
        }

        String sql = "INSERT INTO " + obj.getTableName() + " (" + obj.getColumns() + ") VALUES (" + valores + ")";

        Boolean respuesta = Boolean.FALSE;

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);

            String type = obj.listValues.get(0).getRight();

            for (int i = 1; i < obj.listColumns.size(); i++) {
                switch (type) {
                    case "String":
                        pst.setString(i, obj.listValues.get(i).getLeft());
                        break;
                    case "Integer":
                        pst.setInt(i, Integer.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Boolean":
                        pst.setBoolean(i, Boolean.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Double":
                        pst.setDouble(i, Double.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    default:

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
        return null;
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
