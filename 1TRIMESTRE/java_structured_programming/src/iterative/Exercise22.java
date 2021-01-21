package iterative;

/**
 * <p><strong>Programa:</strong></br>Exercise22.java</p>
 * <p><strong>Propósito:</strong></br>Muestra por pantalla todos los números primos entre 2 y 100,
 * ambos incluidos.</p>
 * @author David Pérez Ruiz
 * @param number Número entero, número introducido por el usuario.
 * @param isPrime Booleano, indica si el número es o no primo.
 */

public class Exercise22 {
  public static void main(String[] args) {
    //Declaración de variables
    boolean isPrime = false;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que muestra los números primos entre 2 y 100. ║");
    System.out.println("╚════════════════════════════════════════════════════════╝");

    // Mostrar primer número primo
    System.out.print("2 ");

    // Comprobar el resto de números
    for (int primeNumber = 3; primeNumber <= 100; primeNumber = primeNumber+2) {
      for (int i = 2; i < (int)(Math.round(Math.sqrt(primeNumber))+1); i++) {
        if (primeNumber%i == 0) {
          isPrime = false;
          break;
        } else {
          isPrime = true;
        }
      }
      // Mostrar el número en caso de que sea primo
      if (isPrime) {
        System.out.print(primeNumber + " ");
        isPrime = false;
      }
    }
  }
}
