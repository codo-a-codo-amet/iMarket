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

    public static DAOManager getInstance() {
        if (instance == null) {
            instance = new DAOManager();
        }

        return instance;
    }

    @Override
    public Boolean Create(DBManagedObject obj) {
        Connection cn;
        PreparedStatement pst;

        String signo = "?";
        String coma = ",";
        String valores = "";
        String columnas = "";

        int cantColumnas = obj.getColumns().size();

        for (int i = 0; i < cantColumnas; i++) {
            if (i < cantColumnas) {
                columnas += obj.getColumns().get(i);
                valores += signo;
                if (i < cantColumnas - 1) {
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
                System.out.println("type " + type);

                switch (type) {
                    case "String":
                        pst.setString(i + 1, obj.listValues.get(i).getLeft());
                        break;
                    case "Integer":
                        pst.setInt(i + 1, Integer.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Boolean":
                        pst.setBoolean(i + 1, Boolean.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Double":
                        pst.setDouble(i + 1, Double.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Date":
                        pst.setDate(i + 1, java.sql.Date.valueOf(obj.listValues.get(i).getLeft()));
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

        String signo = "?";
        String coma = ", ";
        String columnas = "";

        int cantColumnas = obj.getColumns().size();

        for (int i = 0; i < cantColumnas - 1; i++) {
            if (i < cantColumnas) {
                columnas += obj.getColumns().get(i) + " = " + signo;

                if (i < cantColumnas - 2) {
                    columnas += coma;
                }
            }
        }

        String sql = "UPDATE " + obj.getTableName() + " SET " + columnas + " WHERE ID = ?";
        //System.out.println("sql " + sql);
        Boolean respuesta = Boolean.FALSE;

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);

            for (int i = 0; i < cantColumnas; i++) {
                String type = obj.listValues.get(i).getRight();
                String val = obj.listValues.get(i).getLeft();
                System.out.println("id " + i);
                System.out.println("type " + type);
                System.out.println("valores " + val);

                switch (type) {
                    case "String":
                        pst.setString(i + 1, obj.listValues.get(i).getLeft());
                        break;
                    case "Integer":
                        pst.setInt(i + 1, Integer.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Boolean":
                        pst.setBoolean(i + 1, Boolean.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Double":
                        pst.setDouble(i + 1, Double.valueOf(obj.listValues.get(i).getLeft()));
                        break;
                    case "Date":
                        pst.setDate(i + 1, java.sql.Date.valueOf(obj.listValues.get(i).getLeft()));
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
        Connection cn;
        PreparedStatement pst;

        String sql = "DELETE FROM " + obj.getTableName() + " WHERE ID=?";
        System.out.println("sql = " + sql);
        Boolean respuesta = Boolean.FALSE;

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);

            int cantColumnas = obj.getColumns().size();
            int colID = cantColumnas - 1;

            pst.setInt(1, Integer.valueOf(obj.listValues.get(colID).getLeft()));

            respuesta = pst.execute();

            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Se produjo un error al conectarse: " + ex.getMessage());
        }

        return respuesta;
    }

    @Override
    public List<?> List(DBManagedObject obj) {
        Connection cn;
        PreparedStatement pst;

        String signo = "?";
        String coma = ", ";
        String columnas = "";

        int cantColumnas = obj.getColumns().size();

        for (int i = 0; i < cantColumnas; i++) {
            if (i < cantColumnas) {
                columnas += "`" + obj.getColumns().get(i) + "`";

                if (i < cantColumnas - 1) {
                    columnas += coma;
                }
            }
        }

        String sql = "SELECT " + columnas + " FROM " + obj.getTableName();
        System.out.println("sql " + sql);

        try {
            Class.forName(db.getDriver());
            cn = DriverManager.getConnection(db.getUrl(), db.getUsuario(), db.getContrasenia());

            pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            List listColumns = new ArrayList<>();
            Object dato;

            while (rs.next()) {
                ResultSetMetaData rsmd = rs.getMetaData();

                for (int i = 1; i < rsmd.getColumnCount(); i++) {
                    int type = rsmd.getColumnType(i);
                    String types = obj.listValues.get(i).getRight();

                    if (type == Types.VARCHAR || type == Types.CHAR) {
                        dato = rs.getString(i);
                        System.out.println("Valor " + rs.getString(i));
                    } else {
                        dato = rs.getInt(i);
                        System.out.println("Valor " + rs.getInt(i));
                    }
                    
                    listColumns.add(new Pair(type, dato));

                }

//                for columans {
//                switch (i)
//                        case int:
//                        obecjt dato = rs.getObject(colID, type);
//                        break;
//                        case String:
//                        object dato = rs.getObject(signo, type);
//                creas lista< Pair < tipo, dato> >
//                se asigna a un nuevo DBManagedOBject <- Seter
//                        
//                        ese nuevo DBmanger lista.add (DBManagedObjects)
//                
//                }
                System.out.println(rs.getString("username"));
            }

            lista.add(listColumns);

            cn.close();
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Se produjo un error al conectarse: " + ex.getMessage());
        }

        //return lista;<- Esta llena de DBManagedObjects
        return lista;
    }

}
