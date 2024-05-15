/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import java.util.Scanner;
import java.util.ArrayList;

public class Empresa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
        int opcion;

        do {
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar información de empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Empleado.agregarEmpleado(scanner, empleados);
                    break;
                case 2:
                    Empleado.mostrarInformacionEmpleados(empleados);
                    break;
                case 3:
                    Empleado.calcularAumentoSalario(scanner, empleados);
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}