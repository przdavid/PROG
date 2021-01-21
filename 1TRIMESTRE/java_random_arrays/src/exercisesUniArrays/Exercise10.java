package exercisesUniArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise10.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que genere 20 números enteros aleatorios
 * entre 0 y 100 y que los almacene en un array. El programa debe ser capaz de pasar todos los
 * números pares a las primeras posiciones del array (del 0 en adelante) y todos los números impares
 * a las celdas restantes. Utiliza arrays auxiliares si es necesario.</p>
 * @author David Pérez Ruiz
 * @param arrayNumber Array de números enteros.
 * @param arrayFinal Array de números enteros, parte de arrayNumber: con los números pares al
 * principio y los impares al final.
 */

public class Exercise10 {
  public static void main(String[] args) {
    // Declaración de variables
    int[] arrayNumber = new int[20];
    int[] arrayFinal = new int[20];

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que genera un array de 20 números aleatorios. Los números ║");
    System.out.println("║    pares ocuparán las primeras celdas y los impares las últimas.   ║");
    System.out.println("╚════════════════════════════════════════════════════════════════════╝");

    // Generación del array
    for (int i = 0; i < arrayNumber.length; i++) {
      arrayNumber[i] = (int)(Math.random()*101);
    }

    // Almacenar numeros pares en las primeras posiciones
    int j = 0;
    for (int i = 0; i < arrayFinal.length; i++) {
      if (arrayNumber[i]%2 == 0) {
        arrayFinal[j] = arrayNumber[i];
        j++;
      }
    }

    // Almacenar numeros pares en las primeras posiciones
    for (int i = 0; i < arrayFinal.length; i++) {
      if (arrayNumber[i]%2 != 0) {
        arrayFinal[j] = arrayNumber[i];
        j++;
      }
    }

    // Mostrar resultado
    for (int i = 0; i < arrayFinal.length; i++) {
      System.out.print(arrayFinal[i] + " ");
    }
  }
}
