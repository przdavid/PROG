package exercises35to50;
import java.util.Scanner;

/**
 * <p>Ejercicio 42 del tema 8 del libro <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class Exercise42 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int height;
    
    // Informar del programa
    System.out.println("╔════════════════════════════════════════╗");
    System.out.println("║ Programa que dibuja un tirángulo hueco ║");
    System.out.println("╚════════════════════════════════════════╝");
    
    // Petición de datos
    System.out.print("Introduzca la altura del trigángulo: ");
    height = s.nextInt();
    
    // Si la altura es inferior a 4, pedirla de nuevo
    while (height < 4) {
      System.out.println("La altura introducida es muy pequeña para dibujar un triángulo hueco");
      System.out.print("Introduzca de nuevo la altura del trigángulo: ");
      height = s.nextInt();
    }
    
    // Dibujar el triángulo
    hollowTriangle(height);
    
  }
  
  /**
   * <p><strong>Función:</strong></br>hollowTriangle</p>
   * <p><strong>Propósito:</strong></br>dibuja un triángulo hueco.</p>
   * @param height Número entero, altura del triángulo.
   * @return dibujo del triángulo o una cadena vacía si se introduce una altura inferior a 4.
   */
  
  public static void hollowTriangle(int height) {
    // Si la altura introducida es inferior a 4 no puede dibujar un triángulo hueco
    if (height < 4) {
      System.out.println();
    } else {
      // Dibujar la base del triángulo
      System.out.println("*".repeat(height));
      
      // Dibujar el cuerpo del triángulo
      for (int i = height-3; i >= 0; i--) {
        System.out.println("*" + " ".repeat(i) + "*");
      }
      
      // Dibujar el vértice
      System.out.println("*");
    }
  }
}
