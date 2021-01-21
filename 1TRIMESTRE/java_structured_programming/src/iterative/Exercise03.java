package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise03.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números múltiplos de 5 de 0 a 100 utilizando un
 * bucle <em>do-while</em>.</p>
 * @author David Pérez Ruiz
 * @param i Número entero, múltiplos de 5.
 */

public class Exercise03 {
  public static void main(String[] args) {
    // Declaración de variables
    int i = 0;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los múltiplos de 5 de 0 a 100. ║");
    System.out.println("╚═════════════════════════════════════════════════════╝");

    // Mostrar resultado
    do {
      System.out.println(i);
      i = i+5;
    } while (i <= 100);
  }
}
