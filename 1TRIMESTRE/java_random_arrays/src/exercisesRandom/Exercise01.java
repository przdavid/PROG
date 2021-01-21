package exercisesRandom;

/**
 * <p><strong>Programa:</strong></br>Exercise01.java</p>
 * <p><strong>Propósito:</strong></br>Escribe un programa que muestre tres apuestas de la quiniela
 * en tres columnas para los 14 partidos y el pleno al quince (15 filas) de forma que la probabilidad
 * de que salga un 1 sea  de 1/2, la probabilidad de que salga X sea de 1/3 y la probabilidad de
 * que salga 2 sea de 1/6.</p>
 * @author David Pérez Ruiz
 * @param randomNumber Número entero generado al azar.
 */

public class Exercise01 {
  public static void main(String[] args) {
    // Declaración de variables
    int randomNumber;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra 3 apuestas de una quiniela junto al ║");
    System.out.println("║                       pleno al 15.                       ║");
    System.out.println("╚══════════════════════════════════════════════════════════╝");

    // Apuestas para los 14 partidos
    for (int i = 1; i <= 14; i++) {
      System.out.printf("Apuestas de partido %d:\t", i);

      // Generar 3 apuestas para cada partido
      for (int j = 1; j <= 3; j++) {
        randomNumber = (int)(Math.random()*6);
        if (randomNumber >= 0 && randomNumber <= 2) {
          System.out.print("1\t");
        } else if (randomNumber == 3 || randomNumber == 4) {
          System.out.print("X\t");
        } else {
          System.out.print("2\t");
        }
      }
      System.out.println();
    }

    // Generar apuesta para el pleno al 15
    System.out.print("Apuesta de partido 15:\t");
    randomNumber = (int)(Math.random()*6);
    if (randomNumber >= 0 && randomNumber <= 2) {
      System.out.print("1");
    } else if (randomNumber == 3 || randomNumber == 4) {
      System.out.print("x");
    } else {
      System.out.print("2");
    }
  }
}
