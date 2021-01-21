package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise08.java</p>
 * <p><strong>Propósito:</strong></br>Muestra la tabla de multiplicar de un número introducido.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número cuya tabla de multiplicar se mostrará.
 */

public class Exercise08 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra la tabla de multiplicar de un número. ║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");

    // Petición del número de la tabla de multiplicar
    System.out.print("Indique el número de la tabla de multiplicar: ");
    number = s.nextInt();

    // Mostrar resultado
    for (int i = 0; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", number, i, number*i);
    }
  }
}
