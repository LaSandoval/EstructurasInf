/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroacademico;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author User
 */
public class Estudiante {
   String nombre;
   int ident;
   int edad;
   double notMate;
   double notCiencias;
   double notIngles;
   double promTot;

    public Estudiante() {
    }

   
    public Estudiante(String nombre, int ident, int edad, double notMate, double notCiencias, double notIngles) {
        this.nombre = nombre;
        this.ident = ident;
        this.edad = edad;
        this.notMate = notMate;
        this.notCiencias = notCiencias;
        this.notIngles = notIngles;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotMate() {
        return notMate;
    }

    public void setNotMate(double notMate) {
        this.notMate = notMate;
    }

    public double getNotCiencias() {
        return notCiencias;
    }

    public void setNotCiencias(double notCiencias) {
        this.notCiencias = notCiencias;
    }

    public double getNotIngles() {
        return notIngles;
    }

    public void setNotIngles(double notIngles) {
        this.notIngles = notIngles;
    }

  public double getPromTot() {
      return promTot;
   }

 public void setPromTot(double promTot) {
       this.promTot = promTot;
   }
  
 public double calcularProm(){
      promTot= (notIngles+notCiencias+notMate)/3;
      return promTot;
  }
 
  
   
    }
 
    
        
      
 

