/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author User
 */
public class Nodo {
  
    Contacto dato;
    Nodo siguiente; //puntero enlace 

    public Nodo(Contacto dato) {
        this.dato = dato;
        this.siguiente = null ;
    }
}
