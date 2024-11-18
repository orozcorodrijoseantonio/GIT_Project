import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear tabla y llenarla con valores aleatorios
        int[] table = new int[10];
        Random random = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = random.nextInt(100); // Valores entre 0 y 99
        }

        // Imprimir los valores de la tabla
        System.out.println("Table elements:");
        for (int value : table) {
            System.out.println(value);
        }


    }
}