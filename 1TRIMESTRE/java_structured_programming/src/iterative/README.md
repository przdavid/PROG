# Ejercicios de estructuras repetitivas
_Tanda de ejercicios correspondiente al tema 5 del libro **Aprende Java con ejercicios**._

Realizado por: **David Pérez Ruiz**.

---

## ✏ Ejercicio 01
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle
_for_.

---

## ✏ Ejercicio 02
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle
_while_.

---

## ✏ Ejercicio 03
Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle
_do-while_.

---

## ✏ Ejercicio 04
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle _for_.

---

## ✏ Ejercicio 05
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle _while_.

---

## ✏ Ejercicio 06
Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás
utilizando un bucle _do-while_.

---

## ✏ Ejercicio 07
Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras generado al azar. El programa nos pedirá la combinación
para abrirla. Si no acertamos, se nos mostrará el mensaje
_"Lo siento, esa no es la combinación"_ y si acertamos se nos dirá
_"La caja fuerte se ha abierto satisfactoriamente"_.
Tendremos cuatro oportunidades para abrir la caja fuerte.

---

## ✏ Ejercicio 08
Muestra la tabla de multiplicar de un número introducido por teclado.

---

## ✏ Ejercicio 09
Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
la salvedad de que el anterior estaba limitado a números de 5 dígitos como
máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
esta manera, la única limitación en el número de dígitos la establece el tipo de
dato que se utilice (_int_ o _long_).

---

## ✏ Ejercicio 10
Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.

---

## ✏ Ejercicio 11
Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.

---

## ✏ Ejercicio 12
Escribe un programa que muestre los n primeros términos de la serie de
Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe
introducir por teclado.

---

## ✏ Ejercicio 13
Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.

---

## ✏ Ejercicio 16
Escribe un programa que diga si un número introducido por teclado es o no
primo. Un número primo es aquel que sólo es divisible entre él mismo y la
unidad.

---

## ✏ Ejercicio 22
Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.

---

## ✏ Ejercicio 23
Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.

---

## ✏ Ejercicio 28
Escribe un programa que calcule el factorial de un número entero leído por
teclado.

**EJEMPLO:**
```
Por favor, introduzca un número entero: 6
6! = 720
```

---

## ✏ Ejercicio 31
Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.

**EJEMPLO:**
```
Introduzca la altura de la L: 5

*
*
*
*
* * *
```

---

## ✏ Ejercicio 33
Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

**EJEMPLO 1:**
```
Introduzca la altura de la U: 5

*     *
*     *
*     *
*     *
 * * *
```

**EJEMPLO 2:**
```
Introduzca la altura de la U: 4

*   *
*   *
*   *
 * *
```

---

## ✏ Ejercicio 36
Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
_long_ en lugar de _int_ ya que el primero admite números más largos.

**EJEMPLO 1:**
```
Por favor, introduzca un número entero positivo: 678
El 678 no es capicúa.
```

**EJEMPLO 2:**
```
Por favor, introduzca un número entero positivo: 2019102
El 2019102 es capicúa.
```

---

## ✏ Ejercicio 37
Realiza un conversor del sistema decimal al sistema de _"palotes"_.

**EJEMPLO:**
```
Por favor, introduzca un número entero positivo: 47021
El 47021 en decimal es el | | | | - | | | | | | | - - | | - | en el sistema de palotes.
```

---

## ✏ Ejercicio 48
Realiza un programa que diga los dígitos que aparecen y los que no aparecen
en un número entero introducido por teclado. El orden es el que se muestra en
los ejemplos. Utiliza el tipo _long_ para que el usuario pueda introducir números
largos.

**EJEMPLO 1:**
```
Introduzca un número entero: 67706
Dígitos que aparecen en el número: 0 6 7
Dígitos que no aparecen: 1 2 3 4 5 8 9
```

**EJEMPLO 2:**
```
Introduzca un número entero: 555
Dígitos que aparecen en el número: 5
Dígitos que no aparecen: 1 2 3 4 6 7 8 9
```

**EJEMPLO 3:**
```
Introduzca un número entero: 9876543210
Dígitos que aparecen en el número: 0 1 2 3 4 5 6 7 8 9
Dígitos que no aparecen:
```

**EJEMPLO 4:**
```
Introduzca un número entero: 13247721
Dígitos que aparecen en el número: 1 2 3 4 7
Dígitos que no aparecen: 0 5 6 8 9
```

---

## ✏ Ejercicio 67
Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos.

**EJEMPLO 1:**
```
Introduzca el número de escalones: 4
Introduzca la altura de cada escalón: 2
****
****
********
********
************
************
****************
****************
```

**EJEMPLO 2:**
```
Introduzca el número de escalones: 3
Introduzca la altura de cada escalón: 3
****
****
****
********
********
********
************
************
************
```

---

## ✏ Ejercicio 68
Escribe un programa que pida un número por teclado y que luego lo _"disloque"_
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa _long_ en lugar de int donde sea necesario para admitir números
largos.

**EJEMPLO 1:**
```
Por favor, introduzca un número: 9402
Dislocando el 9402 sale el 8513.
```

**EJEMPLO 2:**
```
Por favor, introduzca un número: 870958422
Dislocando el 870958422 sale el 961849533.
```

**EJEMPLO 3:**
```
Por favor, introduzca un número: 137
Dislocando el 137 sale el 26
```

---

## 📄 Licencia
[_Aprende Java con ejercicios_, Luis José Sánchez](https://github.com/LuisJoseSanchez/aprende-java-con-ejercicios)
