package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise31.java</p>
 * <p><strong>Propósito:</strong></br>Pinta la letra L por pantalla hecha con asteriscos. El programa
 * pedirá la altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera
 * entre 2) de la altura más uno.</p>
 * @author David Pérez Ruiz
 * @param height Número entero, altura de la L a escribir.
 */

public class Exercise31 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int height;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que dibuja una L a partir de un tamaño pedido. ║");
    System.out.println("╚═════════════════════════════════════════════════════════╝");

    // Petición de la altura
    System.out.print("Introduzca la altura deseada: ");
    height = s.nextInt();

    // Dibujo de la altura de la L
    for (int i = 1; i < height; i++) {
      System.out.println("*");
    }

    // Dibujo del palo horizontal
    System.out.print("* ".repeat((height/2) + 1));
  }
}
