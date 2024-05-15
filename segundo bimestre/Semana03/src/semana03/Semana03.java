package semana03;

import java.util.Scanner;

public class Admin {
    
    public static void main(String[] args) { 
        // 
        Scanner entrada = new Scanner(System.in); 
        Notas objNotas = new Notas(); 
        objNotas.inicializar(); 
        //       
        int op;
        do { 
            opciones(); 
            System.out.print("\tOpcion: ");
            op = entrada.nextInt();
            switch (op) { 
                case 1  : objNotas.lectura(); break; 
                case 2  : objNotas.listarCampo(); break; 
                case 3  : objNotas.totalesXEstudiante(); break; 
                case 4  : objNotas.totalesXParalelo(); break; 
            }
        } while(op != 0);
    }
    
    static void opciones() { 
        System.out.println("\t|===========================================|");
        System.out.println("\t| Matrices: Menú Principal.                 |");
        System.out.println("\t|===========================================|");
        System.out.println("\t| 1.  Leer/Presentar datos.                 |");
        System.out.println("\t| 2.  Lista datos de un campo               |");
        System.out.println("\t| 3.  Totales por estudiante                |");
        System.out.println("\t| 4.  Totales por paralelo                  |");
        System.out.println("\t| 0.  Salir.                                |");
        System.out.println("\t|===========================================|");
    }
    
}
