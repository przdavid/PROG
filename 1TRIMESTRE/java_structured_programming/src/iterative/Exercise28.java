package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise28.java</p>
 * <p><strong>Propósito:</strong></br>Calcula el factorial de un número entero leído por teclado.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param factorial Número entero, factorial del número introducido.
 */

public class Exercise28 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    int factorial = 1;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════╗");
    System.out.println("║ Programa que calcula el factorial de un número. ║");
    System.out.println("╚═════════════════════════════════════════════════╝");

    // Petición del número
    System.out.print("Introduzca un número: ");
    number = s.nextInt();

    // Calcular factorial
    for (int i = 1; i <= number; i++) {
      factorial = factorial*i;
    }

    // Mostrar factorial
    System.out.printf("%d! = %d",number, factorial);
  }
}