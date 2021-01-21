package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise05.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números del 320 al 160, contando de 20 en 20
 * hacia atrás utilizando un bucle <em>while</em>.</p>
 * @author David Pérez Ruiz
 * @param i Número entero, mostrará los números del 320 al 160 de 20 en 20.
 */

public class Exercise05 {
  public static void main(String[] args) {
    // Declaración de variables
    int i = 320;

    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los números del 320 al 160, contando ║");
    System.out.println("║                 de 20 en 20 hacia atrás.                  ║");
    System.out.println("╚═══════════════════════════════════════════════════════════╝");

    // Mostrar resultado
    while (i >= 160) {
      System.out.println(i);
      i = i-20;
    }
  }
}
