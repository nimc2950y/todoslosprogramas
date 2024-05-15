package recursividad;

public class Recursividad {
    public static void main(String[] args) {
     int num = 4;
     PrintNum(num);
    }
    static void PrintNum(int n){
        System.out.println(n);
        if(n>1){
        PrintNum(n-1);
        }
        System.out.println(n);
    }
    
}
