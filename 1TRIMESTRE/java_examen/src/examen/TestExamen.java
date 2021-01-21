package examen;
import examen.FuncionesExamen;
import java.util.Scanner;

/**
 * Menú para operar las funciones de FuncionesExamen.
 * @author David Pérez Ruiz
 * Fecha: 14/12/2020
 */

public class TestExamen {
  public static void main(String[] args) {
    // Declaración de variables
    Scanner s = new Scanner(System.in);
    int[][] notas = new int [15][5];
    String[] alumnos = {"Alumno 1", "Alumno 2", "Alumno 3", "Alumno 4", "Alumno 5",
        "Alumno 6", "Alumno 7", "Alumno 8", "Alumno 9", "Alumno 10",
        "Alumno 11", "Alumno 12", "Alumno 13", "Alumno 14", "Alumno 15"};
    int opcion;
    boolean continuar = true;
    int ejercicio;
    int numAlumno;

    // Generar menú
    do {
      opcion = menu();

      // Limpiar la pantalla y mostrar la opción seleccionada
      mostrarOpcion(opcion);

      // Ejecutar la opción seleccionada
      switch (opcion) {
        case 1:                                                  // generaNotas
          notas = FuncionesExamen.generaNotas();
          break;
        case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
          // Antes de realizar cualquier función, debe generar primero la tabla
          if (FuncionesExamen.compruebaTablaVacia(notas)) {
            System.out.println("\nPrimero debe generar las notas de los estudiantes.\n");
          } else {
            switch (opcion) {
              case 2:                                            // numEjerciciosEstudiante
                do {
                  System.out.print("Introduzca el número de lista del alumno: ");
                  numAlumno = s.nextInt();
                } while (numAlumno < 1 || numAlumno > 15);
                System.out.printf("Número de ejercicios entregados por %s: %d.\n", alumnos[numAlumno-1],
                    FuncionesExamen.numEjerciciosEstudiante(notas, numAlumno));
                break;
              case 3:                                            // mediaEjercicios
                do {
                  System.out.print("Introduzca el número de lista del alumno: ");
                  numAlumno = s.nextInt();
                } while (numAlumno < 1 || numAlumno > 15);
                System.out.printf("La media de %s es de %.2f.\n", alumnos[numAlumno-1],
                    FuncionesExamen.mediaEjercicios(notas, numAlumno));
                break;
              case 4:                                            // alumnosAprobados
                System.out.printf("Número de alumnos aprobados: %d.\n", FuncionesExamen.alumnosAprobados(notas));
                break;
              case 5:                                            // numEjerciciosPresentados
                do {
                  System.out.print("Introduzca el número del ejercicio: ");
                  ejercicio = s.nextInt();
                } while (ejercicio < 1 || ejercicio > 5);
                System.out.printf("Número de alumnos que han presentado el ejercicio %d: %d.\n", ejercicio,
                    FuncionesExamen.numEjerciciosPresentados(notas, ejercicio));
                break;
              case 6:                                            // mediaPresentados
                do {
                  System.out.print("Introduzca el número del ejercicio: ");
                  ejercicio = s.nextInt();
                } while (ejercicio < 1 || ejercicio > 5);
                System.out.printf("La media de los alumnos que entregaron el ejercicio %d es %.2f.\n",
                    ejercicio, FuncionesExamen.mediaPresentados(notas, ejercicio));
                break;
              case 7:                                            // notaMasAlta
                do {
                  System.out.print("Introduzca el número del ejercicio: ");
                  ejercicio = s.nextInt();
                } while (ejercicio < 1 || ejercicio > 5);
                System.out.printf("La nota más alta del ejercicio %d es %d\n", ejercicio,
                    FuncionesExamen.notaMasAlta(notas, ejercicio));
                break;
              case 8:                                            // notaMasBaja
                do {
                  System.out.print("Introduzca el número del ejercicio: ");
                  ejercicio = s.nextInt();
                } while (ejercicio < 1 || ejercicio > 5);
                System.out.printf("La nota más baja del ejercicio %d es %d\n", ejercicio,
                    FuncionesExamen.notaMasBaja(notas, ejercicio));
                break;
              case 9:                                            // mostrarRelacion
                FuncionesExamen.mostrarRelacion(alumnos, notas);
                break;
            }
          }
          break;
        case 10:                                                 // salir 
          continuar = false;
          break;
        default:                                                 // error
          System.out.println("Error: opción incorrecta.");
      }
      // Limpia la pantalla en caso de que el usuario continúe
      if (opcion != 10) {
        clear();
      }

    } while (continuar);
  }

