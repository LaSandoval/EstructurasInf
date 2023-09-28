/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principallistacircular;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Recordatorio {

    LocalDate fecha;
    String descripcion;

    public Recordatorio() {
    }

   
    public Recordatorio(LocalDate fecha, String descripcion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
    
    
    public LocalDate getFecha() {
        return fecha;
    }

     public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
   
}
