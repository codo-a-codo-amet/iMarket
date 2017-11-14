/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author walter
 */
public class Pay{

   private String descripcion;
   private Date create_time;

    public Pay() {
    }

    public Pay(String descripcion, Date create_time) {
        this.descripcion = descripcion;
        this.create_time = create_time;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
   
   
    
}
