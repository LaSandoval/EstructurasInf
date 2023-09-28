/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principallistacircular;

/**
 *
 * @author User
 */
public class NodoRecordatorio {
    Recordatorio rec;
    NodoRecordatorio siguiente;

    public NodoRecordatorio(Recordatorio rec) {
        this.rec = rec;
        siguiente=this;
    }

    public NodoRecordatorio(Recordatorio rec, NodoRecordatorio siguiente) {
        this.rec = rec;
        this.siguiente = siguiente;
    }


    
}


