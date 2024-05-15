package Controler;
public class Empresa {
    public String nombre;
    public Persona PersonasArray[];
    public Terreno terrenosArray[];

    public Empresa(String nombre, Persona[] PersonasArray, Terreno[] terrenosArray) {
        this.nombre = nombre;
        this.PersonasArray = PersonasArray;
        this.terrenosArray = terrenosArray;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", PersonasArray=" + PersonasArray + ", terrenosArray=" + terrenosArray + '}';
    }
}
