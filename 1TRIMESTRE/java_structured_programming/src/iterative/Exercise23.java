package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise23.java</p>
 * <p><strong>Propósito:</strong></br>Programa que permita ir introduciendo una serie indeterminada
 * de números mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar
 * el total acumulado, el contador de los números introducidos y la media.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param total Número entero, suma total de números.
 * @param count Número entero, cantidad de números introducidos.
 * @param mean Número real, media de los números introducidos.
 */

public class Exercise23 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    int total = 0;
    int count = 0;
    double mean;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que lee números indefinidamente hasta que la suma total ║");
    System.out.println("║ sea superior a 10000. Al final mostrará el total, la cantidad de ║");
    System.out.println("║          números introducidos y la media de los números.         ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════╝");

    // Petición de números
    while (total < 10000) {
      System.out.print("Introduzca un número: ");
      number = s.nextInt();
      total = total+number;
      count++;
    }

    // Calcular media
    mean = (double)total/(double)count;

    // Mostrar resultado
    System.out.printf("Suma total de los números: %d\n", total);
    System.out.printf("Cantidad de números: %d\n", count);
    System.out.printf("Media de los números: %.2f\n", mean);
  }
}
