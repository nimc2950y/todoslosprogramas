package prueba;
import java.util.Scanner;


public class Prueba {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int llantas = 0;
        String nombre;
        Transporte transporte = new Transporte("rojo",80,4, llantas);
        System.out.println("Escriba el numero de llantas");
        llantas = sc.nextInt();
        transporte.validarTransporte(llantas);
        //================================================
        Conductor conductor = new Conductor();
        System.out.println("Ingrese su nombre: ");

    }
        
}
