/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda;

/**
 *
 * @author User
 */
public class ListaEnlazada {
     private Nodo inicio;
     private Nodo fin;

	    public ListaEnlazada() {
	        inicio = null;
                fin=null;
	    }

	    public void insertarAlInicio(Contacto dato) {
	        Nodo nuevoNodo = new Nodo(dato);
	        nuevoNodo.siguiente = inicio;
	        inicio = nuevoNodo;
	    }

	    public void imprimirLista() {
	        Nodo actual = inicio;
	        while (actual != null) {
	            //System.out.println(actual.dato + ":");
                    System.out.println(actual.dato.getNombre());
                    System.out.println(actual.dato.getNum());
	            actual = actual.siguiente;
	        }
	        System.out.println();
	    }
           
            public boolean estaVacia() {
		if(inicio==null) {
			return true;
		}else {
			return false;
		}
	}

       public void eliminarNodo(String nombre) {
    if (!estaVacia()) {
        if ((nombre == null && inicio.dato == null) || (nombre != null && nombre.equalsIgnoreCase(inicio.dato.getNombre()))) {
            inicio = inicio.siguiente;
            if (inicio == null) {
                fin = null;
            }
        } else {
            Nodo anterior = inicio;
            Nodo temporal = inicio.siguiente;
            while (temporal != null && !temporal.dato.getNombre().equalsIgnoreCase(nombre)) {
                anterior = anterior.siguiente;
                temporal = temporal.siguiente;
            }
            if (temporal != null) {
                anterior.siguiente = temporal.siguiente;
                if (temporal == fin) {
                    fin = anterior;
                }
            }
        }
    }
}

 public Contacto buscarPorNombre(String nombre) {
    Nodo actual = inicio;
    while (actual != null) {
        if (actual.dato.getNombre().equalsIgnoreCase(nombre)) {
            return actual.dato;
        }
        actual = actual.siguiente;
    }
    return null; // Si no se encuentra el contacto, devuelve null.
}





    
            public boolean isEmpty() {
	        return inicio== null;
            }
}
