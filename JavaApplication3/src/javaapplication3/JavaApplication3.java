/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Contacto> Agenda= new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        
        while (true){
            System.out.println("1.Agregar contacto");
            System.out.println("2.Mostrar contactos");
            System.out.println("3.Buscar contacto");
            System.out.println("4.Salir");
            System.out.println("5.Selecione otra opción");
            
            int opc=sc.nextInt();
            
            if(opc==1){
                System.out.println("____________LISTA DE CONTACTOS_____________");
                System.out.println("Nombre: ");
                String nom=sc.next();
                System.out.println("Número de telefono: ");
                String num=sc.next();    
                Contacto contact= new Contacto(nom, num) ;
                Agenda.add(contact);
                }
            else if(opc==2){
                for (Contacto contact : Agenda) {
                    int pos=1;
                    System.out.println("Contacto"+ pos+ ":");
                    System.out.println("Nombre:"+ contact.getNombre());
                    System.out.println("Número de telefono:"+ contact.getNumTelefono());
                    pos++;
                }
            }
             else if(opc==3){
                 System.out.println("Introduce el nombre del contacto a buscar");
                    String i=sc.next();
                    for (Contacto contact : Agenda) {
                    String temp = contact.getNombre();
                    if (temp == null ? i == null : temp.equals(i)) {
                      System.out.println("Nombre:"+ contact.getNombre());
                      System.out.println("Número de telefono:"+ contact.getNumTelefono());
                        System.out.println("");
           
                        }else{
                            System.out.println("No se ha encontrado el contacto");
                    }
                    }
             }
                    else if(opc==4){
                            break;
                            }
             
                    }  
                
            }
            
        }
       
    

