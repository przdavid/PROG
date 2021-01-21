package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise10.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que calcule la media de un conjunto de
 * números positivos introducidos por teclado. A priori, el programa no sabe cuántos números se
 * introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta un número
 * negativo.</p>
 * @author David Pérez Ruiz
 * @param number Número real, número introducido por el usuario.
 * @param total Número real, suma total de los números introducidos.
 * @param count Número real, conteo de números introducidos.
 * @param mean Número real, media de los números introducidos.
 */

public class Exercise10 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    double number;
    double total = 0;
    double count = 0;
    double mean = 0;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra la media de un conjuto de números. Se pedirán  ║");
    System.out.println("║ números indefinidamente hasta que se introduzca un número negativo. ║");
    System.out.println("╚═════════════════════════════════════════════════════════════════════╝");

    // Petición de números
    while (true) {
      System.out.print("Introduzca un número: ");
      number = s.nextInt();

      // Si el número introducido es negativo se rompe el ciclo
      if (number < 0) {
        break;
      } else {
        total = total+number;
        count++;
      }
    }

    // Calcuar media
    mean = total/count;

    // Mostrar resultado
    System.out.printf("La media de los números introducidos es: %.2f", mean);
  }
}
