package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise11.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que muestre en tres columnas, el cuadrado
 * y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 */

public class Exercise11 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    
    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que pide un número y muestra el cuadrado y el cubo del  ║");
    System.out.println("║                  mismo y los cuatro siguientes.                  ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════╝");
    
    // Petición de datos
    System.out.print("Introduzca un número: ");
    number = s.nextInt();
    
    // Mostrar resultado
    System.out.println("Número\t\tCuadrado\tCubo");
    for (int i = number; i < number+5; i++) {
      System.out.printf("  %d\t\t   %d\t\t %d\n", i, i*i, i*i*i);
    }
  }
}
