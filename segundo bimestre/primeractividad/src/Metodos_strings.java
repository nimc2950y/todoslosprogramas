package primeractividad;

import java.util.Scanner;

public class Metodos_strings {
    Scanner entrada;
    String cadena, cad;
        
    public Metodos_strings(){
        this.entrada = new Scanner(System.in);
        this.cadena = "";
        this.cad = "";
    }
    
    public int menu(){
        System.out.println("Presentar caracter por caracter [1]:");
        System.out.println("Contar caracteres en cadena     [2]:");
        System.out.println("Es palíndromo?                  [3]:");
        System.out.println("Contar vocales y consonantes    [4]:");
        System.out.println("Contar palabras                 [5]:");
        System.out.println("Salir                           [0]:");
        return entrada.nextInt();
    }
    
    public void carxcar(){
        entrada.nextLine();
        System.out.println("Digite una cadena: ");
        cadena = entrada.nextLine();
        System.out.println(cadena);
        for(int i=0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }        
    }
    
    public void cuenta(){
        char caracter;
        entrada.nextLine();
        int cont = 0;
        System.out.println("Digite una cadena de caracteres : ");
        cadena = entrada.nextLine();
        System.out.println("Digite un caracter : ");
        caracter = entrada.next().charAt(0);
        for(int i=0; i<cadena.length();i++){
            if(cadena.charAt(i) == caracter)
                cont++;
        }
        System.out.println("El caracter "+caracter+" se repite "+cont+" veces");
    }
    
    public String eliminaEspacios(String cad){
        return cad.replace(" ","");        
    }
    
    public void palindromo(){
        int j;
        boolean noes=false;
        entrada.nextLine();
        System.out.println("Digite una cadena de caracteres : ");
        cadena = entrada.nextLine();
        cad = eliminaEspacios(cadena);
        j = cad.length()-1;
        for(int i=0; i<cad.length()/2; i++){
            if(cad.charAt(i) != cad.charAt(j)){
                noes = true;
                System.out.println("No es palindromo");
                break;
            }
            j--;
        }
        if(noes==false)
            System.out.println("Si es palíndromo");
    } 
    
    public void vocalesConsonantes(){
        int vocales=0, consonantes=0;
        entrada.nextLine();
        System.out.println("Digite una cadena de caracteres : ");
        cadena = entrada.nextLine();
        cad = eliminaEspacios(cadena);
        for(int i=0; i<cad.length();i++){
            if(cad.charAt(i)=='a' || cad.charAt(i)=='e' 
                    || cad.charAt(i)=='i' || cad.charAt(i)=='o' 
                    || cad.charAt(i)=='u'){
                vocales++;
            }else{
                consonantes++;
            }
        }
        System.out.println("Existen "+vocales+" vocales y "+consonantes+" consonantes");
    }
      public void contarpalabras() {
      entrada.nextLine(); 
      System.out.println("Por favor, escriba una frase: ");
      cadena = entrada.nextLine(); 

      String[] palabras = cadena.split(" ");

      int cantidadPalabras = palabras.length;

      System.out.println("Las palabras ingresada tiene " + cantidadPalabras + " palabras.");
    }
}
