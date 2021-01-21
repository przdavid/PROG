package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise48.java</p>
 * <p><strong>Propósito:</strong></br>Conversor del sistema decimal al sistema de "palotes".</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param isZero Booleano, indica si el dígito 0 está en el número introducido.
 * @param isOne Booleano, indica si el dígito 1 está en el número introducido.
 * @param isTwo Booleano, indica si el dígito 2 está en el número introducido.
 * @param isThree Booleano, indica si el dígito 3 está en el número introducido.
 * @param isFour Booleano, indica si el dígito 4 está en el número introducido.
 * @param isFive Booleano, indica si el dígito 5 está en el número introducido.
 * @param isSix Booleano, indica si el dígito 6 está en el número introducido.
 * @param isSeven Booleano, indica si el dígito 7 está en el número introducido.
 * @param isEight Booleano, indica si el dígito 8 está en el número introducido.
 * @param isNine Booleano, indica si el dígito 9 está en el número introducido.
 */

public class Exercise48 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    long number;
    boolean isZero = false;
    boolean isOne = false;
    boolean isTwo = false;
    boolean isThree = false;
    boolean isFour = false;
    boolean isFive = false;
    boolean isSix = false;
    boolean isSeven = false;
    boolean isEight = false;
    boolean isNine = false;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que indica los dígitos que aparecen en un número. ║");
    System.out.println("╚════════════════════════════════════════════════════════════╝");

    // Petición del número de escalones
    do {
      System.out.print("Introduzca un número entero positivo: ");
      number = s.nextLong();
    } while (number < 0);

    // Caso en el que el número sea 0
    if (number == 0) {
      isZero = true;
    }

    // Comprobar los dígitos
    while (number > 0) {
      if (number%10 == 0) {
        isZero = true;
      } else if (number%10 == 1) {
        isOne = true;
      } else if (number%10 == 2) {
        isTwo = true;
      } else if (number%10 == 3) {
        isThree = true;
      } else if (number%10 == 4) {
        isFour = true;
      } else if (number%10 == 5) {
        isFive = true;
      } else if (number%10 == 6) {
        isSix = true;
      } else if (number%10 == 7) {
        isSeven = true;
      } else if (number%10 == 8) {
        isEight = true;
      } else {
        isNine = true;
      }
      // Valorar el siguiente dígito dle número
      number = number/10;
    }

    // Mostrar los dígitos que aparecen
    System.out.print("Dígitos que aparecen en el número: ");
    if (isZero) {
      System.out.print("0 ");
    } if (isOne) {
      System.out.print("1 ");
    } if (isTwo) {
      System.out.print("2 ");
    } if (isThree) {
      System.out.print("3 ");
    } if (isFour) {
      System.out.print("4 ");
    } if (isFive) {
      System.out.print("5 ");
    } if (isSix) {
      System.out.print("6 ");
    } if (isSeven) {
      System.out.print("7 ");
    } if (isEight) {
      System.out.print("8 ");
    } if (isNine) {
      System.out.print("9 ");
    }

    // Mostrar los dígitos que no aparecen
    System.out.print("\nDígitos que no aparecen: ");
    if (!isZero) {
      System.out.print("0 ");
    } if (!isOne) {
      System.out.print("1 ");
    } if (!isTwo) {
      System.out.print("2 ");
    } if (!isThree) {
      System.out.print("3 ");
    } if (!isFour) {
      System.out.print("4 ");
    } if (!isFive) {
      System.out.print("5 ");
    } if (!isSix) {
      System.out.print("6 ");
    } if (!isSeven) {
      System.out.print("7 ");
    } if (!isEight) {
      System.out.print("8 ");
    } if (!isNine) {
      System.out.print("9 ");
    }
  }
}
