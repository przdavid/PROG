# Ejercicios de funciones
_Tanda de ejercicios correspondiente al tema 8 del libro **Aprende Java con ejercicios**._

Realizado por: **David Pérez Ruiz**.

---

## ✏ Ejercicio 35
Crea una función con la siguiente cabecera:

```java
public static String convierteEnPalotes(int n)
```

Esta función convierte el número _n_ al sistema de palotes y lo devuelve en una
cadena de caracteres.

**EJEMPLO:**

```
El 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | en el sistema de palotes.
```

Utiliza esta función en un programa para comprobar que funciona bien. Desde la
función no se debe mostrar nada por pantalla, solo se debe usar _print_ desde
el programa principal.

---

## ✏ Ejercicio 35
Crea una función con la siguiente cabecera:

```java
public String convierteEnMorse(int n)
```

Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres.

**EJEMPLO:**

```
El 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en Morse.
```

Utiliza esta función en un programa para comprobar que funciona bien. Desde la
función no se debe mostrar nada por pantalla, solo se debe usar _print_ desde
el programa principal.


```
1 . _ _ _ _    6 _ . . . .
2 . . _ _ _    7 _ _ . . .
3 . . . _ _    8 _ _ _ . .
4 . . . . _    9 _ _ _ _ .
5 . . . . .    0 _ _ _ _ _
```

---

## ✏ Ejercicio 42
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.

**EJEMPLO 1:**
```
Introduzca la altura de la figura: 8
********
*     *
*    *
*   *
*  *
* *
**
*
```

**EJEMPLO 2:**
```
Introduzca la altura de la figura: 5
*****
*  *
* *
**
*
```

---

## ✏ Ejercicio 47
Define la función **convierteArrayEnString** con la siguiente cabecera:

```java
public static String convierteArrayEnString(int[] a)
```

Esta función toma como parámetro un array que contiene números y devuelve
una cadena de caracteres con esos números.

**EJEMPLO 1:**
```
a = { }

convierteArrayEnString(a) = ""
```

**EJEMPLO 2:**
```
a = { 8 }

convierteArrayEnString(a) = "8"
```

**EJEMPLO 3:**
```
a = { 6, 2, 5, 0, 1 }

convierteArrayEnString(a) = "62501"
```

---

## ✏ Ejercicio 47
Define la función **mezcla** con la siguiente cabecera:

```java
public static int[] mezcla(int[] a, int[] b)
```

Esta función toma dos arrays como parámetros y devuelve un array que es
el resultado de mezclar los números de ambos de forma alterna, se coge un
número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
longitudes diferentes; por tanto, si se terminan los números de un array se
terminan de coger todos los que quedan del otro.

**EJEMPLO 1:**
```
a = {8, 9, 0}
b = {1, 2, 3}

mezcla(a, b) = {8, 1, 9, 2, 0, 3 }
```

**EJEMPLO 2:**
```
a = {4, 3}
b = {7, 8, 9, 10}

mezcla(a, b) = {4, 7, 3, 8, 9, 10}
```

**EJEMPLO 3:**
```
a = {8, 9, 0, 3}
b = {1}

mezcla(a, b) = {8, 1, 9, 0, 3}
```

**EJEMPLO 4:**
```
a = { }
b = {1, 2, 3}

mezcla(a, b) = {1, 2, 3}
```

---

## 📄 Licencia
[_Aprende Java con ejercicios_, Luis José Sánchez](https://github.com/LuisJoseSanchez/aprende-java-con-ejercicios)
