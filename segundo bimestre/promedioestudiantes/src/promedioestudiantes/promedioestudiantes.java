package promedioestudiantes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class promedioestudiantes {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        System.out.println("Buenos días");
        System.out.println("Seleccione una opción:");
        System.out.println("1) Nota más alta");
        System.out.println("2) Promedios de todos los estudiantes 1er bimestre");
        System.out.println("3) Promedios de todos los estudiantes 2do bimestre");
        System.out.println("4) Promedio de todos los estudiantes");
        System.out.println("5) Datos de todo los estudiantes");
        System.out.println("6) Salir");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                obtenerNotaMasAlta();
                break;
            case 2:
                obtenerPromediosPrimerBimestre();
                break;
            case 3:
                obtenerPromediosSegundoBimestre();
                break;
            case 4:
                obtenerPromedioTotal();
                break;
            case 5:
                leerEXCEL("file/notas.csv");
                break;
            case 6:
                System.out.println("Hasta luego");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

   public static void obtenerNotaMasAlta() {
}
   public static void obtenerPromediosPrimerBimestre() {
}
    public static void obtenerPromediosSegundoBimestre() {
        System.out.println("Los promedios de cada estudiante del segundo bimestre son:");
    }

   public static void obtenerPromedioTotal() {
    }


public static void leerEXCEL(String rutaArchivo) {
    try {
        File archivo = new File(rutaArchivo);
        Scanner scanner = new Scanner(archivo);

        if (scanner.hasNextLine()) {
            String encabezados = scanner.nextLine();
            String[] encabezadosArray = encabezados.split(";");
            for (String encabezado : encabezadosArray) {
                System.out.print(String.format("%-12s", encabezado.trim()));
            }
            System.out.println(); 
        }

        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            String[] campos = linea.split(";");

            for (String campo : campos) {
                System.out.print(String.format("%-12s", campo.trim()));
            }
            System.out.println();
        }

        scanner.close();
    } catch (FileNotFoundException e) {
        System.out.println("Archivo no encontrado: " + e.getMessage());
    }
}
}