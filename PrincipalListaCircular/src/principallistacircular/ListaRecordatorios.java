/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principallistacircular;
/**
 *
 * @author User
 */
public class ListaRecordatorios {


    NodoRecordatorio ultimo;

    public ListaRecordatorios() {
        ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public ListaRecordatorios insertar(Recordatorio rec) {
        NodoRecordatorio nuevo = new NodoRecordatorio(rec);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        return this;
    }
    
    public void mostarLista(){
        NodoRecordatorio auxiliar=ultimo.siguiente;
        String cadena="";
        do{
          cadena=cadena +"\n"+"Fecha:"+auxiliar.rec.getFecha()+"\t" +"Descripción:"+auxiliar.rec.getDescripcion()+"\n";
          auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        System.out.println("---------Lista Recordatorios---------"+cadena);
    }

    public boolean eliminar(String descripcion){
        NodoRecordatorio actual;
        boolean encontrar=false;
        actual=ultimo;
        
        while(actual.siguiente !=ultimo && !encontrar){
            encontrar=(actual.siguiente.rec.getDescripcion().equalsIgnoreCase(descripcion));
            if(!encontrar){
                actual=actual.siguiente;
            }
        }
        encontrar=(actual.siguiente.rec.getDescripcion().equalsIgnoreCase(descripcion));
        if(encontrar){
            NodoRecordatorio auxiliar=actual.siguiente;
            if(ultimo==ultimo.siguiente){
                ultimo=null;
            }else{
                if(auxiliar==ultimo){
                    ultimo=actual;
                }
                actual.siguiente=auxiliar.siguiente;               
            }
            auxiliar=null;
        }
        return encontrar==true;
    }
}