package exercise1;

/**
 * Clase que representa a los objetos de tipo Tiempo.
 * 
 * @author David Pérez Ruiz
 * Fecha: 19/01/2021
 * 
 * El formato de la clase es: Time(hour, minute, second) Ejemplo: Time(1, 20, 30)
 * @param hour: horas de la clase Time.
 * @param minute: minutos de la clase Time.
 * @param second: segundos de la clase Time.
 */

public class Time {
  // Atributos
  int hour;
  int minute;
  int second;

  // Constructor
  Time(int h, int m, int s) {
    int auxiliarSecond = (h * 3600) + (m * 60) + s;
    this.hour = auxiliarSecond / 3600;
    this.minute = (auxiliarSecond % 3600) / 60;
    this.second = (auxiliarSecond % 3600) % 60;
  }

  // Getters
  /**
   * @return the hour
   */
  public int getHour() {
    return hour;
  }

  /**
   * @return the minute
   */
  public int getMinute() {
    return minute;
  }

  /**
   * @return the second
   */
  public int getSecond() {
    return second;
  }

  // Métodos
  // Ejercicio 1.a) Sumar y restar otro objeto Time
  /**
   * Método: add
   * Propósito: suma un objeto Time.
   * 
   * @param t objeto Time a sumar.
   */
  public Time add(Time t) {
    return new Time(this.hour + t.hour, this.minute + t.minute, this.second + t.second);
  }
  
  /**
   * Método: substract
   * Propósito: resta un objeto Time.
   * 
   * @param t objeto Time a restar.
   */
  public Time substract(Time t) {
    return new Time(this.hour - t.hour, this.minute - t.minute, this.second - t.second);
  }
  
  // Ejercicio 1.b) Sumar y restar segundos, minutos y horas
  /**
   * Método: addSeconds
   * Propósito: suma segundos a un objeto Time.
   * 
   * @param s cantidad de segundos a sumar en el objeto Time.
   */
  public void addSeconds(int s) {
    Time auxiliary = new Time(this.hour, this.minute, this.second + s);

    this.hour = auxiliary.hour;
    this.minute = auxiliary.minute;
    this.second = auxiliary.second;
  }

  /**
   * Método: substractSeconds
   * Propósito: resta segundos a un objeto Time.
   * 
   * @param s cantidad de segundos a restar en el objeto Time.
   */
  public void substractSeconds(int s) {
    this.addSeconds(-1 * s);
  }

  /**
   * Método: addMinutes
   * Propósito: suma minutos a un objeto Time.
   * 
   * @param m cantidad de minutos a sumar en el objeto Time.
   */
  public void addMinutes(int m) {
    this.addSeconds(60 * m);
  }

  /**
   * Método: substractMinutes
   * Propósito: resta minutos a un objeto Time.
   * 
   * @param m cantidad de minutos a restar en el objeto Time.
   */
  public void substractMinutes(int m) {
    this.substractSeconds(60 * m);
  }

  /**
   * Método: addHours
   * Propósito: suma horas a un objeto Time.
   * 
   * @param h cantidad de horas a sumar en el objeto Time.
   */
  public void addHours(int h) {
    this.addSeconds(3600 * h);
  }

  /**
   * Método: substractMinutes
   * Propósito: resta horas a un objeto Time.
   * 
   * @param h cantidad de horas a restar en el objeto Time.
   */
  public void substractHours(int h) {
    this.substractSeconds(3600 * h);
  }

  // Ejercicio 1.c) Devolver una cadena con el tiempo almacenado
  /**
   * Método: toString
   * Propósito: Devuelve una cadena con el tiempo almacenado, de forma que si lo
   * que hay es (10, 35, 5) la cadena resultante sea 10h 35m 5s.
   */
  public String toString() {
    return Integer.toString(this.hour) + "h " + Integer.toString(this.minute) + "m "
        + Integer.toString(this.second) + "s";
  }
}
