package exercises35to50;
import java.util.Scanner;

/**
 * <p>Ejercicio 37 del tema 8 del libro <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise37 {
  public static void main(String[] args) { 
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    
    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════╗");
    System.out.println("║ Programa que convierte un número a código Morse. ║");
    System.out.println("╚══════════════════════════════════════════════════╝");
    
    // Petición de datos
    System.out.print("Introduzca un número: ");
    number = s.nextInt();
    
    // Mostrar número convertido
    System.out.printf("%d en código Morse es %s\n", number, convertToMorse(number));
  }
  
  /**
   * <p><strong>Función:</strong></br>convertToMorse</p>
   * <p><strong>Propósito:</strong></br>convierte un número a código Morse.</p>
   * @param number Número entero, número a convertir a código Morse.
   * @return <em>number</em> convertido a código Morse.
   */
  
  public static String convertToMorse(int number) {
    // Declaración de variables
    int auxiliary = Math.abs(number);
    int reverse = 0;
    String morse = "";
    
    // Si el número es negativo, inserta '-' en Morse delante
    if (number < 0) {
      morse += "—....—";
    }
    
    // Voltear el número
    while (auxiliary > 0) {
      reverse = (reverse*10) + (auxiliary%10);
      auxiliary /= 10;
    }
    
    // Obtener el número en código Morse
    while (reverse > 0) {
      switch (reverse%10) {
        case 1:
          morse += ".————";
          break;
        case 2:
          morse += "..———";
          break;
        case 3:
          morse += "...——";
          break;
        case 4:
          morse += "....—";
          break;
        case 5:
          morse += ".....";
          break;
        case 6:
          morse += "—....";
          break;
        case 7:
          morse += "——...";
          break;
        case 8:
          morse += "———..";
          break;
        case 9:
          morse += "————.";
          break;
        case 0:
          morse += "—————";
          break;
      }
      
      reverse /= 10;
    }
    
    // Si el número acaba en 0, lo añade para evitar omitirlo
    if (number %10 == 0) {
      morse += "—————";
    }
    
    return morse;
  }
}
