package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author root
 */
public class CsvTabla { 
    //
    public static void main(String[] args) {
        // Datos a guardar en el archivo
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos registros quiere ingresar? ");
        String dato = entrada.nextLine(); 
        int nReg = Integer.parseInt(dato);
        
        String rutaArchivo = "datos.csv"; // Ruta y nombre del archivo
        try {
            File archivo = new File(rutaArchivo); // Crear un objeto File para el archivo
            // Crear un objeto FileWriter y un objeto PrintWriter para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(escritor); 
            //
            printWriter.println("N;Cedula;Nombre;Edad"); 
            for(int i=1; i<=nReg; i++) {
                System.out.print("Cedula: ");
                String cedula = entrada.nextLine(); 
                System.out.print("Nombre: ");
                String nombre = entrada.nextLine(); 
                System.out.print("Edad: ");
                String edad = entrada.nextLine(); 
                String strToSave = i +";"+ cedula +";"+ nombre +";"+ edad; 
                printWriter.println(strToSave);
            }
            // Cerrar el archivo
            printWriter.close();
            System.out.println("Información almacenada correctamente......");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
        }
    }
}
