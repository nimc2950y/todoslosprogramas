/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;
public class Terreno{
    public double alto;
    public double ancho;
    public double vmc;
    public double area;
    public double costoFinal;
    public String msjCompra;

    public Terreno(double alto, double ancho, double vmc) {
        this.alto = alto;
        this.ancho = ancho;
        this.vmc = vmc;
        this.msjCompra = null;
    }
    public void calcularArea(){
        this.area = this.alto * this.ancho;
        }
        
    public void calcularCostoFinal(){
        this.costoFinal = area * vmc;
        if (area > 300) {
            costoFinal *= 0.8;
        msjCompra = "Felicidades 10% descuento";
    } else if (area >=200) {
            costoFinal *= 0.9;
        msjCompra = "Felicidades 20% descuento.";
        }
    }

    @Override
    public String toString() {
        return "Terreno{" + "alto=" + alto + ", ancho=" + ancho + ", vmc=" + vmc + ", area=" + area + ", costoFinal=" + costoFinal + ", msjCompra=" + msjCompra + '}';
    }
}