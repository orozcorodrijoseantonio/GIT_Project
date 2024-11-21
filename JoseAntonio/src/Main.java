
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Crear tabla y llenarla con valores aleatorios
        int[] table = new int[10];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100) + 1; // Valores entre 0 y 99
        }

        // Imprimir los valores de la tabla
        System.out.println("Table elements:");
        for (int value : table) {
            System.out.println(value);
        }
        /*
        Arrays.sort(table);

        System.out.println("Sorted table: ");
        System.out.println(Arrays.toString(table));

        System.out.println("This is more code for the point ");
         */
        System.out.println("Original array: " + Arrays.toString(table));

        insertionSort(table);

        System.out.println("Sorted array (Insertion Sort): " + Arrays.toString(table));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

}
