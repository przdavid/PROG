package exercises20to28;
import exercises20to28.ArraysFunctions;
import java.util.Scanner;

/**
 * <p>Menú para operar las funciones de <em>ArrayFunctions</em>.</p>
 * @author David Pérez Ruiz
 */

public class MenuExercise20to28 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number1;
    int number2;
    int number3;
    int option;
    boolean continueMenu = true;
    String green = "\033[92m";
    String red = "\033[91m";
    String reset="\u001B[0m";
    
    // Inicializar programa
    System.out.println("╔═════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa para operar con arrays. Inicializando array de números ║");
    System.out.println("║ enteros aleatorios...                                           ║");
    System.out.println("╚═════════════════════════════════════════════════════════════════╝");
    
    System.out.print("Indique el tamaño del array: ");
    number1 = s.nextInt();
    System.out.print("Establezca el intervalo mínimo del array: ");
    number2 = s.nextInt();
    System.out.print("Establezca el intervalo máximo del array: ");
    number3 = s.nextInt();
    
    int array[] = ArraysFunctions.generateArrayInt(number1, number2, number3);
    
    clear();
    
    // Generar menú
    do {
      option = menu();
      
      // Limpiar la pantalla y mostrar la opción seleccionada
      showOption(option);
      
      // Ejecutar la opción seleccionada
      switch (option) {
        case 1:                                                  // minimumArrayInt
          System.out.printf("El valor mínimo del array es " + green + "%d" + reset + ".\n",
                            ArraysFunctions.minimumArrayInt(array));
          break;
        case 2:                                                  // maximumArrayInt
          System.out.printf("El valor máximo del array es " + green + "%d" + reset + ".\n",
                            ArraysFunctions.maximumArrayInt(array));
          break;
        case 3:                                                  // meanArrayInt
          System.out.printf("La media de valores del array es " + green + "%.2f" + reset + ".\n",
                            ArraysFunctions.meanArrayInt(array));
          break;
        case 4:                                                  // isInArrayInt
          System.out.print("Introduzca el número a buscar: ");
          number1 = s.nextInt();
          
          if (ArraysFunctions.isInArrayInt(array, number1)) {
            System.out.printf(green + "%d está en el array.\n" + reset, number1);
          } else {
            System.out.printf(red + "%d no está en el array.\n" + reset, number1);
          }
          break;
        case 5:                                                  // firstOccurrenceArrayInt
          System.out.print("Introduzca el número a buscar: ");
          number1 = s.nextInt();
          
          if (ArraysFunctions.firstOccurrenceArrayInt(array, number1) != -1) {
            System.out.printf("La primera ocurrencia de %d está en la posición " + green + "%d." +
                              reset + ".\n", number1, ArraysFunctions.firstOccurrenceArrayInt(array,
                              number1));
          } else {
            System.out.printf(red + "%d no está en el array.\n" + reset, number1);
          }
          break;
        case 6:                                                  // reverseArrayInt
          System.out.println("El array dado la vuelta es:");
          ArraysFunctions.showArrayInt(ArraysFunctions.reverseArrayInt(array));
          break;
        case 7:                                                  // rotateNRightArrayInt
          System.out.print("Indique cuántas posiciones a la derecha quiere rotar el array: ");
          number1 = s.nextInt();
          System.out.printf("El array rotado %d veces a la derecha es:\n", number1);
          ArraysFunctions.showArrayInt(ArraysFunctions.rotateNRightArrayInt(array, number1));
          break;
        case 8:                                                  // rotateNLeftArrayInt
          System.out.print("Indique cuántas posiciones a la izquierda quiere rotar el array: ");
          number1 = s.nextInt();
          System.out.printf("El array rotado %d veces a la izquierda es:\n", number1);
          ArraysFunctions.showArrayInt(ArraysFunctions.rotateNLeftArrayInt(array, number1));
          break;
        case 9:                                                  // showArrayInt
          ArraysFunctions.showArrayInt(array);
          break;
        case 10:                                                 // Salir
          continueMenu = false;
          break;
        default:
          System.out.println(red + "Error: opción incorrecta." + reset);
      }
      
      // Limpia la pantalla en caso de que el usuario continúe
      if (option != 10) {
        clear();
      }
    } while (continueMenu);
    
    System.out.println("\n╔═══════════════════════════════════════════════════════╗");
    System.out.println("║                 Gracias. Hasta luego.                 ║");
    System.out.println("╚═══════════════════════════════════════════════════════╝");
  }
  
  /**
   * <p><strong>Función:</strong></br>menu</p>
   * <p><strong>Propósito:</strong></br>muestra un menú y toma la opción escogida por el usuario.</p>
   * @return opción escogida por el usuario.
   */
  
  public static int menu() {
    // Mostrar menu
    System.out.println();
    System.out.println("╔═════════════════════════════════════════════════════════════════╗");
    System.out.println("║                              MENÚ                               ║");
    System.out.println("╠════╦════════════════════════════════════════════════════════════╣");
    System.out.println("║ 1  ║ Mostrar el valor mínimo del array.                         ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 2  ║ Mostrar el valor máximo del array.                         ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 3  ║ Calcular la media del array.                               ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 4  ║ Indicar si un número está en el array.                     ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 5  ║ Mostrar la posición de la primera ocurrencia de un número. ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 6  ║ Voltear el array.                                          ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 7  ║ Rotar a la derecha los números del array.                  ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 8  ║ Rotar a la izquierda los números del array.                ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 9  ║ Mostrar contenido del array.                               ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 10 ║ Salir.                                                     ║");
    System.out.println("╚════╩════════════════════════════════════════════════════════════╝");

    // Toma la elección del usuario
    Scanner s = new Scanner(System.in);
    System.out.print("\nSelecciona una opción: ");
    return s.nextInt();
  }
  
  /**
   * <p><strong>Función:</strong></br>showOption</p>
   * <p><strong>Propósito:</strong></br>mostrar la opción escogida por el usuario.</p>
   */
  
  public static void showOption(int option) {
    System.out.print("\u001b[2J");
    switch (option) {
      case 1:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 1  ║ Mostrar el valor mínimo del array.                         ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 2:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 2  ║ Mostrar el valor máximo del array.                         ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 3:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 3  ║ Calcular la media del array.                               ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 4:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 4  ║ Indicar si un número está en el array.                     ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 5:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 5  ║ Mostrar la posición de la primera ocurrencia de un número. ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 6:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 6  ║ Voltear el array.                                          ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 7:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 7  ║ Rotar a la derecha los números del array.                  ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 8:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 8  ║ Rotar a la izquierda los números del array.                ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 9:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 9  ║ Mostrar contenido del array.                               ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      default:
        System.out.println();
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>clear</p>
   * <p><strong>Propósito:</strong></br>limpia la pantalla tras pulsar una tecla.</p>
   */
  
  public static void clear() {
    Scanner s = new Scanner(System.in);
    System.out.print("Pulsa cualquier tecla para continuar...");
    s.nextLine();
    System.out.print("\u001b[2J");
  }
}
