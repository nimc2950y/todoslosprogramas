package prueba;

public class Transporte {
    String  color;
    private int velocidad;
    private int traccion;
    private int llantas;
    public Transporte(String color,int velocidad,int traccion,int llantas) {
        this.color = color;
        this.velocidad = velocidad;
        this.traccion = traccion;
        this.llantas = llantas;
        System.out.println("El color de su auto es " +color + " ,su velocidad es " + velocidad + " ,su traccion es " + traccion);
    }
    public void subirVelocidad() {
    System.out.println("Subir Velocidad ");
}
    public void bajarVelocidad() {
    System.out.println("Bajar velocidad"); 
}
    public void cambioMarcha() {
        System.out.println("Cambiar marcha "+ velocidad);
}
    public void validarTransporte(int llantas) {
        if (llantas == 2 ) {
            System.out.print(" Es una moto");
        if (llantas == 4) {
                System.out.println(" Es un vehiculo");
        } 
    }
 }
    public void establecerColor(String col) {
        color = col;
    }
    public void establecerVelocidad(int vel) {
        velocidad = vel;
    }
    public void establecerTraccion(int trac) {
        traccion = trac;
    }
    public void establecerLlantas(int llan) {
        llantas = llan;
    }
    public String obtenerColor() {
        return color;
    }
    public int obtenerVelocidad() {
        return velocidad;
    }
    public int obtenerTraccion() {
        return traccion;
    }
    public int obtenerLlantas() {
        return llantas;
    }
  
}
