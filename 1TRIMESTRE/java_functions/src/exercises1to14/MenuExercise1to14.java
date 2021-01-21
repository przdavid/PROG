package exercises1to14;
import exercises1to14.MathematicsFunctions;
import java.util.Scanner;

/**
 * <p>Menú para operar las funciones de <em>MathematicsFunctions</em>.</p>
 * @author David Pérez Ruiz
 */

public class MenuExercise1to14 {
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
    
    // Generar menú
    do {
      option = menu();
      
      // Limpiar la pantalla y mostrar la opción seleccionada
      showOption(option);
      
      // Ejecutar la opción seleccionada
      switch (option) {
        case 1:                                                  // palindromicNumber
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          
          if(MathematicsFunctions.palindromicNumber(number1)) {
            System.out.printf(green + "\n%d es capicúa.\n" + reset, number1);
          } else {
            System.out.printf(red + "\n%d no es capicúa.\n" + reset, number1);
          }
          break;
        case 2:                                                  // primeNumber
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          
          if(MathematicsFunctions.primeNumber(number1)) {
            System.out.printf(green + "\n%d es primo.\n" + reset, number1);
          } else {
            System.out.printf(red + "\n%d es compuesto.\n" + reset, number1);
          }
          break;
        case 3:                                                  // nextPrime
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          
          System.out.printf("El siguiente primo a %d es" + green + " %d" + reset + ".\n", number1,
                            MathematicsFunctions.nextPrime(number1));
          break;
        case 4:                                                  // calculateExponentation
          System.out.print("Introduce una base: ");
          number1 = s.nextInt();
          System.out.print("Introduce un exponente: ");
          number2 = s.nextInt();
          
          System.out.printf("%d elevado a %d es" + green + " %.2f" + reset + ".\n", number1, number2,
                            MathematicsFunctions.calculateExponentation(number1, number2));
          break;
        case 5:                                                  // countDigits
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          
          System.out.printf("%d tiene" + green + " %d dígitos" + reset + ".\n", number1,
                            MathematicsFunctions.countDigits(number1));
          break;
        case 6:                                                  // reverseNumber
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          
          System.out.printf("%d dado la vuelta es"+ green + " %d" + reset + ".\n", number1,
              MathematicsFunctions.reverseNumber(number1));
          break;
        case 7:                                                  // digitN
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce otro número: ");
          number2 = s.nextInt();
          
          while (MathematicsFunctions.digitN(number1, number2) == -1) {
            System.out.println(red + "\nError: la posición está fuera de rango." + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduce otro número: ");
            number2 = s.nextInt();
          }
          
          System.out.printf("En la posición %d de %d está" + green + " %d" + reset + ".\n", number2,
                            number1, MathematicsFunctions.digitN(number1, number2));
          break;
        case 8:                                                  // positionOfDigit
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce otro número: ");
          number2 = s.nextInt();
          
          if (MathematicsFunctions.positionOfDigit(number1, number2) == -1) {
            System.out.printf(red + "\n%d no está en %d.\n" + reset, number2, number1);
          } else {
            System.out.printf("La primera ocurrencia de %d en %d está en" + green + " %d" + reset +
                              ".\n", number2, number1,
                              MathematicsFunctions.positionOfDigit(number1, number2));
          }
          break;
        case 9:                                                  // removeBehind
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce la cantidad de dígitos a eliminar por detrás: ");
          number2 = s.nextInt();
          
          while (MathematicsFunctions.removeBehind(number1, number2) == -1) {
            System.out.println(red + "\nError: intentando eliminar más dígitos de los que tiene el"
                               + " número." + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduce la cantidad de dígitos a eliminar por detrás: ");
            number2 = s.nextInt();
          }
          
          System.out.printf("Eliminando %d digitos detrás de %d resulta " + green + "%d" + reset +
                            ".\n", number2, number1, MathematicsFunctions.removeBehind(number1,
                            number2));
          break;
        case 10:                                                 // removeFront
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce la cantidad de dígitos a eliminar delante: ");
          number2 = s.nextInt();
          
          while (MathematicsFunctions.removeFront(number1, number2) == -1) {
            System.out.println(red + "\nError: intentando eliminar más dígitos de los que tiene el."
                               + " número" + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduce la cantidad de dígitos a eliminar delante: ");
            number2 = s.nextInt();
          }
          
          System.out.printf("Eliminando %d digitos delante de %d resulta " + green + "%d" + reset +
                            ".\n", number2, number1, MathematicsFunctions.removeFront(number1,
                            number2));
          break;
        case 11:                                                 // stickBehind
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce un dígito: ");
          number2 = s.nextInt();
          
          while (MathematicsFunctions.stickBehind(number1, number2) == -1) {
            System.out.println(red + "\nError: el segundo número debe ser un solo dígito." + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduce un dígito: ");
            number2 = s.nextInt();
          }
          
          System.out.printf("%d unido detrás de %d es" + green + " %d" + reset + ".\n", number2,
                            number1, MathematicsFunctions.stickBehind(number1, number2));
          break;
        case 12:                                                 // stickFront
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce un dígito: ");
          number2 = s.nextInt();
          
          while (MathematicsFunctions.stickBehind(number1, number2) == -1) {
            System.out.println(red + "\nError: el segundo número debe ser un solo dígito." + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduce un dígito: ");
            number2 = s.nextInt();
          }
          
          System.out.printf("%d unido delante de %d es" + green + " %d" + reset + ".\n", number2,
                            number1, MathematicsFunctions.stickFront(number1, number2));
          break;
        case 13:                                                 // piceOfNumber
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce la posición inicial del trozo de número: ");
          number2 = s.nextInt();
          System.out.print("Introduce la posición final del trozo de número: ");
          number3 = s.nextInt();
          
          while (MathematicsFunctions.piceOfNumber(number1, number2, number3) == -1) {
            System.out.println(red + "\nError: las posiciones están fuera del rango del número"
                               + reset);
            System.out.print("Introduce un número: ");
            number1 = s.nextInt();
            System.out.print("Introduzca la posición inicial del trozo del número: ");
            number2 = s.nextInt();
            System.out.print("Introduzca la posición final del trozo del número: ");
            number3 = s.nextInt();
          }
          
          System.out.printf("El trozo de %d desde %d hasta %d es " + green + "%d" + reset + ".\n",
                            number1, number2, number3, MathematicsFunctions.piceOfNumber(number1,
                            number2, number3));
          break;
        case 14:                                                 // joinNumbers
          System.out.print("Introduce un número: ");
          number1 = s.nextInt();
          System.out.print("Introduce otro número: ");
          number2 = s.nextInt();
          
          System.out.printf("%d unido a %d es" + green + " %d" + reset + ".\n", number1, number2,
                            MathematicsFunctions.joinNumbers(number1, number2));
          break;
        case 15:                                                 // Salir
          continueMenu = false;
          break;
        default:
          System.out.println(red + "Error: opción incorrecta." + reset);
      }
      // Limpia la pantalla en caso de que el usuario continúe
      if (option != 15) {
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
    System.out.println("╔═══════════════════════════════════════════════════════╗");
    System.out.println("║                         MENÚ                          ║");
    System.out.println("╠════╦══════════════════════════════════════════════════╣");
    System.out.println("║ 1  ║ Comprobar si un número es capicúa.               ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 2  ║ Comprobar si un número es primo.                 ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 3  ║ Mostrar el siguiente primo de un número.         ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 4  ║ Calcular potencia.                               ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 5  ║ Contar el número de dígitos de un número.        ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 6  ║ Dar la vuelta a un número.                       ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 7  ║ Mostrar el dígito de un número en una posición.  ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 8  ║ Mostrar la primera ocurrencia de un dígito.      ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 9  ║ Eliminar n dígitos por detrás a un número.       ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 10 ║ Eliminar n dígitos delante a un número.          ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 11 ║ Añadir un dígito por detrás a un número.         ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 12 ║ Añadir un dígito delante a un número.            ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 13 ║ Obtener un trozo de número a partir de otro.     ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 14 ║ Unir dos números para formar otro.               ║");
    System.out.println("╠════╬══════════════════════════════════════════════════╣");
    System.out.println("║ 15 ║ Salir.                                           ║");
    System.out.println("╚════╩══════════════════════════════════════════════════╝");

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
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 1  ║ Comprobar si un número es capicúa.               ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 2:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 2  ║ Comprobar si un número es primo.                 ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 3:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 3  ║ Mostrar el siguiente primo de un número.         ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 4:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 4  ║ Calcular potencia.                               ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 5:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 5  ║ Contar el número de dígitos de un número.        ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 6:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 6  ║ Dar la vuelta a un número.                       ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 7:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 7  ║ Mostrar el dígito de un número en una posición.  ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 8:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 8  ║ Mostrar la primera ocurrencia de un dígito.      ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 9:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 9  ║ Eliminar n dígitos por detrás a un número.       ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 10:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 10 ║ Eliminar n dígitos delante a un número.          ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 11:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 11 ║ Añadir un dígito por detrás a un número.         ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 12:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 12 ║ Añadir un dígito delante a un número.            ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 13:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 13 ║ Obtener un trozo de número a partir de otro.     ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
        break;
      case 14:
        System.out.println("╔════╦══════════════════════════════════════════════════╗");
        System.out.println("║ 14 ║ Unir dos números para formar otro.               ║");
        System.out.println("╚════╩══════════════════════════════════════════════════╝");
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
