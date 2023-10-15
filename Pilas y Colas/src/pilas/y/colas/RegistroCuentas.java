/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilas.y.colas;

import java.util.Stack;

/**
 *
 * @author User
 */
public class RegistroCuentas {
    private final Stack<Supermercado> cuentas = new Stack<>();

    public void agregarCuenta(double monto) {
        cuentas.push(new Supermercado(monto));
    }

    public void eliminarUltimaCuenta() {
        if (!cuentas.isEmpty()) {
            cuentas.pop();
        }
    }

    public double calcularTotalCuentas() {
        double total = 0;
        for (Supermercado cuenta : cuentas) {
            total += cuenta.getMonto();
        }
        return total;
    }

    public void mostrarCuentas() {
        Stack<Supermercado> cuentas1 = new Stack<>();
        cuentas1.addAll(cuentas);
        while (!cuentas1.isEmpty()){
        System.out.println("Cuentas registradas:");
        Supermercado obj = new Supermercado();
        obj = cuentas1.pop();
        System.out.println("Monto: " + obj.getMonto());  
        }
      
    }
}

