package exercisesBiArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise13.java</p>
 * <p><strong>Propósito:</strong></br>Realiza un programa que calcule la estatura media, mínima y
 * máxima en centímetros de personas de diferentes países. El array que contiene los nombres de los
 * paises es el iguiente: country = {"España", "Rusia", "Japón", "Australia"}. Los datos sobre las
 * estaturas se deben simular mediante un array de 4 filas por 10 columnas con números aleatorios
 * generados al azar entre 140 y 210. Los decimales de la media se pueden despreciar. Los nombres
 * de los países se deben mostrar utilizando el array de países.</p>
 * @author David Pérez Ruiz
 * @param country Array que guarda los nombres de los países.
 * @param height Array de números enteros, contiene las diferentes estaturas.
 * @param meanHeight Array de números enteros, guarda la media de las estaturas.
 * @param maxHeight Array de números enteros, guarda la estatura máxima de cada país.
 * @param minHeight Array de números enteros, guarda la estatura mínima de cada país.
 */

public class Exercise13 {
  public static void main(String[] args) {
    // Declaración de variables
    String[] country = {"España", "Rusia", "Japón", "Australia"};
    int[][] height = new int[4][10];
    int[] meanHeight = {0, 0, 0, 0};
    int[] maxHeight = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
    int[] minHeight = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que calcula la estatura media, el máximo y el mínimo de ║");
    System.out.println("║                 España, Rusia, Japón y Australia.                ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════╝");

    // Rellenar matriz con estaturas
    for (int i = 0; i <= 3; i++) {
      for (int j = 0; j <= 9; j++) {
        // Insertar estatura generada al azar
        height[i][j] = (int)(140 + Math.random()*70);

        // Realizar sumatorio de estaturas de cada país
        meanHeight[i] = meanHeight[i] + height[i][j];

        // Hallar la estatura máxima de cada país
        if (height[i][j] > maxHeight[i]) {
          maxHeight[i] = height[i][j];
        }

        // Hallar la estatura mínima de cada país
        if (height[i][j] < minHeight[i]) {
          minHeight[i] = height[i][j];
        }
      }
      // Calcular media de cada país
      meanHeight[i] = meanHeight[i]/10;
    }

    // Mostrar resultado
    System.out.printf("%62s\n", "MED MIN MAX");
    for (int i = 0; i <= 3; i++) {
      System.out.printf("%9s: ", country[i]);
      for (int j = 0; j <= 9; j++) {
        System.out.print(height[i][j] + " ");
      }
      System.out.println(meanHeight[i] + " " + minHeight[i] +  " " + maxHeight[i]);
    }
  }  
}
