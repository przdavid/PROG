package exercisesUniArrays;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise05.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que pida 10 números por teclado y que
 * luego muestre los números introducidos junto con las palabras "máximo" y "mínimo" al lado del
 * máximo y del mínimo respectivamente.</p>
 * @author David Pérez Ruiz
 * @param arrayNumber Array de números enteros.
 * @param maxNumber Número entero, número máximo del array.
 * @param minNumber Número entero, número mínimo del array.
 */

public class Exercise05 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int[] arrayNumber = new int[10];
    int maxNumber = Integer.MIN_VALUE;
    int minNumber = Integer.MAX_VALUE;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que lee 10 números y los muestra, indicando cuáles son el ║");
    System.out.println("║                         máximo y el mínimo.                        ║");
    System.out.println("╚════════════════════════════════════════════════════════════════════╝");

    // Petición de datos
    for (int i = 0; i <= 9; i++) {
      System.out.print("Introduzca el número " + (i+1) + ": ");
      arrayNumber[i] = s.nextInt();

      // Comprobar si el número introducido es el máximo
      if (arrayNumber[i] > maxNumber) {
        maxNumber = arrayNumber[i];
      }

      // Comprobar si el número introducido es el mínimo
      if (arrayNumber[i] < minNumber) {
        minNumber = arrayNumber[i];
      }
    }

    // Mostrar resultado
    System.out.println("\nNúmeros introducidos:");
    for (int i = 0; i <= 9; i++) {
      System.out.print(arrayNumber[i]);

      // Indicar si el número mostrado es el máximo
      if (arrayNumber[i] == maxNumber) {
        System.out.println("\tMÁXIMO");
      }

      // Indicar si el número mostrado es el mínimoS
      if (arrayNumber[i] == minNumber) {
        System.out.println("\tMÍNIMO");
      }

      // Introducir salto de línea a los números que no sean máximo ni mínimo
      if (arrayNumber[i] != maxNumber && arrayNumber[i] != minNumber) {
        System.out.println();
      }
    }
  }
}
