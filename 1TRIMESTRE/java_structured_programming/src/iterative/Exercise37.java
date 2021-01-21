package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise37.java</p>
 * <p><strong>Propósito:</strong></br>Conversor del sistema decimal al sistema de "palotes".</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param reverseNumber Número entero, número original al revés.
 * @param auxiliaryNumber Número entero, guarda el número para operar con él sin modificar el original.
 */

public class Exercise37 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    int reverseNumber = 0;
    int auxiliaryNumber;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que transforma un número a sistema de palotes. ║");
    System.out.println("╚═════════════════════════════════════════════════════════╝");

    // Petición del número
    do {
      System.out.print("Por favor, introduzca un número entero positivo: ");
      number = s.nextInt();
    } while (number < 0);

    // Guardar número en variable auxiliar
    auxiliaryNumber = number;

    // Obtener reverso del número
    while (auxiliaryNumber > 0) {
      reverseNumber = (reverseNumber*10) + (auxiliaryNumber%10);
      auxiliaryNumber = auxiliaryNumber/10;
    }

    // Obtener número en sistema de palotes y mostrar resultado
    System.out.printf("El decimal de %d es el ", number);
    while (reverseNumber > 10) {
      System.out.print("| ".repeat(reverseNumber%10) + "- ");
      reverseNumber = reverseNumber/10;
    }
    // Para el último número, omitir el guion al final
    System.out.print("| ".repeat(reverseNumber%10) + " en el sistema de palotes.");
  }
}