  /**
   * Función: menu
   * Propósito: muestra un menú y toma la opción escogida por el usuario.
   * @return opción escogida por el usuario.
   */

  public static int menu() {
    // Mostrar menu
    System.out.println();
    System.out.println("╔═════════════════════════════════════════════════════════════════╗");
    System.out.println("║                              MENÚ                               ║");
    System.out.println("╠════╦════════════════════════════════════════════════════════════╣");
    System.out.println("║ 1  ║ Generar calificaciones.                                    ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 2  ║ Mostrar número de ejercicios entregados por un estudiante. ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 3  ║ Mostrar la media de los ejercicios de un estudiante.       ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 4  ║ Mostrar la cantidad de estudiantes que han entregado todos ║");
    System.out.println("║    ║ los ejercicios y tienen una media igual o superior a 5.    ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 5  ║ Número de estudiantes que han entregado un ejercicio.      ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 6  ║ Nota media de un ejercicio obtenida por los estudiantes    ║");
    System.out.println("║    ║ que lo presentaron.                                        ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 7  ║ Mostrar la nota más alta de un ejercicio.                  ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 8  ║ Mostrar la nota más baja de un ejercicio.                  ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 9  ║ Mostrar la relación de los estudiantes y sus notas.        ║");
    System.out.println("╠════╬════════════════════════════════════════════════════════════╣");
    System.out.println("║ 10 ║ Salir.                                                     ║");
    System.out.println("╚════╩════════════════════════════════════════════════════════════╝");

    // Toma la elección del usuario
    Scanner s = new Scanner(System.in);
    System.out.print("\nSelecciona una opción: ");
    return s.nextInt();
  }

  /**
   * Función: mostrarOpcion
   * Propósito: mostrar la opción escogida por el usuario.
   */

  public static void mostrarOpcion(int option) {
    System.out.print("\u001b[2J");
    switch (option) {
      case 1:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 1  ║ Generar calificaciones.                                    ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 2:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 2  ║ Mostrar número de ejercicios entregados por un estudiante. ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 3:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 3  ║ Mostrar la media de los ejercicios de un estudiante.       ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 4:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 4  ║ Mostrar la cantidad de estudiantes que han entregado todos ║");
        System.out.println("║    ║ los ejercicios y tienen una media igual o superior a 5.    ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 5:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 5  ║ Número de estudiantes que han entregado un ejercicio.      ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 6:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 6  ║ Nota media de un ejercicio obtenida por los estudiantes    ║");
        System.out.println("║    ║ que lo presentaron.                                        ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 7:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 7  ║ Mostrar la nota más alta de un ejercicio.                  ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 8:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 8  ║ Mostrar la nota más baja de un ejercicio.                  ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      case 9:
        System.out.println("╔════╦════════════════════════════════════════════════════════════╗");
        System.out.println("║ 9  ║ Mostrar la relación de los estudiantes y sus notas.        ║");
        System.out.println("╚════╩════════════════════════════════════════════════════════════╝");
        break;
      default:
        System.out.println();
    }
  }

  /**
   * Función: clear
   * Propósito: limpia la pantalla tras pulsar una tecla.
   */

  public static void clear() {
    Scanner s = new Scanner(System.in);
    System.out.print("Pulsa cualquier tecla para continuar...");
    s.nextLine();
    System.out.print("\u001b[2J");
  }
}
