package testpersona;


public class TestPersona {
    public static void main(String []args){
    Persona p1 = new Persona();
    Persona p2 = new Persona("Nicole", 20);
    Persona p3 = new Persona("Liz");
    p3.setEdad(p3.calcularEdad(2005));
    System.out.println(p1.getNombre());
    System.out.println(p1.getEdad());
    System.out.println(p2.getNombre());
    System.out.println(p2.getEdad());
    System.out.println(p3.getNombre());
    System.out.println(p3.getEdad());
    System.out.println(p3.toString());
    } 
}
class Persona {
    public String nomb;
    private int edad;
    public Persona(){}
        public Persona(String nomb){
        this.nomb = nomb;
    }
    public Persona(String nomb, int edad){
        this.nomb = nomb;
        this.edad = edad;
    }
    public void setNomb(String nom) {
        this.nomb = nomb;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int calcularEdad(int anioNac){
     return 2024 - anioNac;
    }
    public String getNombre(){
    return this.nomb;
    }
    public int getEdad(){
    return this.edad;
    }
    @Override
    public String toString(){
        return String.format("Nombre: %s\nEdad %d", this.nomb, this.edad);
    }
}


