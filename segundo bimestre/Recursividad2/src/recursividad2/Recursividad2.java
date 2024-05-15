package recursividad2;


public class Recursividad2 {
    public static void main(String[] args) {
        int f = factorial(6);
        System.out.println(f);
    }
    static int factorial(int n){
    int prod = 1;
    if(n > 1)
        prod = n * factorial(n - 1);
    return(prod);
    }
    
}
