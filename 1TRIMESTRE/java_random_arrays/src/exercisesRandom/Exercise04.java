package exercisesRandom;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise04.java</p>
 * <p><strong>Propósito:</strong></br>Realiza un programa que pinte por pantalla una serpiente con
 * un "serpenteo" aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 * exactamente en la posición 13 (con 12 espacios delante). A partir de ahí, el cuerpo irá
 * serpenteando de la siguiente manera: se generará de forma aleatoria un valor entre tres posibles
 * que hará que el siguiente carácter se  coloque una posición a la izquierda del anterior, alineado
 * con el anterior o una posición a la derecha del anterior. La longitud de la serpiente se pedirá
 * por teclado y se supone que el usuario introducirá un dato correcto.</p>
 * @author David Pérez Ruiz
 * @param lengthBody Número entero, longitud del cuerpo de la serpiente.
 * @param bodySnake Cadena de caracteres, cuerpo de la serpiente.
 * @param wriggling Número entero, serpenteo aleatorio (estático, derecha o izquierda).
 */

public class Exercise04 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int lengthBody;
    String bodySnake = "            *";
    int wriggling;

    // Informar del programa
    System.out.println("╔════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa dibuja una serpiente que serpentea. El tamaño de esta ║");
    System.out.println("║                   es introducido por teclado.                  ║");
    System.out.println("╚════════════════════════════════════════════════════════════════╝");

    // Petición de la longitud
    do {
      System.out.print("Introduzca la longitud de la serpiente: ");
      lengthBody = s.nextInt();
    } while (lengthBody < 1);

    // Mostrar la cabeza de la serpiente
    System.out.println("            @");

    // Generar serpenteo
    do {
      wriggling =(int)(Math.random()*3);
      switch (wriggling) {
        case 0:    // Desplazar el cuerpo a la izquierda
          if (bodySnake.length() > 1) {
            bodySnake = bodySnake.substring(1);
            lengthBody--;
            System.out.println(bodySnake);
          }
          break;
        case 1:    // El cuerpo se queda en la posición anterior
          lengthBody--;
          System.out.println(bodySnake);
          break;
        case 2:    // Desplazar el cuerpo a la derecha
          bodySnake = " " + bodySnake;
          lengthBody--;
          System.out.println(bodySnake);
          break;
        default:
          break;
      }
    } while (lengthBody > 0);
  }
}
