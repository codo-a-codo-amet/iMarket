/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author alumno
 */
public class DBManagedObject {

    public List<String> listColumns;
    public List<Pair<String, String>> listValues;
    public List<String> listAll;
    public String nameTable;

    public void setListColumns(List<String> listColumns) {
        this.listColumns = listColumns;
    }

    public void setListValues(List<Pair<String, String>> listValues) {
        this.listValues = listValues;
    }

    public void setListAll(List<String> listAll) {
        this.listAll = listAll;
    }

    public void setNameTable(String nameTable) {
        this.nameTable = nameTable;
    }

    public DBManagedObject(){
        listValues = new ArrayList<>();
    }
    
    public String getTableName() {
        return nameTable;
    }

    public List<String> getColumns() {
        return listColumns;
    }

    public List<Pair<String,String>> getValues() {
        return listValues;
    }

    public List<String> getAll() {
        return listAll;
    }

    public String getMensaje(String mensaje){
        return mensaje;
    }





}
