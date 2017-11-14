/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 * En esta clase estan los metodos para comunicarse con la Base de datos
 *
 * @author walter
 */
public class userDAO extends user implements IAcctionDB {

    List lista;

    public userDAO() {
        lista = new ArrayList();

    }

    @Override
    public List<user> List(Object obj) {
        user u = (user) obj;
        lista.add(u.getUsername());
        
        return lista;
    }

    @Override
    public List<?> ListBy(int ID) {
        return lista;
    }

    @Override
    public Boolean Create(Object obj) {
        return null;
    }

    @Override
    public Boolean Update(Object obj) {
        return null;
    }

    @Override
    public Boolean Delete(int ID) {
        return null;
    }

    
    
    
    
    
    
}
