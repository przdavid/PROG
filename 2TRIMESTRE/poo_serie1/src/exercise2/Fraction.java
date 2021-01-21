package exercise2;

/**
 * Clase que representa a los objetos de tipo Fracción.
 * @author David Pérez Ruiz
 * Fecha: 20/01/2021
 * 
 * El formato de la clase es: Fraction(numerator, denominator).
 * @param numerator numerador de la fracción.
 * @param denominator denominador de la fracción.
 */

public class Fraction {
  // Atributos
  private int numerator;
  private int denominator;
  
  // Constructor
  /**
   * 
   * @param n numerador de la fracción.
   * @param d denominador de la fracción. No puede ser 0.
   */
  Fraction(int n, int d) {
    // Impedir que el denominador valga 0
    assert d != 0;
    
    this.numerator = n;
    this.denominator = d;
  }
  
  // Getters y setters
  /**
   * @return the numerator
   */
  public int getNumerator() {
    return numerator;
  }

  /**
   * @param numerator the numerator to set
   */
  public void setNumerator(int numerator) {
    this.numerator = numerator;
  }

  /**
   * @return the denominator
   */
  public int getDenominator() {
    return denominator;
  }

  /**
   * @param denominator the denominator to set
   */
  public void setDenominator(int denominator) {
    // Impedir que el denominador valga 0
    assert denominator != 0;
    
    this.denominator = denominator;
  }
  
  // Métodos
  //Ejercicio 2.b) Obtener la fracción como cadena de caracteres
  /**
   * Método: toString
   * Propósito: Devuelve la fracción como una cadena de caracteres.
   */
  @Override
  public String toString() {
    return Integer.toString(this.numerator) + "/" + Integer.toString(this.denominator);
  }
  
  // Ejercicio 2.d) Obtener resultado de la fracción
  /**
   * Método: calculateFraction
   * Propósito: Calcula el valor de la fracción.
   */
  float calculateFraction() {
    return (float) this.numerator / (float) this.denominator;
  }
  
  // Ejercicio 2.e) Multiplicar la fracción por un número
  /**
   * Método: multiply
   * Propósito: Multiplica la fracción por un número.
   * @param number Número entero a multiplicar por la fracción.
   * @return fracción tras multiplicarle en número entero
   */
  public Fraction multiply(int number) {
    return new Fraction(this.numerator * number, this.denominator);
  }
  
  //Ejercicio 2.f) Multiplicar, sumar y restar fracciones
  /**
   * Método: multiply
   * Propósito: Multiplica fracciones.
   * @param fraction fracción que se multiplicará.
   */
  public Fraction multiply(Fraction fraction) {
    return new Fraction(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
  }
  
  /**
   * Método: addFraction
   * Propósito: Suma fracciones.
   * @param fraction fracción que se sumará.
   */
  public Fraction addFraction(Fraction fraction) { 
    // Si los denominadores son iguales, se suman solo los numeradores
    if (this.denominator == fraction.denominator) {
      return new Fraction(this.numerator + fraction.numerator, this.denominator);
    // En caso contrario, igualar los denominadores
    } else {
      return new Fraction(this.numerator * fraction.denominator + this.denominator * fraction.numerator,
          this.denominator * fraction.denominator);
    }
  }
  
  /**
   * Método: substractFraction
   * Propósito: Resta fracciones.
   * @param fraction fracción que se restará.
   */
  public Fraction substractFraction(Fraction fraction) { 
    return this.addFraction(fraction).multiply(-1);
  }
  
  // Ejercicio 2.g) Simplificar la fracción
  /**
   * Método: simplifyFraction
   * Propósito: simplifica una fracción hasta su irreducible.
   */
  void simplifyFraction() {
    int i = 2;
    
    // Si el numerador es igual al denominador, la fracción será 1/1
    if (this.numerator == this.denominator) {
      this.numerator = 1;
      this.denominator = 1;
    // Si no, dividir el numerador y el denominador por el mismo número hasta su irreducible
    } else {
      while (Math.abs(this.numerator) > i || Math.abs(this.denominator) > i) {
        if (this.numerator%i == 0 && this.denominator%i == 0) {
          this.numerator /= i;
          this.denominator /= i;
          
          i = 2;
        } else {
          i++;
        }
      }
    }
  }
}