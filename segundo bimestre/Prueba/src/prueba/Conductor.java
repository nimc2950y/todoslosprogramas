package prueba;


public class Conductor {
   String nombre;
  int anioNacimiento;
    
    public  Conductor(String nombre, int anioNacimiento){
        this.nombre = "";
        this.anioNacimiento = "";
    }
    public void mayorEdad() {
        int edad = 2024 - this.anioNacimiento;
        if (edad < 18) {
            System.out.println("Usted es menor de edad.Usted no puede manejar ");
        } else {
            System.out.println("Usted es mayor de edad.Usted puede manejar ");
        }
    }
}
