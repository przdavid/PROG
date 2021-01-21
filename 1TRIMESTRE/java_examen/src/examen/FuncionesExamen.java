package examen;

/**
 * Colección de funciones. Peterenecen a los ejercicios del examen del primer trimestre.
 * @author David Pérez Ruiz
 * Fecha: 14/12/2020
 */

public class FuncionesExamen {
  /**
   * Función: compruebaTablaVacia
   * Propósito: comprueba si el array bidimensional está vacío, es decir, todos los valores de
   * sus celdas son 0
   * @return true si el array está vacío, false si no lo está.
   */
  
  public static boolean compruebaTablaVacia(int[][] array) {
    int[][] vacio = new int[array.length][array[0].length];
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        if (vacio[i][j] != array[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
  
  /**
   * Ejercicio 1
   * Función: generaNotas
   * Propósito: genera aleatoriamente las calificaciones. Estas serán números enteros comprendidos
   * entre -1 y 10.
   * @return array de 15x5 elementos con notas generadas al azar.
   */
  
  public static int[][] generaNotas() {
    int[][] notas = new int [15][5];
    for (int i = 0; i < 15; i++) {
      for (int j = 0; j < 5; j++) {
        notas[i][j] = (int)(-2 + (Math.random()*13));
      }
    }
    return notas;
  }
  
  /**
   * Ejercicio 2
   * Función: numEjerciciosEstudiante
   * Propósito: muestra el número de ejercicios que ha entregado un estudiante.
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param alumno Número entero, número asociado al alumno cuya información se desea.
   * @return cantidad de ejercicios que ha entregado alumno.
   */
  
  public static int numEjerciciosEstudiante(int[][] notas, int alumno) {
    int cantidadEjercicios = 0;
    
    // Recorrer la columna de notas del alumno para ver cuántos ejercicios ha entregado
    for (int i = 0; i < notas[alumno-1].length; i++) {
      if (notas[alumno-1][i] != -1) {
        cantidadEjercicios++;
      }
    }
    
    return cantidadEjercicios;
  }
  
  /**
   * Ejercicio 3
   * Función: mediaEjercicios
   * Propósito: calcula la media de los ejercicios entregados por un alumno. Será 0 en caso de que
   * no haya entregado todos los ejercicios
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param alumno Número entero, número asociado al alumno cuya información se desea.
   * @return nota media del alumno.
   */
  
  public static double mediaEjercicios(int[][] notas, int alumno) {
    double media = 0;
    
    // Si no ha entregado todos los ejercicios, la media es de 0
    if (numEjerciciosEstudiante(notas, alumno) < 5) {
      return media;
    } else {
      for (int i = 0; i < notas[alumno-1].length; i++) {
        media += (double)(notas[alumno-1][i]);
      }
      media /= 5;
      return media;
    }
  }
  
  /**
   * Ejercicio 4
   * Función: alumnosAprobados
   * Propósito: muestra la cantidad de alumnos aprobados, es decir, aquellos que han entregado
   * todos los ejercicios y cuya nota media es igual o superior a 5
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @return cantidad de alumnos aprobados.
   */
  
  public static int alumnosAprobados(int[][] notas) {
    int aprobados = 0;
    
    for (int i = 1; i <= notas.length; i++) {
      if (numEjerciciosEstudiante(notas, i) == 5 && mediaEjercicios(notas, i) >= 5) {
        aprobados++;
      }
    }
    
    return aprobados;
  }
  
  /**
   * Ejercicio 5
   * Función: numEjerciciosPresentados
   * Propósito: muestra el número de alumnos que han entregado un ejercicio.
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param ejercicio Número entero, ejercicio del que se quiere saber cuántos alumnos lo han presentado.
   * @return alumnos que han presentado el ejercicio.
   */
  
  public static int numEjerciciosPresentados(int[][] notas, int ejercicio) {
    int presentados = 0;
    
    for (int i = 0; i < notas.length; i++) {
      if (notas[i][ejercicio-1] != -1) {
        presentados++;
      }
    }
    
    return presentados;
  }
  
  /**
   * Ejercicio 6
   * Función: mediaPresentados
   * Propósito: calcula la nota media de un ejercicio entre los alumnos que lo presentaron.
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param ejercicio Número entero, ejercicio del que se quiere saber cuántos alumnos lo han presentado.
   * @return nota media del ejercicio de los alumnos que lo presentaron.
   */
  
  public static double mediaPresentados(int[][] notas, int ejercicio) {
    double media = 0;
    
    for (int i = 0; i < notas.length; i++) {
      if (notas[i][ejercicio-1] != -1) {
        media += notas[i][ejercicio-1];
      }
    }
    
    media /= numEjerciciosPresentados(notas, ejercicio);
    return media;
  }
  
  /**
   * Ejercicio 7
   * Función: notaMasAlta
   * Propósito: muestra la nota más alta de un ejercicio.
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param ejercicio Número entero, ejercicio del que se quiere su nota máxima.
   * @return nota máxima del ejercicio de entre todos los alumnos.
   */
  
  public static int notaMasAlta(int[][] notas, int ejercicio) {
    int maxNota = Integer.MIN_VALUE;
    
    for (int i = 0; i < notas.length; i++) {
      if (notas[i][ejercicio-1] > maxNota) {
        maxNota = notas[i][ejercicio-1];
      }
    }
    
    return maxNota;
  }
  
  /**
   * Ejercicio 8
   * Función: notaMasBaja
   * Propósito: muestra la nota más baja de un ejercicio.
   * @param notas Array bidimensional de números enteros, notas de los alumnos.
   * @param ejercicio Número entero, ejercicio del que se quiere su nota mínima.
   * @return nota mínima del ejercicio de entre todos los alumnos.
   */
  
  public static int notaMasBaja(int[][] notas, int ejercicio) {
    int minNota = Integer.MAX_VALUE;
    
    for (int i = 0; i < notas.length; i++) {
      if (notas[i][ejercicio-1] < minNota) {
        minNota = notas[i][ejercicio-1];
      }
    }
    
    return minNota;
  }
  
  /**
   * Ejercicio 9
   * Función: mostrarRelacion
   * Propósito: muestra la relación de alumnos y sus notas.
   */
  
  public static void mostrarRelacion(String[] alumnos, int[][] notas) {
    System.out.print("         \t1\t2\t3\t4\t5\n");
    System.out.print("--------------------------------------------------\n");
    
    for (int i = 0; i < alumnos.length; i++) {
      // Mostrar nombre del alumno
      System.out.print(alumnos[i] + "\t");
      
      // Mostrar notas del alumno
      for (int j = 0; j < 5; j++) {
        System.out.print(notas[i][j] + "\t");
      }
      
      System.out.println();
    }
  }
}
