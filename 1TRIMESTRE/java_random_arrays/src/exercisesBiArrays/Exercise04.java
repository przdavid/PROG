package exercisesBiArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise04.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que genere 20 números enteros aleatorios.
 * Estos números se deben introducir en un array de 4 filas por 5 columnas. El programa mostrará
 * las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma
 * total debe aparecer en la esquina inferior derecha. Las sumas parciales y la suma total aparecerán
 * en la pantalla con un pequeño retardo, dando la impresión de que el ordenador se queda "pensando"
 * antes de mostrar los números.</p>
 * @author David Pérez Ruiz
 * @param matrixNumber Array bidimensinal de números enteros.
 * @param summationRow Array de números enteros, contiene el sumatorio de las filas.
 * @param summationColumn Array de números enteros, contiene el sumatorio de las columnas.
 * @param summationTotal Número entero, sumatorio total de toda la tabla.
 */

public class Exercise04 {
  public static void main(String[] args)
      throws InterruptedException { // Se añade esta línea para poder usar sleep
    // Declaración de variables
    int[][] matrixNumber = new int[4][5];
    int[] summationRow = new int[4];
    int[] summationColumn = new int[5];
    int summationTotal = 0;

    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que genera 20 números a introducir en una tabla de 4x5 y ║");
    System.out.println("║                   calcular todos los sumatorios.                  ║");
    System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

    // Generar matriz de números
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        matrixNumber[i][j] = (int)(100 + Math.random() * 899);

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
        Thread.sleep(70);
        System.out.print(matrixNumber[i][j] + "\t");
      }
      // Mostrar sumas parciales de las filas
      Thread.sleep(700);
      System.out.println(summationRow[i]);
    }

    // Mostrar sumas parciales de las columnas
    for (int i = 0; i < 5; i++) {
      Thread.sleep(700);
      System.out.print(summationColumn[i] + "\t");
    }

    // Mostrar suma total
    Thread.sleep(700);
    System.out.print(summationTotal);
  }
}
