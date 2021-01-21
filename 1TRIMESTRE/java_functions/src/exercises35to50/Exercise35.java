package exercises35to50;
import java.util.Scanner;

/**
 * <p>Ejercicio 35 del tema 8 del libro <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise35 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int number;
    
    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que convierte un número a sistema de palotes. ║");
    System.out.println("╚════════════════════════════════════════════════════════╝");
    
    // Petición de datos
    System.out.print("Introduzca un número: ");
    number = s.nextInt();
    
    // Mostrar número convertido
    System.out.printf("%d en sistema de palotes es %s\n", number, convertToDownstroke(number));
  }
  
  /**
   * <p><strong>Función:</strong></br>convertToDownstroke</p>
   * <p><strong>Propósito:</strong></br>convierte un número a sistema de palotes.</p>
   * <p><em>Un ejemplo sería convertir 470213 a ||||-|||||||--||-|-|||.</em></p>
   * @param number Número entero, número a convertir en sistema de palotes.
   * @return <em>number</em> convertido al sistema de palotes.
   */
  
  public static String convertToDownstroke(int number) {
    // Declaración de variables
    int auxiliary = Math.abs(number);
    int reverse = 0;
    String downstroke = "";
    
    // Si el número es negativo, inserta un - delante
    if (number < 0) {
      downstroke += "- ";
    }
    
    // Voltear el número
    while (auxiliary > 0) {
      reverse = (reverse*10) + (auxiliary%10);
      auxiliary /= 10;
    }
    
    // Obtener número en sistema de palotes
    while (reverse >= 10) {
      downstroke += "|".repeat(reverse%10) + "-";
      reverse /= 10;
    }
    
    downstroke += "|".repeat(reverse%10);  // Convierte el último número omitiendo un guion de más
    
    // Si el número acaba en 0, añade el guion para indicarlo
    if (number%10 == 0) {
      downstroke += "-";
    }
    
    return downstroke;
  }
}
