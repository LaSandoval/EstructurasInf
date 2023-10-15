/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pilas.y.colas;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pilas {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    RegistroCuentas registro = new RegistroCuentas();

        while (true) {
            System.out.println("1. Agregar cuenta");
            System.out.println("2. Eliminar última cuenta");
            System.out.println("3. Calcular total de cuentas");
            System.out.println("4. Mostrar cuentas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto de la cuenta: ");
                    double monto = scanner.nextDouble();
                    registro.agregarCuenta(monto);
                    break;
                case 2:
                   registro.eliminarUltimaCuenta();
                    break;
                case 3:
                    double total = registro.calcularTotalCuentas();
                    System.out.println("Total de cuentas: " + total);
                    break;
                case 4:
                    registro.mostrarCuentas();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
    }
    }
}
