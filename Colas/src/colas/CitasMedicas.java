/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.time.LocalDate;

/**
 *
 * @author User
 */
public class CitasMedicas {
    String nombre;
    int documento;
    LocalDate fecha;
    String hora;
    String lugar;
    String eps;
    String especialidad;

    public CitasMedicas(String nombre, int documento, LocalDate fecha, String hora, String lugar, String eps, String especialidad) {
        this.nombre = nombre;
        this.documento = documento;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.eps = eps;
        this.especialidad = especialidad;
    }

    public CitasMedicas() {
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
