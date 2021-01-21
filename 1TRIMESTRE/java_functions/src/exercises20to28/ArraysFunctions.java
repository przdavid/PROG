package exercises20to28;

/**
 * <p>Colección de funciones de arrays. Peterenecen a los ejercicios 20 a 28 del tema 8 del libro
 * <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class ArraysFunctions {
  /**
   * <p><strong>Función:</strong></br>showArrayInt</p>
   * <p><strong>Propósito:</strong></br>muestra el contenido de un array.</p>
   * @param array Array de números enteros
   * @return contenido de <em>array</em>.
   */
  
  public static void showArrayInt(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
  
  /**
   * <p><strong>Función:</strong></br>generateArrayInt</p>
   * <p><strong>Propósito:</strong></br>genera un array de  números enteros aleatorios cuyo tamaño
   * e intervalo se pasan por parámetro.</p>
   * @param size Número entero, tamaño del array.
   * @param minNumber Número entero, menor número aleatorio generado.
   * @param maxNumber Número entero, mayor número aleatorio generado.
   * @return array de números enteros de tamaño <em>size</em>.
   */
  
  // Ejercicio 20
  public static int[] generateArrayInt(int size, int minNumber, int maxNumber) {
    // Inicializar array
    int[] array = new int[size];
    
    // Llenar array con números aleatorios del intervalo definido
    for (int i = 0; i < size; i++) {
      array[i] = (int)(minNumber + (Math.random() * (maxNumber - minNumber + 1)));
    }
    
    return array;
  }
  
  /**
   * <p><strong>Función:</strong></br>minimumArrayInt</p>
   * <p><strong>Propósito:</strong></br>devuelve el valor mínimo del array pasado por parámetro.</p>
   * @param array Array de números enteros.
   * @return el mínimo valor que hay en <em>array</em>.
   */
  
  // Ejercicio 21
  public static int minimumArrayInt(int[] array) {
    // Inicializar el valor mínimo
    int minNumber = Integer.MAX_VALUE;
    
    // Buscar el valor mínimo del array
    for(int i = 0; i < array.length; i++) {
      if (array[i] < minNumber) {
        minNumber = array[i];
      }
    }
    
    return minNumber;
  }
  
  /**
   * <p><strong>Función:</strong></br>maximumArrayInt</p>
   * <p><strong>Propósito:</strong></br>devuelve el valor máximo del array pasado por parámetro.</p>
   * @param array Array de números enteros.
   * @return el máximo valor que hay en <em>array</em>.
   */
  
  // Ejercicio 22
  public static int maximumArrayInt(int[] array) {
    // Inicializar el valor máximo
    int maxNumber = Integer.MIN_VALUE;
    
    // Buscar el valor máximo del array
    for(int i = 0; i < array.length; i++) {
      if (array[i] > maxNumber) {
        maxNumber = array[i];
      }
    }
    
    return maxNumber;
  }
  
  /**
   * <p><strong>Función:</strong></br>meanArrayInt</p>
   * <p><strong>Propósito:</strong></br>devuelve la media del array pasado por parámetro.</p>
   * @param array Array de números enteros.
   * @return media de los valores de <em>array</em>.
   */
  
  // Ejercicio 23
  public static double meanArrayInt(int[] array) {
    // Inicializar media
    double mean = 0;
    
    // Realizar el sumatorio de todos los valores del array
    for(int i = 0; i < array.length; i++) {
      mean += array[i];
    }
    
    // Calcular la media
    mean /= (double)array.length;
    
    return mean;
  }
  
  /**
   * <p><strong>Función:</strong></br>isInArrayInt</p>
   * <p><strong>Propósito:</strong></br>indica si un número está o no en el array.</p>
   * @param array Array de números enteros.
   * @param number Número entero, número a buscar en el array.
   * @return <em>true</em> si el número está en el array, <em>false</em> si no lo está.
   */
  
  // Ejercicio 24
  public static boolean isInArrayInt(int[] array, int number) {
    // Inicializar indicador suponiendo que es falso desde el principio
    boolean isNumber = false;
    
    // Buscar número
    for(int i = 0; i < array.length; i++) {
      // Si el número está en el array, el indicador es verdadero y se acaba el ciclo
      if (array[i] == number) {
        isNumber = true;
        break;
      }
    }
    
    return isNumber;
  }
  
  /**
   * <p><strong>Función:</strong></br>firstOccurrenceArrayInt</p>
   * <p><strong>Propósito:</strong></br>muestra la posición de la primera ocurrencia de un número
   * en el array.</p>
   * @param array Array de números enteros.
   * @param number Número entero, número a buscar en el array.
   * @return posición de <em>number</em> en <em>array</em> o -1 si el número no está.
   */
  
  // Ejercicio 25
  public static int firstOccurrenceArrayInt (int[] array, int number) {
    int position = -1;
    
    // Buscar la primera ocurrencia del número
    for (int i = 0; i < array.length; i++) {
      if (array[i] == number) {
        position = i;
        break;
      }
    }
    
    return position;
  }
  
  /**
   * <p><strong>Función:</strong></br>reverseArrayInt</p>
   * <p><strong>Propósito:</strong></br>da la vuelta a un array.</p>
   * @param array Array de números enteros.
   * @return <em>array</em> dado la vuelta.
   */
  
  // Ejercicio 26
  public static int[] reverseArrayInt(int[] array) {
    int[] reverseArray = new int[array.length];
    
    // Dar a los valores de reverseArray los de array desde el final hasta el principio
    for (int i = 0; i < array.length; i++) {
      reverseArray[i] = array[array.length - i - 1];
    }
    
    return reverseArray;
  }
  
  /**
   * <p><strong>Función:</strong></br>rotateRightArrayInt</p>
   * <p><strong>Propósito:</strong></br>rota los valores del array una posición a la derecha.</p>
   * @param array Array de números enteros.
   * @return <em>array</em> con los valores una posición a la derecha.
   */
  
  public static int[] rotateRightArrayInt(int[] array) {
    int[] rightArray =  new int[array.length];
    int aux = array[array.length-1];  // Variable auxiliar para guardar el último dato
    
    // Colocar los datos en el nuevo array una posición a la derecha con respecto al original
    for (int i = 1; i < array.length; i++) {
      rightArray[i] = array[i-1];
    }
    
    // Colocar el último dato el primero en el array rotado
    rightArray[0] = aux;
    
    return rightArray;
  }
  
  /**
   * <p><strong>Función:</strong></br>rotateNRightArrayInt</p>
   * <p><strong>Propósito:</strong></br>rota los valores del array n posiciones a la derecha.</p>
   * @param array Array de números enteros.
   * @param position Número entero, posiciones que rotará el array.
   * @return <em>array</em> con los valores <em>position</em> posiciones a la derecha.
   */
  
  // Ejercicio 27
  public static int[] rotateNRightArrayInt(int[] array, int position) {
    
    // Llamar position veces a la función rorateRightArrayInt
    for (int i = 0; i < position; i++) {
      array = rotateRightArrayInt(array);
    }
    
    return array;
  }
  
  /**
   * <p><strong>Función:</strong></br>rotateLeftArrayInt</p>
   * <p><strong>Propósito:</strong></br>rota los valores del array una posición a la izquierda.</p>
   * @param array Array de números enteros.
   * @return <em>array</em> con los valores una posición a la izquierda.
   */
  
  public static int[] rotateLeftArrayInt(int[] array) {
    int[] leftArray =  new int[array.length];
    int aux = array[0];  // Variable auxiliar para guardar el primer dato
    
    // Colocar los datos en el nuevo array una posición a la izquierda con respecto al original
    for (int i = 0; i < array.length-1; i++) {
      leftArray[i] = array[i+1];
    }
    
    // Colocar el último dato el primero en el array rotado
    leftArray[array.length-1] = aux;
    
    return leftArray;
  }
  
  /**
   * <p><strong>Función:</strong></br>rotateNRightArrayInt</p>
   * <p><strong>Propósito:</strong></br>rota los valores del array n posiciones a la izquierda.</p>
   * @param array Array de números enteros.
   * @param position Número entero, posiciones que rotará el array.
   * @return <em>array</em> con los valores <em>position</em> posiciones a la izquierda.
   */
  
  // Ejercicio 27
  public static int[] rotateNLeftArrayInt(int[] array, int position) {
    
    // Llamar position veces a la función rorateRightArrayInt
    for (int i = 0; i < position; i++) {
      array = rotateLeftArrayInt(array);
    }
    
    return array;
  }
}
