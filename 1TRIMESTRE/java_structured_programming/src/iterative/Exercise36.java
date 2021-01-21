package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise36.java</p>
 * <p><strong>Propósito:</strong></br>Indica si un número introducido por teclado es o no capicúa.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param reverseNumber Número entero, número original al revés.
 * @param auxiliaryNumber Número entero, guarda el número para operar con él sin modificar el original.
 */

public class Exercise36 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    long number;
    long reverseNumber = 0;
    long auxiliaryNumber;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════╗");
    System.out.println("║ Programa que indica si un número es capicúa. ║");
    System.out.println("╚══════════════════════════════════════════════╝");

    // Petición del número
    do {
      System.out.print("Por favor, introduzca un número entero positivo: ");
      number = s.nextLong();
    } while (number < 0);

    // Guardar número en variable auxiliar
    auxiliaryNumber = number;

    // Obtener reverso del número
    while (auxiliaryNumber > 0) {
      reverseNumber = (reverseNumber*10) + (auxiliaryNumber%10);
      auxiliaryNumber = auxiliaryNumber/10;
    }

    // Comprobar si el número es capicúa y mostrar resultado
    if (number == reverseNumber) {
      System.out.printf("El %d es capicúa", number);
    } else {
      System.out.printf("El %d no es capicúa", number);
    }
  }
}
