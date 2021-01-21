package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise12.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los n primeros términos de la serie de Fibonacci.</p>
 * @author David Pérez Ruiz
 * @param n Número entero, cantidad de números de la serie pedidos por el usuario.
 * @param firstNumber Número entero, primer número de la serie de Fibonacci, el 0.
 * @param previousNumber Número entero, indica el número previo para realizar las sucesivas sumas
 * de la serie de Fibonacci. Comienza siendo el 1.
 * @param auxiliary Número entero, auxiliar necesario para las sucesivas sumas de la serie.
 */

public class Exercise12 {
  public static void main(String[]  args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    long n;
    long firstNumber = 0;
    long previousNumber = 1;
    long auxiliary;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los N primeros números de la serie de Fibonacci ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════════╝");

    // Petición de la cantidad de números
    System.out.print("Introduzca la cantidad de números de la serie que se quieran mostrar: ");
    n = s.nextInt();

    // Mostrar números de la serie
    if (n == 0) {
    } else if (n == 1) {
      System.out.print(firstNumber);
    } else if (n == 2) {
      System.out.print(firstNumber + " " + previousNumber);
    } else {
      System.out.print(firstNumber + " " + previousNumber + " ");
      n = n-2;
      while (n > 0) {
        auxiliary = firstNumber;
        firstNumber = previousNumber;
        previousNumber = auxiliary + previousNumber;
        System.out.print(previousNumber + " ");
        n--;
      }
    }
  }
}
