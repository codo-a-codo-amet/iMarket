/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author walter
 */
public interface IAcctionDB {

    /**
     * Metodo que sirve para listar todos los registro de una tabla de BD
     *
     * @author walter
     * @param obj
     * @return una lista
     */
    public Boolean Create(DBManagedObject obj);

    public Boolean Update(DBManagedObject obj);

    public Boolean Delete(DBManagedObject obj);

    public List<?> List(DBManagedObject obj);

    public List<?> ListBy(String campo, String criterio);

}
