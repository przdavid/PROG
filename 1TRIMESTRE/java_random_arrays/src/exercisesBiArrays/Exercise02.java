package exercisesBiArrays;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise02.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que pida 20 números enteros. Estos números
 * se deben introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas
 * parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe
 * aparecer en la esquina inferior derecha.</p>
 * @author David Pérez Ruiz
 * @param matrixNumber Array bidimensinal de números enteros.
 * @param summationRow Array de números enteros, contiene el sumatorio de las filas.
 * @param summationColumn Array de números enteros, contiene el sumatorio de las columnas.
 * @param summationTotal Número entero, sumatorio total de toda la tabla.
 */

public class Exercise02 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int[][] matrixNumber = new int[4][5];
    int[] summationRow = new int[4];
    int[] summationColumn = new int[5];
    int summationTotal = 0;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que pide 20 números a introducir en una tabla de 4x5 y ║");
    System.out.println("║                  calcular todos los sumatorios.                 ║");
    System.out.println("╚═════════════════════════════════════════════════════════════════╝");

    // Petición de datos
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print("Introduzca un número: ");
        matrixNumber[i][j] = s.nextInt();

        // Calcular sumatorio parcial de las columnas
        summationColumn[j] += matrixNumber[i][j];

        // Calcular sumatorio parcial de las filas
        summationRow[i] += matrixNumber[i][j];
      }
    }

    // Calcular suma total
    // Sumar filas
    for (int i = 0; i < 4; i++) {
      summationTotal += summationRow[i];
    }

    // Sumar columnas
    for (int i = 0; i < 5; i++) {
      summationTotal += summationColumn[i];
    }

    // Mostrar resultado
    for (int i = 0; i < 4; i ++) {
      for (int j = 0; j < 5; j++) {
        // Mostrar celdas
        System.out.print(matrixNumber[i][j] + "\t");
      }
      // Mostrar sumas parciales de las filas
      System.out.println(summationRow[i]);
    }

    // Mostrar sumas parciales de las columnas
    for (int i = 0; i < 5; i++) {
      System.out.print(summationColumn[i] + "\t");
    }

    // Mostrar suma total
    System.out.print(summationTotal);
  }
}
