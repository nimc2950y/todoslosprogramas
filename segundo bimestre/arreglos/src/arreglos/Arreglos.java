/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglos;

import java.util.Scanner;

public class Arreglos{
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Primera parte: Ingreso del arreglo
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamaño = scanner.nextInt();

        int[] arreglo = new int[tamaño];
        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + ":");
            arreglo[i] = scanner.nextInt();
        }
        System.out.println("Los elementos del arreglo son:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(arreglo[i] + " ");
        }

        // Segunda parte: Eliminación del arreglo
        System.out.println("Ingrese el elemento que desea eliminar:");
        int elementoEliminar = scanner.nextInt();

        int[] nuevoArreglo = eliminarElemento(arreglo, elementoEliminar);

        System.out.println("El nuevo arreglo es:");
        for (int i = 0; i < nuevoArreglo.length; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }

    public static int[] eliminarElemento(int[] arreglo, int elemento) {
        int tamaño = arreglo.length - 1;
        int[] nuevoArreglo = new int[tamaño];
        int indiceNuevoArreglo = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != elemento) {
                nuevoArreglo[indiceNuevoArreglo] = arreglo[i];
                indiceNuevoArreglo++;
            }
        }

        return nuevoArreglo;
    }
}
