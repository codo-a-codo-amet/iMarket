/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

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
    public List<user> List() {
        System.out.println("Listar usuarios");
        lista.add("usuario 1");
        lista.add("usuario 2");
        return lista;
    }

    @Override
    public List<user> ListBy() {
        return null;
    }

    @Override
    public Boolean Create() {
        return true;
    }

    @Override
    public Boolean Update() {
        return true;
    }

    @Override
    public Boolean Delete() {
        return true;
    }

}
