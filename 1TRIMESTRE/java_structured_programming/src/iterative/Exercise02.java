package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise02.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números múltiplos de 5 de 0 a 100 utilizando un
 * bucle <em>while</em>.</p>
 * @author David Pérez Ruiz
 * @param i Número entero, múltiplos de 5.
 */

public class Exercise02 {
  public static void main(String[] args) {
    // Declaración de variables
    int i = 0;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los múltiplos de 5 de 0 a 100. ║");
    System.out.println("╚═════════════════════════════════════════════════════╝");

    // Mostrar resultado
    while (i <= 100) {
      System.out.println(i);
      i = i+5;
    }
  }
}
