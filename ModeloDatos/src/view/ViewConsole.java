/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

public class ViewConsole {

    private String u;
    private String c;
    private String nom;
    private String ape;

    public void setU(String u) {
        this.u = u;
    }

    public String getU() {
        return u;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    Scanner teclado = new Scanner(System.in);
    
    public void EscribirFormulario() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Formulario de registro");
        System.out.println("Ingrese un Usuario: ");
        String us = teclado.nextLine();
        setU(us);
        System.out.println("+++++++++++++++++++++++++");
    }

}
