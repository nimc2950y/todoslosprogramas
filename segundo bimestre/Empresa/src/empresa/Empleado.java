package empresa;

import java.util.ArrayList;
import java.util.Scanner;

class Empleado {
    private String nombre;
    private double salario;
    private int edad;


    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
     public String getNombre() {
        return nombre;
    }
    public void aplicarAumento(double porcentajeAumento) {
        salario += salario * (porcentajeAumento / 100);
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre = " + nombre + ", salario = " + salario + ", edad = " + edad + '}';
    }
     public static void agregarEmpleado(Scanner scanner, ArrayList<Empleado> empleados) {
        System.out.print("Ingrese el nombre del empleado: ");
        scanner.nextLine();
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        empleados.add(new Empleado(nombre, salario, edad));
    }

    public static void mostrarInformacionEmpleados(ArrayList<Empleado> empleados) {
        System.out.println("Información de todos los empleados de la empresa:");
        for (Empleado empleado : empleados) {
            System.out.println(empleado);
        }
    }

    public static void calcularAumentoSalario(Scanner scanner, ArrayList<Empleado> empleados) {
        System.out.print("Ingrese el porcentaje de aumento salarial para los empleados: ");
        double porcentajeAumento = scanner.nextDouble();
        
        double salarioTotal = 0;
        for (Empleado empleado : empleados) {
            salarioTotal += empleado.getSalario();
        }
        double salarioPromedio = salarioTotal / empleados.size();
        for (Empleado empleado : empleados) {
            if (empleado.getSalario() < salarioPromedio) {
                empleado.aplicarAumento(porcentajeAumento);
                System.out.println("Se aumentó el salario a: " + empleado.getNombre() + ": " + empleado.getSalario());
            }
        }
    }
}