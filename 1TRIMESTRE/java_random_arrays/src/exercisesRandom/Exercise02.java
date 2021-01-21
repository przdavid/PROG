package exercisesRandom;

/**
 * <p><strong>Programa:</strong></br>Exercise02.java</p>
 * <p><strong>Propósito:</strong></br>Programa que va generando números aleatorios pares entre 0 y 100
 * y que no termine de generar números hasta que no saque el 24. El  programa deberá decir al final
 * cuántos números se han generado.</p>
 * @author David Pérez Ruiz
 * @param randomNumber Número entero generado al azar.
 * @param amountNumber Número entero, cantidad total de números generados.
 */

public class Exercise02 {
  public static void main(String[] args) {
    // Declaración de variables
    int randomNumber = 0;
    int amountNumber = 0;

    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que genera números pares aleatorios. Se detiene al ║");
    System.out.println("║   generar el 24 e indica cuántos números se han generado.   ║");
    System.out.println("╚═════════════════════════════════════════════════════════════╝");

    // Generar número aleatorio
    do {
      randomNumber = (int)(Math.random()*101);
      if (randomNumber % 2 == 0) {                // El número generado debe ser par
        System.out.print(randomNumber + " ");     // Mostrar número generado
        amountNumber++;                           // Incrementar contador de números generados
        if (amountNumber % 10 == 0) {
          System.out.println();                   // Añade un salto de línea cada 10 números
        }
      }

    } while (randomNumber != 24);

    // Mostrar el total de números generados
    System.out.printf("\nSe han generado %d números aleatorios", amountNumber);
  }
}
