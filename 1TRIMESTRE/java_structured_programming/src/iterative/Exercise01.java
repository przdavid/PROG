package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise01.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números múltiplos de 5 de 0 a 100 utilizando un
 * bucle <em>for</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise01 {
  public static void main(String[] args) {
    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los múltiplos de 5 de 0 a 100. ║");
    System.out.println("╚═════════════════════════════════════════════════════╝");

    // Mostrar resultado
    for (int i = 0; i <= 100; i = i+5) {
      System.out.println(i);
    }
  }
}
