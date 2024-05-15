package primeractividad;

public class Primeractividad {
    public static void main(String[] args) {
        Metodos_strings obj = new Metodos_strings();
        int opc;
        do {
            opc = obj.menu();
            switch(opc){
                case 1 : obj.carxcar();
                case 2 : obj.cuenta();
                case 3 : obj.palindromo();
                case 4 : obj.vocalesConsonantes();
                case 5 : obj.contarpalabras();
                default : { }
            }
        } while(opc!=0);
    }
    
}
