package exercisesUniArrays;

/**
 * <p><strong>Programa:</strong></br>Exercise04.java</p>
 * <p><strong>Propósito:</strong></br>Define tres arrays de 20 números enteros cada una, con nombres
 * numero, cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
 * cuadrado se deben almacenar los cuadrados de los valores que hay en el array numero. En el array
 * cubo se deben almacenar los cubos de los valores que hay en numero. A continuación, muestra el
 * contenido de los tres arrays dispuesto en tres columnas.</p>
 * @author David Pérez Ruiz
 * @param numero Array de números enteros.
 * @param cuadrado Array de números enteros, contiene los datos al cuadrado de <em>numero</em>
 * @param cubo Array de números enteros, contiene los datos al cubo de <em>numero</em>
 * @param randomNumber Número entero, generado al azar.
 */

public class Exercise04 {
  public static void main(String[] args) {
    // Declaración de variables
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int randomNumber;

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que genera 20 números aleatorios y los muestra junto al ║");
    System.out.println("║                        cuadrado y al cubo.                       ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════╝");

    // Generación de números
    for (int i = 0; i <= 19; i++) {
      randomNumber = (int)(Math.random()*101);
      numero[i] = randomNumber;
      cuadrado[i] = numero[i] * randomNumber;
      cubo[i] = cuadrado[i] * randomNumber;
    }

    // Mostrar resultado
    System.out.println("Número\t\tCuadrado\tCubo");
    for (int i = 0; i <= 19; i++) {
      System.out.println(numero[i] + "\t\t" + cuadrado[i] + "\t\t" + cubo[i]);
    }
  }
}
