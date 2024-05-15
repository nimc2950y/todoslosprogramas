/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package venta;

public class Productos {
    private double precio;
    private int cantidad;

    public Productos(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularTotal() {
        return precio * cantidad;
    }

    public double calcularDescuento() {
        if (precio >= 1000 && cantidad >= 10) {
            return calcularTotal() * 0.1;
        } else {
            return calcularTotal() * 0.05; 
        }
    }

    public double calcularPrecioFinal() {
        return calcularTotal() - calcularDescuento();
    }
}