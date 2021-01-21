package exercisesUniArrays;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise03.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que lea 10 números por teclado y que
 * luego los muestre en orden inverso, es decir, el primero que se introduce es el último en
 * mostrarse y viceversa.</p>
 * @author David Pérez Ruiz
 * @param num Array de números enteros.
 */

public class Exercise03 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que lee 10 números y después los muestra en orden inverso ║");
    System.out.println("╚════════════════════════════════════════════════════════════════════╝");

    // Petición de datos
    for (int i = 0; i <= 9; i++) {
      System.out.print("Introduzca el elemento " + (i+1) + ": ");
      num[i] = s.nextInt();
    }

    // Mostrar array en orden inverso
    for (int i = 9; i >= 0; i--) {
      System.out.print("| " + num[i] + " ");
    }
    System.out.print("|");
  }
}
