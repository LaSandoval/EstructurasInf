/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principallistacircular;

/**
 *
 * @author User
 */

import java.time.LocalDate;
import java.util.Scanner;

public class PrincipalListaCircular {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ListaRecordatorios lista = new ListaRecordatorios();
        Recordatorio rec=new Recordatorio();
        int opcion = 0;
        boolean eliminado=false;
        
        do {
            try {
                System.out.println("""
                                   Qu\u00e9 desea hacer
                                   1. Agregar Recordatorio
                                   2. Mostrar Recordatorios
                                   3. Eliminar Recordatorio
                                   4. Salir
                                   """);
                opcion=sc.nextInt();
                switch (opcion) {
                    case 1:{
                        System.out.println("Ingresa la fecha en formato YYYY-MM-DD");
                        String fecha=sc.next();
                        LocalDate fecha1=LocalDate.parse(fecha);
                        System.out.println("Ingresa la descripción del recordatorio");
                        String descripcion = sc.next();
                        
                        Recordatorio nuevoRec = new Recordatorio(fecha1, descripcion);
                        // Valida que la fecha tenga el formato correcto antes de agregar el recordatorio
                        if (isValidDate(fecha, "yyyy-MM-dd")) {
                            lista.insertar(nuevoRec);
                        } else {
                            System.out.println("Formato de fecha incorrecto");
                        }
                        break;
                    }
                    
                    case 2: 
                        if(!lista.estaVacia()){
                            lista.mostarLista();
                        }else{
                            System.out.println("Aún no hay recordatorios");
                        }
                        break;
                     
                    case 3:
                        if(!lista.estaVacia()){
                             System.out.println("Qué recordatorio desea eliminar");
                             String descripcion=sc.next();
                             eliminado=lista.eliminar(descripcion);
                        if(!eliminado){
                             System.out.println("El recordatorio no se ha encontrado");
                        }
                        }else{
                            System.out.println("La lista esta vacia");
                        }
                         break;     
                    case 4: System.out.println("Finalizando");
                            break;
                    default: System.out.println("Opción no válida");
                }
            } catch (NumberFormatException n) {
                System.out.println("Error");
            }
        } while (opcion != 4);
    }

    // Método para validar el formato de fecha
    private static boolean isValidDate(String date, String format) {
        try {
            java.text.SimpleDateFormat dateFormat = new java.text.SimpleDateFormat(format);
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (java.text.ParseException e) {
            return false;
        }
    }
}
