package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise16.java</p>
 * <p><strong>Propósito:</strong></br>Indica si un número introducido por teclado es o no primo.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param isPrime Booleano, indica si el número es o no primo.
 */

public class Exercise16 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    boolean isPrime = false;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════╗");
    System.out.println("║ Programa que indica si un número es primo. ║");
    System.out.println("╚════════════════════════════════════════════╝");

    // Petición del número
    do {
      System.out.print("Introduzca un número entero positivo: ");
      number = s.nextInt();
    } while (number < 0);

    // Valorar número
    switch (number) {
      case 0:
      case 1:
        break;
      case 2:
      case 3:
        isPrime = true;
        break;
      default:
        for (int i = 2; i <= (int)(Math.round(Math.sqrt(number))+1); i++) {
          if (number%i == 0) {
            isPrime = false;
            break;
          } else {
            isPrime = true;
          }
        }
    }

    // Mostrar resultado en los casos distintos de 0, 1 y 2
    if (isPrime) {
      System.out.println("El número es primo.");
    } else {
      System.out.println("El número no es primo.");
    }
  }
}
