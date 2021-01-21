package exercise1;
import exercise1.Time;

public class TestTime {
  public static void main(String args[]) {
    Time t1 = new Time(4, 15, 23);
    Time t2 = new Time(1, 20, 30);
    
 // Informar del programa
    System.out.println("╔═════════════════════════════════════╗");
    System.out.println("║ Test de objetos de la clase Tiempo. ║");
    System.out.println("╚═════════════════════════════════════╝");
    
    // Mostrar la cadena tiempo
    System.out.println("Tiempo 1: " + t1);
    System.out.println("Tiempo 2: " + t2);
    
    // Sumar y restar objetos de clase Tiempo
    System.out.println("\nSumar y restar tiempos:");
    System.out.print("Tiempo 1 + Tiempo 2 = ");
    Time t3 = t1.add(t2);
    System.out.println(t3);
    
    System.out.print("Tiempo 1 - Tiempo 2 = ");
    Time t4 = t1.substract(t2);
    System.out.println(t4);
    
    
    // Sumar y restar segundos, minutos y horas
    System.out.println("\nSumar 45 segundos al objeto tiempo:");
    t1.addSeconds(45);
    System.out.println(t1);
    
    System.out.println("Restar 27 segundos al objeto tiempo:");
    t1.substractSeconds(27);
    System.out.println(t1);

    System.out.println("\nSumar 72 minutos al objeto tiempo:");
    t1.addMinutes(72);
    System.out.println(t1);
    System.out.println("Restar 140 minutos al objeto tiempo:");
    t1.substractMinutes(140);
    System.out.println(t1);
    
    System.out.println("\nSumar 5 horas al objeto tiempo:");
    t1.addHours(5);
    System.out.println(t1);
    System.out.println("Restar 3 horas al objeto tiempo:");
    t1.substractHours(3);
    System.out.println(t1);
  }
}
