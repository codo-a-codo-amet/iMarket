/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author walter
 */
public class Database {
    private String driver;
    private String url;
    private String usuario;
    private String contrasenia;

    public Database() {
        this.driver = "com.mysql.jdbc.Driver";
        //this.url = "jdbc:mysql://192.168.0.37:3306/iMarket";
        //this.usuario = "alumno";
        //this.contrasenia = "codoacodo";
        
        this.url = "jdbc:mysql://localhost:3306/iMarket";
        this.usuario = "root";
        this.contrasenia = "Miowac-2003";
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    
    
}
