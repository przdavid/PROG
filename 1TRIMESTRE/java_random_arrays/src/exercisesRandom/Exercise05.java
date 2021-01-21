package exercisesRandom;
import java.util.Arrays;

/**
 * <p><strong>Programa:</strong></br>Exercise05.java</p>
 * <p><strong>Propósito:</strong></br>Muestra 50 números enteros aleatorios entre 100 y 199 (ambos
 * incluidos) separados por espacios. Muestra también el máximo, el mínimo, la moda, la media, la
 * mediana y la desviación típica de esos números.</p>
 * @author David Pérez Ruiz
 * @param arrayNumber Array de números enteros.
 * @param maxNumber Número entero, número máximo del array.
 * @param minNumber Número entero, número mínimo del array.
 * @param mode Número entero, moda del array.
 * @param count Número entero, contador para hallar la moda de un número.
 * @param maxCount Número entero, contador que indica la moda de un número.
 * @param mean Número real, media del array.
 * @param median Número real, mediana del array.
 * @param standardDeviation Número real, desviación típica del array.
 */

public class Exercise05 {
  public static void main(String[] args) {
    // Declaración de variables
    int[] arrayNumber = new int[50];
    int maxNumber = Integer.MIN_VALUE;
    int minNumber = Integer.MAX_VALUE;
    int mode = 0;
    int count;
    int maxCount = 0;
    double mean = 0;
    double median;
    double standardDeviation = 0;
    
    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════════╗");
    System.out.println("║  Programa que genera 50 números aleatorios entre 100 y 199 y los   ║");
    System.out.println("║ muestra junto al máximo, mínimo, moda, media, mediana y desviación ║");
    System.out.println("║                               típica                               ║");
    System.out.println("╚════════════════════════════════════════════════════════════════════╝");
    
    // Generación del array
    for (int i = 0; i < arrayNumber.length; i++) {
      arrayNumber[i] = (int)(100 + Math.random()*99);
      
      // Comprobar si el número introducido es el máximo
      if (arrayNumber[i] > maxNumber) {
        maxNumber = arrayNumber[i];
      }
      
      // Comprobar si el número introducido es el mínimo
      if (arrayNumber[i] < minNumber) {
        minNumber = arrayNumber[i];
      }
      
      System.out.print(arrayNumber[i] + " ");
    }
    
    System.out.println();
    
    // Hallar la moda del array
    Arrays.sort(arrayNumber);  // Ordenar array
    for (int i = 0; i < arrayNumber.length; ++i) {
      count = 0;
      // Contar el número de veces que aparece un número
      for (int j = 0; j < arrayNumber.length; ++j) {
        if (arrayNumber[j] == arrayNumber[i]) {
          count++;
        }
      }
      // Obtener el dato que más se repite
      if (count > maxCount) {
        maxCount = count;
        mode = arrayNumber[i];
      }
    }
    
    // Calcular la media del array
    for (int i = 0; i < arrayNumber.length; i++) {
      mean += (double)arrayNumber[i];
    }
    
    mean /= 50.0;
    
    // Hallar la mediana del array
    median = (double)(arrayNumber[25] + arrayNumber[26])/2;
    
    // Calcular la desviación típica del array
    for (int i = 0; i <arrayNumber.length; i++) {
      // Cálculo de la varianza
      standardDeviation = standardDeviation + (Math.pow((double)arrayNumber[i] - mean, 2));
    }
    
    standardDeviation = Math.sqrt(standardDeviation);
    
    //Mostrar resultados
    System.out.printf("Número máximo: %d\n", maxNumber);
    System.out.printf("Número mínimo: %d\n", minNumber);
    System.out.printf("Moda: %d\n", mode);
    System.out.printf("Media: %.2f\n", mean);
    System.out.printf("Mediana: %.2f\n", median);
    System.out.printf("Desviación típica: %.2f\n", standardDeviation);
  }
}
