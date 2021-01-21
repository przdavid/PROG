package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise33.java</p>
 * <p><strong>Propósito:</strong></br>Pinta la letra U por pantalla hecha con asteriscos. El programa
 * pedirá la altura. El programa insertará un espacio y pintará dos asteriscos menos en la base para
 * simular la curvatura de las esquinas inferiores.</p>
 * @author David Pérez Ruiz
 * @param height Número entero, altura de la U a escribir.
 */

public class Exercise33 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int height;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que dibuja una U a partir de un tamaño pedido. ║");
    System.out.println("╚═════════════════════════════════════════════════════════╝");

    // Petición de la altura
    System.out.print("Introduzca la altura deseada: ");
    height = s.nextInt();

    // Si la altura es menor que 2, pedirla de nuevo
    while (height < 2) {
      System.out.println("La altura es demasiado pequeña. Debe ser mayor que 2.");
      System.out.print("Introduzca de nuevo la altura: ");
      height = s.nextInt();
    }

    // Dibujo de la U
    // Si la altura es un número par
    if (height%2 == 0) {
      for (int i = 1; i < height; i++) {
        // Dibujo de la altura
        System.out.println("*" + " ".repeat(height+1) + "*");
      }
      // Dibujo de la base
      System.out.print("  " + "* ".repeat(height/2) + " ");
      // Si la altura es un número impar
    } else {
      for (int i = 1; i < height; i++) {
        // Dibujo de la altura
        System.out.println("*" + " ".repeat(height+2) + "*");
      }
      // Dibujo de la base
      System.out.print("  " + "* ".repeat((height/2) + 1) + " ");
    }
  }
}
