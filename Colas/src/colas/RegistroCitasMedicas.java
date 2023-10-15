/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colas;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class RegistroCitasMedicas {
    Queue<CitasMedicas> cola1 = new LinkedList<CitasMedicas>();
    
    public void agregarCitaMedica (String nombre, int documento, LocalDate fecha, String hora, String lugar, String eps, String especialidad){
        cola1.add(new CitasMedicas(nombre, documento, fecha, hora, lugar, eps, especialidad));
    }
    
    public void eliminarCita() {
        if (!cola1.isEmpty()) {
            cola1.poll();
        }
    }
    
    public void imprimirCitas(){
        for(CitasMedicas cita:cola1){
            JOptionPane.showMessageDialog(null,"CITAS MÉDICAS"+cita.getNombre()+"\n"+cita.getDocumento()+"\n"+cita.getEps()+"\n"+cita.getEspecialidad()+"\n"+cita.getHora()+"\n"+cita.getFecha()+"\n"+cita.getLugar());
        }
    }
    
    
}
