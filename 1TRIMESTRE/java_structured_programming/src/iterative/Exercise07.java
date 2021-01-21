package iterative;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise07.java</p>
 * <p><strong>Propósito:</strong></br>Realiza el control de acceso a una caja fuerte. La
 * combinación será un número de 4 cifras generado al azar. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje "Lo siento, esa no es la combinación",
 * además de una pista sobre si el número introducido es mayor o menor que el código que abre la
 * caja fuerte; y si acertamos se nos dirá "La caja fuerte se ha abierto satisfactoriamente".
 * Tendremos cuatro oportunidades para abrir la caja fuerte.</p>
 * @author David Pérez Ruiz
 * @param numberTries Número entero, número de intentos empleados para abrir la caja.
 * @param codeBox Número entero, código que abre la caja fuerte, número generado de 4 cifras.
 * @param codeUser Número entero, código introducido por el usuario.
 */

public class Exercise07 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int numberTries = 0;
    int codeBox = (int)(Math.random()*10000);
    int codeUser;

    // Informar del programa
    System.out.println("           ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
    System.out.println("           Bienvenido a la caja fuerte del Banco Fortuna");
    System.out.println("           ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    System.out.println("╔══════════════════════════════════════════════════════════════════╗");
    System.out.println("║Ha insertado el virus de decodificación para abrir la caja fuerte.║");
    System.out.println("║ ¡Análisis completado! El código consta de una clave de 4 dígitos ║");
    System.out.println("║   Recuerda: tiene 4 intentos antes de que se active la alarma.   ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════╝");

    // Proceso de apertura de la caja fuerte
    while (numberTries != 4) {
      System.out.print("Introduzca el código de apertura: ");
      codeUser = s.nextInt();
      numberTries++;
      if (numberTries == 4) {
        break;
      } else if (codeUser == codeBox) {
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println(" La caja fuerte se ha abierto satisfactoriamente");
        System.out.println(" Cantidad de dinero disponible: 63150743801.06 €");
        System.out.println(" ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        break;
      } else if (codeUser < codeBox) {
        System.out.println("           ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("           Lo siento, esa no es la combinación.");
        System.out.println("                ActivÅИd0 £ã Ä1@░░▒▒▓▓");
        System.out.println("           ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║   Alarma contenida al " +  numberTries*25 + "% " +
            "█".repeat(13+(6*(numberTries-1))) + " ".repeat(26-(6*(numberTries-1))) + "║");
        System.out.println("║  Informe de error: el código es menor que la clave de apertura.  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
      } else if (codeUser > codeBox) {
        System.out.println("           ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("           Lo siento, esa no es la combinación.");
        System.out.println("                ActivÅИd0 £ã Ä1@░░▒▒▓▓");
        System.out.println("           ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
        System.out.println("╔══════════════════════════════════════════════════════════════════╗");
        System.out.println("║   Alarma contenida al " +  numberTries*25 + "% " +
            "█".repeat(13+(6*(numberTries-1))) + " ".repeat(26-(6*(numberTries-1))) + "║");
        System.out.println("║  Informe de error: el código es mayor que la clave de apertura.  ║");
        System.out.println("╚══════════════════════════════════════════════════════════════════╝");
      }
    }

    // Mensaje en caso de que se agotaran todos los intentos
    if (numberTries == 4) {
      System.out.println("             ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
      System.out.println("                Lo siento, esa no es la combinación.");
      System.out.println("                        Activando la alarma...");
      System.out.println("             Llamando a las autoridades. Queda detenido.");
      System.out.println("             ▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀");
    }
  }
}
