package exercises1to14;

/**
 * <p>Colección de funciones matemáticas. Peterenecen a los ejercicios 1 a 14 del tema 8 del libro
 * <em>Aprende Java con ejercicios</em>.</p>
 * @author David Pérez Ruiz
 */

public class MathematicsFunctions {
  /**
   * <p><strong>Función:</strong></br>palindromicNumber</p>
   * <p><strong>Propósito:</strong></br>devuelve <em>true</em> si el número que se pasa por
   * parámetro es capicía o <em>false</em> si no lo es.</p>
   * @param number Número entero a comprobar si es capicúa.
   * @return <em>true</em> si <em>number</em> es capicúa, <em>false</em> si no lo es.
   */
  
  // Ejercicio 1
  public static boolean palindromicNumber(int number) {
    // Comprueba si el número es igual al nḿero dado la vuelta
    if (number == reverseNumber(number)) {
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>primeNumber</p>
   * <p><strong>Propósito:</strong></br>comprueba si un número es primo.</p>
   * @param number Número entero a comprobar si es primo.
   * @return <em>true</em> si <em>number</em> es primo, <em>false</em> si no lo es.
   */
  
  // Ejercicio 2
  public static boolean primeNumber(int number) {
    boolean prime = false;
    
    // Si el número es negativo, 0 o 1, no es primo
    if (number < 2) {
      prime = false;
    // Si el número es 2 o 3, es primo 
    } else if (number == 2 || number == 3) {
      prime = true;
    // Comprobar para cualquier número mayor que 3
    } else {
      for (int i = 2; i <= (int)(Math.round(Math.sqrt(number))+1); i++) {
        // Si el número tiene al menos un divisor, es compuesto
        if (number%i == 0) {
          prime = false;
          break;
        } else {
          prime = true;
        }
      }
    }
    
    return prime;
  }
  
  /**
   * <p><strong>Función:</strong></br>nextPrime</p>
   * <p><strong>Propósito:</strong></br>devuelve el siguiente primo al número pasado por
   * parámetro</p>
   * @param number Número entero.
   * @return siguiente número primo a  <em>number</em>.
   */
  
  // Ejercicio 3
  public static int nextPrime(int number) {
    // Incrementar el número hasta encontrar un número primo
    do {
      number++;
    } while (!primeNumber(number));
    
    return number;
  }
  
  /**
   * <p><strong>Función:</strong></br>calculateExponentiation</p>
   * <p><strong>Propósito:</strong></br>mediante una base y un exponente, calcular la potencia.</p>
   * @param base Número entero, base de la potencia
   * @param exponent Número entero, exponente de la potencia
   * @return resultado de <em>base</em> elevado a <em>exponent</em>.
   */
  
  // Ejercicio 4
  public static double calculateExponentation(int base, int exponent) {
    double power = 1;
    
    if (exponent < 0) {
      for (int i = 0; i < Math.abs(exponent); i++) {
        power *= base;
      }
      power = 1/power;
    } else if (exponent > 0) {
      for (int i = 0; i < exponent; i++) {
        power *= base;
      }
    }
    
    return power;
  }
  
  /**
   * <p><strong>Función:</strong></br>countDigits</p>
   * <p><strong>Propósito:</strong></br>contar cuántos dígitos tiene un número.</p>
   * @param number Número entero a contar cuántos dígitos tiene.
   * @return número de dígitos que tiene <em>number</em>.
   */
  
  // Ejercicio 5
  public static int countDigits(int number) {
    int digits = 0;
    
    if (number == 0) {
      digits = 1;
    } else {
      // Contar dígitos hasta que el número se vuelva 0
      do {
        number /= 10;
        digits++;
      } while(number > 0);
    }
    
    return digits;
  }
  
  /**
   * <p><strong>Función:</strong></br>reverseNumber</p>
   * <p><strong>Propósito:</strong></br>da la vuelta a un número.</p>
   * @param number Número entero a dar la vuelta.
   * @return <em>number</em> dado la vuelta.
   */
  
  // Ejercicio 6
  public static int reverseNumber(int number) {
    int reverse = 0;
    
    // El número dado la vuelta se obtiene de los sucesivos restos cuando es dividido entre 10
    do {
      reverse = (reverse*10) + (number%10);
      number /= 10;
    } while (number > 0);
    
    return reverse;
  }
  
  /**
   * <p><strong>Función:</strong></br>digitN</p>
   * <p><strong>Propósito:</strong></br>Devuelve el dígito en la posición n. Empieza contar por 0
   * y de izquierda a derecha.</p>
   * @param number Número entero.
   * @param position Número entero, posición del dígito deseaod.
   * @return dígito de <em>number</em> en la posición <em>position</em> o -1 si la posición está
   * fuera del rango de <em>number</em>.
   */
  
  // Ejercicio 7
  public static int digitN(int number, int position) {
    int digit = -1;
    int auxiliary = number;
    if (position < 0 || position > countDigits(number)) {
      // Devuelve un error si la posición está fuera del rango del número
      return digit;
    } else {
      // Busca el dígito en la posición deseada
      for(int i = 0; i < countDigits(number)-position; i++) {
        digit = auxiliary%10;
        auxiliary /= 10;
      }
      return digit;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>positionOfDigit</p>
   * <p><strong>Propósito:</strong></br>Devuelve la primera ocurrencia de un dígito en un número.
   * Si el dígito no está, devuelve -1.</p>
   * @param number Número entero
   * @param digit Número entero, dígito que se desea buscar.
   * @return posición de <em>digit</em> en <em>number</em> o -1 si <em>digit</em> no está en
   * <em>number</em> o si <em>digit</em> no es un dígito.
   */
  
  // Ejercicio 8
  public static int positionOfDigit(int number,int digit) {
    int position = -1;
    if (digit < 0 && digit > 9) {
      return position;
    } else {
      for (int i = countDigits(number); i >= 0; i--) {
        if (digitN(number, i) == digit) {
          position = i;
        }
      }
      return position;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>removeBehind</p>
   * <p><strong>Propósito:</strong></br>elimina n dígitos a un número por detrás.</p>
   * @param number Número entero, número original.
   * @param digits Número entero, cantidad de dígitos que se eliminarán por detrás.
   * @return número resultante de eliminar los dígitos o -1 si <em>digits</em> es mayor que la
   * cantidad de dígitos que tiene <em>number</em>.
   */
  
  // Ejercicio 9
  public static int removeBehind(int number, int digits) {
    if (countDigits(number) < digits) {
      // Devuelve un error si se intenta eliminar más digitos de los que el número tiene
      return -1;
    } else {
      // Elimina dígitos
      for (int i = 0; i < digits; i++) {
        number /= 10;
      }
      return number;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>removeFront</p>
   * <p><strong>Propósito:</strong></br>elimina n dígitos a un número delante.</p>
   * @param number Número entero, número original.
   * @param digits Número entero, cantidad de dígitos que se eliminarán delante.
   * @return número resultante de eliminar los dígitos o -1 si <em>digits</em> es mayor que la
   * cantidad de dígitos que tiene <em>number</em>.
   */
  
  // Ejercicio 10
  public static int removeFront(int number,int digits) {
    if (countDigits(number) < digits) {
      // Devuelve un error si se intenta eliminar más digitos de los que el número tiene
      return -1;
    } else {
      // Elimina dígitos
      number = reverseNumber(number);
      
      for (int i = 0; i < digits; i++) {
        number /= 10;
      }
      
      number = reverseNumber(number);
      
      return number;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>stickBehind</p>
   * <p><strong>Propósito:</strong></br>añade a un número un dígito por detrás.</p>
   * @param number Número entero, número original.
   * @param digit Número entero, dígito a añadir por detrás.
   * @return número formado por <em>number</em> y <em>digit</em> o -1 si <em>digit</em> tiene
   * más de un dígito.
   */
  
  // Ejercicio 11
  public static int stickBehind(int number, int digit) {
    if (digit < 0 || digit > 9) {
      // Devuelve un error si se intenta añadir más de un dígito
      return -1;
    } else {
      return joinNumbers(number, digit);
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>stickFront</p>
   * <p><strong>Propósito:</strong></br>añade a un número un dígito delante.</p>
   * @param number Número entero, número original.
   * @param digit Número entero, dígito a añadir delante.
   * @return número formado por <em>number</em> y <em>digit</em> o -1 si <em>digit</em> tiene
   * más de un dígito.
   */
  
  // Ejercicio 12
  public static int stickFront(int number, int digit) {
    if (digit < 0 || digit > 9) {
      // Devuelve un error si se intenta añadir más de un dígito
      return -1;
    } else {
      return joinNumbers(digit, number);
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>piceOfNumber</p>
   * <p><strong>Propósito:</strong></br>toma un trozo del número desde una posición inicial a una
   * final.</p>
   * @param number Número entero, número original.
   * @param initialPosition Número entero, posición inicial del trozo del número.
   * @param finalPosition Número entero, posición final del trozo del número.
   * @return trozo del número o -1 si <em>initialPosition</em> y <em>finalPosition</em> está fuera
   * del rango del número.
   */
  
  // Ejercicio 13
  public static int piceOfNumber(int number, int initialPosition, int finalPosition) {
    if (finalPosition > countDigits(number) || initialPosition > finalPosition) {
      return -1;
    } else {
      number = removeBehind(number, countDigits(number)-finalPosition-1);
      number = removeFront(number, initialPosition);
      
      return number;
    }
  }
  
  /**
   * <p><strong>Función:</strong></br>joinNumbers</p>
   * <p><strong>Propósito:</strong></br>une dos números para formar otro.</p>
   * @param number1 Número entero, primera parte del número.
   * @param number2 Número entero, segunda parte del número.
   * @return número formado por <em>number1</em> y <em>number2</em>.
   */
  
  // Ejercicio 14
  public static int joinNumbers(int number1, int number2) {
    return (number1 * (int)calculateExponentation(10, countDigits(number2))) + number2;
  }
}
