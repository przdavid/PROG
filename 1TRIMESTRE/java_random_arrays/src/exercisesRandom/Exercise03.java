package exercisesRandom;

/**
 * <p><strong>Programa:</strong></br>Exercise03.java</p>
 * <p><strong>Propósito:</strong></br>Realiza un programa que llene la pantalla de caracteres
 * aleatorios (a lo Matrix) con el código ASCII entre el 32 y el 126. Puedes hacer casting con char
 * para convertir un entero en un carácter.</p>
 * @author David Pérez Ruiz
 * @param matrixCharacter Carácter generado al azar.
 */

public class Exercise03 {
  public static void main(String[] args) {
    // Declaración de variables
    char matrixCharacter;
    int i = 0;

    // Generar caracteres
    do {
      matrixCharacter = (char)(32 + Math.random()*93);
      System.out.print(matrixCharacter);
      i++;

      if (i == 70) {
        System.out.println();
        i = 0;
      }
    } while (true);
  }
}
