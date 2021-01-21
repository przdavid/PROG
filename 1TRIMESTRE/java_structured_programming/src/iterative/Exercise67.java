package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise67.java</p>
 * <p><strong>Propósito:</strong></br>Pinta una escalera que va descendiendo de izquierda a derecha.
 * El programa pedirá el número de escalones y la altura de cada escalón. La anchura de los escalones
 * siempre es la misma: 4 asteriscos.</p>
 * @author David Pérez Ruiz
 * @param numberSteps Número entero, número de escalones.
 * @param heightSteps Número entero, altura de los escalones.
 */

public class Exercise67 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int numberSteps;
    int heightStep;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que dibuja una escalera descendente de izquierda a derecha ║");
    System.out.println("║     a partir de la altura de la escalera y la de sus escalones.     ║");
    System.out.println("╚═════════════════════════════════════════════════════════════════════╝");

    // Petición del número de escalones
    do {
      System.out.print("Introduzca el número de escalones: ");
      numberSteps = s.nextInt();
    } while (numberSteps < 1);

    // Petición de la altura de los escalones
    do {
      System.out.print("Introduzca la altura de cada escalón: ");
      heightStep = s.nextInt();
    } while (heightStep < 1);

    // Mostrar escalera
    for (int i = 1; i <= numberSteps; i++) {
      for (int j = 1; j <= heightStep; j++) {
        System.out.println("*".repeat(4*i));
      }
    }
  }
}
