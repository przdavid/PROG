package exercise2;
import java.util.Scanner;
import exercise2.Fraction;

public class TestFraction {
  public static void main(String args[])  {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    Fraction f1 = new Fraction(3, 4);
    int n;
    
    // Informar del programa
    System.out.println("╔═══════════════════════════════════════╗");
    System.out.println("║ Test de objetos de la clase Fracción. ║");
    System.out.println("╚═══════════════════════════════════════╝");
    
    // Mostrar fracción y sus atributos
    System.out.println("Fracción 1: " + f1);
    System.out.println("El numerador de Fracción 1 es: " + f1.getNumerator());
    System.out.println("El denominador de Fracción 1 es: " + f1.getDenominator());
    
    // Cambiar los valores de la fracción
    System.out.println("\nVamos a cambiar los valores de Fracción 1.");
    System.out.print("Introduzca el nuevo numerador: ");
    f1.setNumerator(s.nextInt());
    System.out.print("Introduzca el nuevo denominador: ");
    f1.setDenominator(s.nextInt());
    
    System.out.println("La nueva Fracción 1 es: " + f1);
    
    // Calcular el valor de la fracción
    System.out.println("\nEl valor de la Fracción 1 (" + f1 + ") es: " + Float.toString(f1.calculateFraction()));
    
    // Multiplicar la fracción por un número
    System.out.println("\nVamos a multiplicar la fracción por un número.");
    System.out.print("Introduzca un número: ");
    n = s.nextInt();
    
    System.out.print("(" + f1 + ") x " + n + " = ");
    f1.multiply(n);
    System.out.println(f1);
    
    // Sumar, restar y multiplicar fracciones
    System.out.println("\nVamos a sumar, restar y multiplicar fracciones.");
    Fraction f2 = new Fraction(2, 5);
    System.out.println("Fracción 2:" + f2);
    
    // Suma
    System.out.print(f1 +" + " + f2 + " = ");
    Fraction f3 = f1.addFraction(f2);
    System.out.println(f3);
    
    // Resta
    System.out.print(f1 +" - " + f2 + " = ");
    Fraction f4 = f1.substractFraction(f2);
    System.out.println(f4);
    
    // Multiplicación
    System.out.print(f1 +" x " + f2 + " = ");
    Fraction f5 = f1.multiply(f2);
    System.out.println(f5);
    
    // Simplificar fracciones
    System.out.println("\nVamos a simplificar fracciones.");
    System.out.print("La Fracción 3 " + f3 + " simplicada es: ");
    f3.simplifyFraction();
    System.out.println(f3 + "\n");
    
    System.out.print("La Fracción 4 " + f4 + " simplicada es: ");
    f4.simplifyFraction();
    System.out.println(f4 + "\n");
    
    System.out.print("La Fracción 5 " + f5 + " simplicada es: ");
    f5.simplifyFraction();
    System.out.println(f5 + "\n");
  }
}
