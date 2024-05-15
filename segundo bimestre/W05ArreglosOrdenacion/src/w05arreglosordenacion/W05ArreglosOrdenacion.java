/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package w05arreglosordenacion;

/**
 *
 * @author PCENTER
 */
public class W05ArreglosOrdenacion { 
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        Burbuja(arr);
//        Seleccion(arr); 
//        Insercion(arr);
        
//        System.out.println("Metodo QuickSort:");
//        int n = arr.length;
//        QuickSort(arr, 0, n - 1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    } 
    
    
    // Burbuja
    public static void Burbuja(int[] arr) { 
        System.out.println("Metodo Burbuja:");
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) { 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    
    // Seleccion
    public static void Seleccion(int[] arr) { 
        System.out.println("Metodo Seleccion:");
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            // Encontrar el mínimo elemento en el arreglo no ordenado
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Intercambiar el mínimo elemento con el primer elemento no ordenado
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    
    // Insercion
    public static void Insercion(int[] arr) { 
        System.out.println("Metodo Insercion:");
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Mover los elementos del subarreglo [0..i-1] que son mayores que key
            // a una posición adelante de su posición actual
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
    
    // QuickSort
    public static void QuickSort(int[] arr, int low, int high) { 
        if (low < high) {
            // Encuentra el índice del pivote
            int pi = partition(arr, low, high);

            // Ordena los elementos antes y después del pivote
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, high);
        }
    }

    // Función para particionar el arreglo y devolver el índice del pivote
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Índice del elemento más pequeño

        for (int j = low; j < high; j++) {
            // Si el elemento actual es menor o igual al pivote
            if (arr[j] <= pivot) {
                i++;

                // Intercambia arr[i] y arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Intercambia arr[i+1] y arr[high] (o el pivote)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    
}

