/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agenda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Agenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       ArrayList <Contacto> Agenda=new ArrayList();
        int opcion;
        
        
        
        ListaEnlazada lista1 = new ListaEnlazada();
       
        
    
    do{
    System.out.println("\nQué desea realizar?"+
            "\n 1.Agregar contacto"+
            "\n 2.Ver agenda"+
            "\n 3.Buscar contacto"+
            "\n 4.Eliminar contacto"+
            "\n 5.Salir");
    opcion=sc.nextInt();
    if (opcion==1){
        String nombre;
        long num;
        
        System.out.println("Ingrese el nombre del contacto");
        nombre=sc.next();
        System.out.println("Ingrese el número del telefono");
        num=sc.nextLong();
        Contacto c=new Contacto(nombre, num);
        lista1.insertarAlInicio(c);

    }
      if (opcion==2){
        System.out.println("Agenda completa");
        lista1.imprimirLista();    
    }
     if (opcion == 3) {
     String nombre;
    System.out.println("Qué contacto desea buscar");
    nombre = sc.next();
    Contacto c= lista1.buscarPorNombre(nombre);
    if (c != null) {
        System.out.println("Contacto encontrado:");
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Número: " + c.getNum());
    } else {
        System.out.println("El contacto no se encontró en la agenda.");
    }
}
     if(opcion==4){
          String nombre;
          System.out.println("Qué contacto desea eliminar");
          nombre=sc.next();
          lista1.eliminarNodo(nombre);
      }
    }  while(opcion!=5);
}

}
