/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB2-PC
 */
public class Coordinador {
    
    
    public String ingresarAtributos(){
        JOptionPane.showInputDialog("Escoja una opcion:\n"
                + "1.- Ingresar placa"
                + "\n2.-Ingresar chasis"
                + "\n3.-Ingresar color"
                + "\n4.-Ingresar marca"
                + "\n5.-Ingresar modelo");
        return ;
    }
    public String retornarAtributos(){
        JOptionPane.showInputDialog("Escoja una opcion:\n"
                + "1.-Retornar placa"
                + "\n2.-Retornar chasis"
                + "\n3.-Retornar color"
                + "\n4.-Retornar marca"
                + "\n5.-Retornar modelo");
        return ; 
    } 
    
    public String opcionesMenu(){
        JOptionPane.showInputDialog("Ingresa una opcion:\n"
                + "1.- Ingresar atributos\n"
                + "2.- Retornar atributos\n"
                + "3.- Salir\n");
        return ;
    }
    
    public void menu(){
        String op="";
        do{
            opcionesMenu();
            switch(op){
                case "1":
                    JOptionPane.showInputDialog(ingresarAtributos());
                    break;
                case "2":
                    retornarAtributos();
                    break;
                case "3": 
                    System.exit(3);
                    break;
            }    
        }while(!op.equals("3"));
    }   

}
