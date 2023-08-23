/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroacademico;

import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RegistroAcademico extends Estudiante{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       Estudiante[] estudiantes= new Estudiante[5];
       
       
       for(int i=0; i<5; i++){
           estudiantes[i]= new Estudiante();
           System.out.println("Ingrese el nombre del estudiante");
           estudiantes[i].nombre = sc.nextLine();
           System.out.println("Ingrese el número de identificación");
           estudiantes[i].ident = sc.nextInt();
           System.out.println("Ingrese la edad");
           estudiantes[i].edad = sc.nextInt();
           System.out.println("Ingrese la calificación de Matematicas");
           estudiantes[i].notMate = sc.nextDouble();
           System.out.println("Ingrese la calificación de Ciencias");
           estudiantes[i].notIngles = sc.nextDouble();
           System.out.println("Ingrese la calificación de Ingles");
           estudiantes[i].notCiencias = sc.nextDouble();
           estudiantes[i].calcularProm();
          
           sc.nextLine();
        
    }
       
      System.out.println("*******************ARREGLO INICIAL*******************"); 
      System.out.println("Nombre   ID    edad   notMate notIngles notCiencias Promedio");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + "\t" + estudiante.getIdent() + "\t" + estudiante.getEdad() + "\t" + 
                    estudiante.getNotMate() + "\t"+ estudiante.getNotIngles() + "\t  " + estudiante.getNotCiencias() + "\t" + "\t" + estudiante.getPromTot());
         
        }
        Arrays.sort(estudiantes, Comparator.comparingInt(Estudiante::getEdad));
        System.out.println("*******************ARREGLO POR EDADES*******************"); 
        System.out.println("Nombre   ID    edad   notMate notIngles notCiencias Promedio");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + "\t" + estudiante.getIdent() + "\t" + estudiante.getEdad() + "\t" + 
                    estudiante.getNotMate() + "\t"+ estudiante.getNotIngles() + "\t  " + estudiante.getNotCiencias() + "\t" + "\t" + estudiante.getPromTot());
         
        }
        Arrays.sort(estudiantes, Comparator.comparingDouble(Estudiante::getPromTot).reversed());
        System.out.println("*******************ARREGLO POR PROMEDIO*******************"); 
        System.out.println("Nombre   ID    edad   notMate notIngles notCiencias Promedio");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.getNombre() + "\t" + estudiante.getIdent() + "\t" + estudiante.getEdad() + "\t" + 
                    estudiante.getNotMate() + "\t"+ estudiante.getNotIngles() + "\t  " + estudiante.getNotCiencias() + "\t" + "\t" + estudiante.getPromTot());
         
        }
    }
}
       
