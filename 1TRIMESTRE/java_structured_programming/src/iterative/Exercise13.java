package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise13.java</p>
 * <p><strong>Propósito:</strong></br>Lee una lista de diez números y determine cuántos son
 * positivos, y cuántos son negativos.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param amountPositives Número entero, cantidad de números positivos.
 * @param amountNegatives Número entero, cantidad de números negativos.
 */

public class Exercise13 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    int amountPositives = 0;
    int amountNegatives = 0;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que lee 10 números e indica cuántos son positivos ║");
    System.out.println("║                  y cúantos son negativos.                  ║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");

    // Petición de números
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduzca un número: ");
      number = s.nextInt();

      // Conteo de positivos y negativos
      if (number > 0) {
        amountPositives++;
      } else if (number < 0) {
        amountNegatives++;
      }
    }

    // Mostrar resultado
    System.out.printf("\nSe ha introducido %d números positivos y %d números negativos",
        amountPositives, amountNegatives);
  }
}
