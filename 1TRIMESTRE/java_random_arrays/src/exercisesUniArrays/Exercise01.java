package exercisesUniArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise01.java</p>
 * <p><strong>Propósito:</strong></br>Define un array de 12 números enteros con nombre num y asigna
 * los valores según la tabla. Muestra el contenido de todos los elementos del array. ¿Qué sucede
 * con los valores de los elementos que no han sido inicializados?</p>
 * @author David Pérez Ruiz
 * @param num Array de números enteros.
 */

public class Exercise01 {
  public static void main(String[] args) {
    // Declaración de variables
    int[] num = new int[12];

    // Asignar valores
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Define un array de 12 enteros y asigna los siguientes valores: ║");
    System.out.println("║ num[0] = 39               num[4] = 0              num[8] = 5   ║");
    System.out.println("║ num[1] = -2               num[6] = 14             num[9] = 120 ║");
    System.out.println("║   Muéstralo. ¿Qué ocurre con los elementos no inicializados?   ║");
    System.out.println("╚════════════════════════════════════════════════════════════════╝");

    // Mostrar vector
    for (int n : num) {
      System.out.print("| " + n + " ");
    }

    // Observacioens
    System.out.print("\nLos elementos no inicializados valen 0.");
  }
}
