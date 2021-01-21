package exercisesUniArrays;
import java.util.Scanner;

/**
 * <p><strong>Programa:</strong></br>Exercise08.java</p>
 * <p><strong>Propósito:</strong></br>Realiza un programa que pida la temperatura media que ha
 * hecho en cada mes de un determinado año y que muestre a continuación un diagrama de barras
 * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o
 * cualquier otro carácter.</p>
 * @author David Pérez Ruiz
 * @param dataTemperature Array de números reales, almacena la temperatura media mensual.
 */

public class Exercise08 {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    double[] dataTemperature = new double[12];

    // Informar del programa
    System.out.println("╔══════════════════════════════════════════════════════════════════════╗");
    System.out.println("║ Programa que pide la temperatura media mensual de un determinado año ║");
    System.out.println("║                y la muestra con un diagrama de barras.               ║");
    System.out.println("╚══════════════════════════════════════════════════════════════════════╝");

    // Petición de datos
    for(int i = 0; i < dataTemperature.length; i++) {
      System.out.print("Introduzca la temperatura de ");
      switch (i) {
        case 0:
          System.out.print("Enero: ");
          break;
        case 1:
          System.out.print("Febrero: ");
          break;
        case 2:
          System.out.print("Marzo: ");
          break;
        case 3:
          System.out.print("Abril: ");
          break;
        case 4:
          System.out.print("Mayo: ");
          break;
        case 5:
          System.out.print("Junio: ");
          break;
        case 6:
          System.out.print("Julio: ");
          break;
        case 7:
          System.out.print("Agosto: ");
          break;
        case 8:
          System.out.print("Septiembre: ");
          break;
        case 9:
          System.out.print("Octubre: ");
          break;
        case 10:
          System.out.print("Noviembre: ");
          break;
        case 11:
          System.out.print("Diciembre: ");
          break;
      }
      dataTemperature[i] = s.nextDouble();
    }

    // Mostrar resultado
    System.out.println("╔═══════════════════════════╗");
    System.out.println("║ TEMPERATURA MEDIA MENSUAL ║");
    System.out.println("╚═══════════════════════════╝");

    for (int i = 0; i < dataTemperature.length; i++) {
      // Indicar el mes
      switch (i) {
        case 0:
          System.out.print("Enero:\t\t");
          break;
        case 1:
          System.out.print("Febrero:\t");
          break;
        case 2:
          System.out.print("Marzo:\t\t");
          break;
        case 3:
          System.out.print("Abril:\t\t");
          break;
        case 4:
          System.out.print("Mayo:\t\t");
          break;
        case 5:
          System.out.print("Junio:\t\t");
          break;
        case 6:
          System.out.print("Julio:\t\t");
          break;
        case 7:
          System.out.print("Agosto:\t\t");
          break;
        case 8:
          System.out.print("Septiembre:\t");
          break;
        case 9:
          System.out.print("Octubre:\t");
          break;
        case 10:
          System.out.print("Noviembre:\t");
          break;
        case 11:
          System.out.print("Diciembre:\t");
          break;
      }
      // Dibujar diagrama de barra
      System.out.println(dataTemperature[i] + "\t" + "■".repeat((int)dataTemperature[i]+30));
    }
  }
}
