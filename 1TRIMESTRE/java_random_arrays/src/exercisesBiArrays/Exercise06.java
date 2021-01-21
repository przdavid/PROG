package exercisesBiArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise05.java</p>
 * <p><strong>Propósito:</strong></br>Realiza un programa que rellene un array de 6 filas por 10
 * columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). No debe
 * repetirse ningún número. A continuación, el programa deberá dar la posición tanto del máximo
 * como del mínimo.</p>
 * @author David Pérez Ruiz
 * @param matrixNumber Array bidimensional de números enteros.
 * @param reserveNumber Array de números enteros, guarda los números generados para no repetirse.
 * @param positionReserve Número entero, posición de <em>reserveNumber</em> donde se guardará el
 * número generado.
 * @param randomNumber Número entero generado al azar.
 * @param isRepeated Booleano, indica si el número generado está repetido.
 * @param maxNumber Número entero, número máximo de <em>matrixNumber</em>.
 * @param minNumber Número entero, número mínimo de <em>matrixNumber</em>.
 * @param maxRow Número entero, fila en la que se encuentra <em>maxNumber</em>.
 * @param maxColumn Número entero, columna en la que se encuentra <em>maxNumber</em>.
 * @param minRow Número entero, fila en la que se encuentra <em>minNumber</em>.
 * @param minColumn Número entero, columna en la que se encuentra <em>minNumber</em>.
 */

public class Exercise06 {
  public static void main(String[] args) {
    // Declaración de variables
    int[][] matrixNumber = new int[6][10];
    int[] reserveNumber = new int[60];
    int positionReserve = 0;
    int randomNumber;
    boolean isRepeated = true;
    int maxNumber = Integer.MIN_VALUE;
    int minNumber = Integer.MAX_VALUE;
    int maxRow = 0;
    int maxColumn = 0;
    int minRow = 0;
    int minColumn = 0;

    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que genera una tabla de 6x10 con números entre 0 y 1000. ║");
    System.out.println("║  A continuación, se indica el número máximo y mínimo de la tabla  ║");
    System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

    // Inicializar array de reserva con todos los valores a -1
    for (int i = 0; i < reserveNumber.length; i++) {
      reserveNumber[i] = -1;
    }

    // Generar tabla
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 9; j++) {

        // Comprobar si el número está en la tabla
        do {
          randomNumber = (int)(Math.random()*1001);

          for (int k = 0; k < reserveNumber.length; k++) {
            if (randomNumber == reserveNumber[k]) {
              isRepeated = true;
              break;
            } else {
              isRepeated = false;
            }
          }
        } while (isRepeated);

        // Añadir el número a la tabla una vez comprobado
        matrixNumber[i][j] = randomNumber;

        //Añadir el número al array de reserva para evitar que se repita
        reserveNumber[positionReserve] = randomNumber;
        positionReserve++;

        // Comprobar si el número introducido es el máximo
        if (matrixNumber[i][j] > maxNumber) {
          maxNumber = matrixNumber[i][j];
          maxRow = i+1;
          maxColumn = j+1;
        }

        // Comprobar si el número introducido es el mínimo
        if (matrixNumber[i][j] < minNumber) {
          minNumber = matrixNumber[i][j];
          minRow = i+1;
          minColumn = j+1;
        }
      }
    }

    // Mostrar tabla
    for (int i = 0; i <=5; i++) {
      for (int j = 0; j <= 9; j++) {
        System.out.print( matrixNumber[i][j] + "\t");
      }
      System.out.println();
    }

    // Indicar el mínimo y el máximo
    System.out.printf("El número mínimo es %d y se encuentra en la fila %d, columna %d\n",
        minNumber, minRow, minColumn);
    System.out.printf("El número máximo es %d y se encuentra en la fila %d, columna %d\n",
        maxNumber, maxRow, maxColumn);
  }
}
