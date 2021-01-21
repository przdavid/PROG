package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise67.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que pida un número por teclado y que
 * luego lo "disloque" de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
 * es impar.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param reverseNumber Número entero, número original al revés.
 * @param auxiliaryNumber Número entero, guarda el número para operar con él sin modificar el original.
 * @param twistNumber Número entero, número dislocado.
 */

public class Exercise68 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    long number;
    long reverseNumber = 0;
    long auxiliaryNumber;
    long twistNumber = 0;

    // Informar del programa
    System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    System.out.println("Programa que \"disloca\" un número. Es decír:");
    System.out.println("A los dígitos pares se les suma 1.");
    System.out.println("A los dígitos impares se les resta 1.");
    System.out.println("▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");

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

    // Revertir de nuevo el número y dislocarlo
    while (reverseNumber > 0) {
      // Sumar 1 a los dígitos pares
      if ((reverseNumber%10)%2 == 0) {
        twistNumber = (twistNumber*10) + (reverseNumber%10) + 1;
        reverseNumber = reverseNumber/10;
        // Restar 1 a los dígitos impares
      } else {
        twistNumber = (twistNumber*10) + (reverseNumber%10) - 1;
        reverseNumber = reverseNumber/10;
      }
    }

    // Mostrar resultado
    System.out.printf("Dislocando el %d sale el %d.", number, twistNumber);
  }
}
