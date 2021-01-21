package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise09.java</p>
 * <p><strong>Propósito:</strong></br>Indica cúantos dígitos tiene un número introducido.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número cuya tabla de multiplicar se mostrará.
 * @param numberDigits Número entero, número de dígitos que tiene el número introducido.
 */

public class Exercise09 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    int numberDigits = 0;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que indica la cantidad de dígitos de un número. ║");
    System.out.println("╚══════════════════════════════════════════════════════════╝");

    // Petición del número
    System.out.print("Introduzca un número: ");
    number = s.nextInt();

    // Conteo de dígitos
    if (number == 0) {
      System.out.print("El número tiene 1 dígito.");
    } else {
      while (number > 0) {
        number = number/10;
        numberDigits++;
      }

      // Mostrar número de dígitos
      System.out.printf("El número tiene %d dígitos.", numberDigits);
    }
  }
}
