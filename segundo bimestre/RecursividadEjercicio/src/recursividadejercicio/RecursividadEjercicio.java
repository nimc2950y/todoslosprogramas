package recursividadejercicio;

public class RecursividadEjercicio {
    public static void main(String[] args) {
       int potencia = potenciaRecursiva(2, 10);
       int multiplicacion = multiplicacionRecursiva(2, 10);
        System.out.println("2 elevado a la potencia 10 es: " + potencia);
        System.out.println("2 multiplicado por 10 es: " + multiplicacion);
    }
    
    static int multiplicacionRecursiva(int numero, int veces) {
        if (veces == 1)
            return numero;
        else
            return numero + multiplicacionRecursiva(numero, veces - 1);
    }
        
    static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0)
            return 1;
        else
            return base * potenciaRecursiva(base, exponente - 1);
    }
}