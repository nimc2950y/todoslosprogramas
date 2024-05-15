package venta;
import java.util.Scanner;

public class Venta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = scanner.nextInt();

        Productos venta = new Productos(precio, cantidad);
        
        double totalSinDescuento = venta.calcularTotal();
        System.out.println("El total de su compra es de: $" + totalSinDescuento);

        double descuento = venta.calcularDescuento();
        double precioFinal = venta.calcularPrecioFinal();

        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final después del descuento: $" + precioFinal);

        scanner.close();
    }
}