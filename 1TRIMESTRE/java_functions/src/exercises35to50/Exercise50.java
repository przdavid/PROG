package exercises35to50;

/**
 * <p>Ejercicio 50 del tema 8 del libro <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise50 {
  public static void main(String[] args) {
    // Variables de prueba
    int[] a = {8, 9, 0};
    int[] b = {1, 2, 3};
    int[] c = {4, 3};
    int[] d = {7, 8, 9, 10};
    int[] e = {8, 9, 0, 3};
    int[] f = {1};
    int[] g = {};
    int[] h = {1, 2, 3};
    
    // Informar del programa
    System.out.println("╔═════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que crea un nuevo array a partir de dos array. ║");
    System.out.println("║               mezclados alternativamente.               ║");
    System.out.println("╚═════════════════════════════════════════════════════════╝");
    
    // Mostrar resultado
    System.out.println("Mezclando los arrays A y B se obtiene:");
    showArrayInt(mixArray(a, b));
    System.out.println("Mezclando los arrays C y D se obtiene:");
    showArrayInt(mixArray(c, d));
    System.out.println("Mezclando los arrays E y F se obtiene:");
    showArrayInt(mixArray(e, f));
    System.out.println("Mezclando los arrays G y H se obtiene:");
    showArrayInt(mixArray(g, h));
  }
  
  /**
   * <p><strong>Función:</strong></br>mixArray</p>
   * <p><strong>Propósito:</strong></br>toma dos arrays como parámetro y devuelve uno nuevo
   * mezclando ambos alternativamente.</p>
   * @param array1 Array de números enteros.
   * @param array2 Array de números enteros.
   * @return nuevo array resultado de mezclar alternativamente <em>array1</em> y <em>array2</em>.
   */
  
  public static int[] mixArray(int[] array1, int[] array2) {
    // Declaración de variables
    int[] newArray = new int[array1.length+array2.length];
    int j = 0;
    
    // Mezclar arrays
    for (int i = 0; i < array1.length+array2.length; i++) {
      // Si i está dentro del rango de array1, añadir el dato i de array1 en el nuevo array
      if (i < array1.length) {
        newArray[j] = array1[i];
        j++;
      }
      // De igual forma para array2
      if (i < array2.length) {
        newArray[j] = array2[i];
        j++;
      }
    }
    
    return newArray;
  }
  
  /**
   * <p><strong>Función:</strong></br>showArrayInt</p>
   * <p><strong>Propósito:</strong></br>muestra el contenido de un array.</p>
   * @param array Array de números enteros
   * @return contenido de <em>array</em>.
   */
  
  public static void showArrayInt(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
