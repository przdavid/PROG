package exercises35to50;

/**
 * <p>Ejercicio 47 del tema 8 del libro <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise47 {
  public static void main(String[] args) {
    // Variables de prueba
    int[] arrayExample1 = {6, 2, 5, 0, 1};
    int[] arrayExample2 = {3, 7, 9};
    int[] arrayExample3 = {8};
    int[] arrayExample4= {};
    
    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que convierte un array de números a una cadena. ║");
    System.out.println("╚══════════════════════════════════════════════════════════╝");
    
    // Mostrar resultado
    System.out.printf("El array 1 se convierte en %s\n", convertArrayIntoString(arrayExample1));
    System.out.printf("El array 2 se convierte en %s\n", convertArrayIntoString(arrayExample2));
    System.out.printf("El array 3 se convierte en %s\n", convertArrayIntoString(arrayExample3));
    System.out.printf("El array 4 se convierte en %s\n", convertArrayIntoString(arrayExample4));
  }
  
  /**
   * <p><strong>Función:</strong></br>convertArrayIntoString</p>
   * <p><strong>Propósito:</strong></br>convierte un array de números enteros en un String.</p>
   * @param array Array de números enteros.
   * @return <em>array</em> convertido en cadena de caracteres.
   */

  public static String convertArrayIntoString(int[] array) {
    String stringArray = "";
    
    for (int i = 0; i < array.length; i++) {
      stringArray += Integer.toString(array[i]);
    }
    
    return stringArray;
  }
}
