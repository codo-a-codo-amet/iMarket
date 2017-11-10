/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author walter
 */
public interface IAcctionDB {
    
    public void List();
    
    public Boolean Create();
    
    public Boolean Update();
    
    public boolean Delete();
}
