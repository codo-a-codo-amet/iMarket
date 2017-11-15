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
public class DAOUser extends User implements IAcctionDB {

    List lista;

    public DAOUser() {
        lista = new ArrayList();

    }
    
    @Override
    public List<User> List(Object obj) {
        User u = (User) obj;
        lista.add(u.getUsername());
        
        return lista;
    }

    @Override
    public List<?> ListBy(String campo, String criterio) {
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
    public Boolean Delete(Object obj) {
        return null;
    }

    
    
    
    
    
    
}
