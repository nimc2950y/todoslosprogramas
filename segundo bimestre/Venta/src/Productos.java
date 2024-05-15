

public class Productos {
    public double precio;
    public int cantidad;

    public Productos(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return precio * 0.10; 
        } else {
            return precio * 0.05; 
        }
    }

    public double calcularPrecioFinal() {
        return precio - calcularDescuento();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
