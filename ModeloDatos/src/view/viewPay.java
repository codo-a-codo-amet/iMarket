/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class viewPay {
    private String des;

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
   
    Scanner teclado = new Scanner(System.in);
    
    public void EscribirFormulario() {
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Formulario de registro Formas de Pago");
        System.out.println("Ingrese una Forma de Pago:");
        String fp = teclado.nextLine();
        setDes(fp);
        System.out.println("+++++++++++++++++++++++++");
    }
}

