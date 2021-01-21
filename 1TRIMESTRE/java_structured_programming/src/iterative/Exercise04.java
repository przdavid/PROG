package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise04.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números del 320 al 160, contando de 20 en 20
 * hacia atrás utilizando un bucle <em>for</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise04 {
  public static void main(String[] args) {
    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los números del 320 al 160, contando ║");
    System.out.println("║                 de 20 en 20 hacia atrás.                  ║");
    System.out.println("╚═══════════════════════════════════════════════════════════╝");

    // Mostrar resultado
    for (int i = 320; i >= 160; i = i-20) {
      System.out.println(i);
    }
  }
}
