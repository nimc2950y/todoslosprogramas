package View;

import java.util.Scanner;
import Controller.*;

public class TestEmpresa {
    public static void main(String[] args) {
        
        Persona[] personasArray = {new Persona("Gerente", "Juan Diego"),
                                   new Persona("Cliente", "Suanny")};

        Terreno[] terrenosArray = {new Terreno(10, 5, 2),
                                   new Terreno(20, 30, 2)};
        
        for(Persona pers : personasArray)
            System.out.println(pers);
        
        for(Terreno terr : terrenosArray){
            terr.calcularArea();
            terr.calcularCostoFinal();
            System.out.println(terr);
        }
    }
}
    