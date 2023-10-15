/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colas;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
       RegistroCitasMedicas registro=new RegistroCitasMedicas();
        int opcion = 0;
        
          
            do{  
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"""
                                             \u00bfQu\u00e9 desea hacer
                                             1.Agregar cita
                                             2.Eliminar cita
                                             3.Mostrar citas pendientes
                                             4.Salir"""));
            switch (opcion) {
                case 1:
                    String nombre =JOptionPane.showInputDialog(null, "Ingrese el nombre del paciente") ;
                    int documento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el documento del paciente"));
                    LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog(null, "Ingrese la fecha de la cita en formato YYYY-MM-DD"));
                    String hora = JOptionPane.showInputDialog(null, "Ingrese la hora de la cita");
                    String lugar = JOptionPane.showInputDialog(null, "Ingrese el lugar de la cita");
                    String eps = JOptionPane.showInputDialog(null, "Ingrese la eps del paciente");
                    String especialidad =JOptionPane.showInputDialog(null, "Ingrese la especialidad correspondiente");
                    registro.agregarCitaMedica(nombre, documento, fecha, hora, lugar, eps, especialidad);
                    break;

                case 2:
                   registro.eliminarCita();
                    break;
                case 3:
                   registro.imprimirCitas();
                case 4:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            } while(opcion!=4);
    }
}
    
   
