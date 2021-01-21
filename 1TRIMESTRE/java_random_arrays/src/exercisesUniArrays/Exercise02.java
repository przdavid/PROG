package exercisesUniArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise01.java</p>
 * <p><strong>Propósito:</strong></br>Define un array de 10 caracteres con nombre simbolo y asigna
 * valores a los elementos  según la tabla que se muestra a continuación. Muestra el contenido de
 * todos los elementos del array. ¿Qué sucede con los valores de los elementos que no han sido
 * inicializados?</p>
 * @author David Pérez Ruiz
 * @param simbolo Array de caracteres.
 */

public class Exercise02 {
  public static void main(String[] args) {
    // Declaración de variables
    char[] simbolo = new char[10];

    // Asignar valores
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    // Informar del programa
    System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Define un array de 10 caracteres y asigna los siguientes valores: ║");
    System.out.println("║ num[0] = 'a'              num[4] = '@'             num[7] = '+'   ║");
    System.out.println("║ num[1] = 'x'              num[6] = ' '             num[8] = 'Q'   ║");
    System.out.println("║     Muéstralo. ¿Qué ocurre con los elementos no inicializados?    ║");
    System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

    // Mostrar vector
    for (char s : simbolo) {
      System.out.print("| " + s + " ");
    }

    // Observacioens
    System.out.print("\nLos elementos no inicializados valen ' '.");
  }
}
