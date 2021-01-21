package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise06.java</p>
 * <p><strong>Propósito:</strong></br>Muestra los números del 320 al 160, contando de 20 en 20
 * hacia atrás utilizando un bucle <em>do-while</em>.</p>
 * @author David Pérez Ruiz
 * @param i Número entero, mostrará los números del 320 al 160 de 20 en 20.
 */

public class Exercise06 {
  public static void main(String[] args) {
    // Declaración de variables
    int i = 320;

    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los números del 320 al 160, contando ║");
    System.out.println("║                 de 20 en 20 hacia atrás.                  ║");
    System.out.println("╚═══════════════════════════════════════════════════════════╝");

    // Mostrar resultado
    do {
      System.out.println(i);
      i = i-20;
    } while (i >= 160);
  }
}
