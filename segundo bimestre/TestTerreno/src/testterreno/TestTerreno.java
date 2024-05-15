/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testterreno;

import java.util.Scanner;
public class TestTerreno {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        boolean opc = true;
        String restp = null;
        while(opc){
        System.out.println("Dame el alto, ancho,vmc");
            
        Terreno t1 = new Terreno(tc.nextDouble(),tc.nextDouble(),tc.nextDouble());
        t1.calcularArea();
        t1.calcularCostoFinal();
        System.out.println(t1);
        System.out.println("Deseas vender mas(S/N)?");
        restp = tc.next();
        if (restp.equals("N")) break;
        }
      
    }
    
}
class Terreno{
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