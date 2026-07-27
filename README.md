# loops-java-simoneaa

# Descripción


Crea una clase que tenga la responsabilidad de crear la tabla de multiplicar de un número. Dado un número entero, n, devuelva su tabla de multiplicar (del 1 al 10). Cada múltiplo n * i (donde 1 <= i => 10) debe imprimirse en una nueva línea en la forma: n x i = resultado.

Ejemplo: dado n = 5  

Output:  
5 x 1 = 5  
5 x 2 = 10  
5 x 3 = 15  
5 x 4 = 20  
5 x 5 = 25  
5 x 6 = 30  
5 x 7 = 35  
5 x 8 = 40  
5 x 9 = 45  
5 x 10 = 50  

# Requisitos

- Java 21
- Maven 3.6.3 o superior

## Cómo ejecutar

**Compilar y ejecutar tests:**  
```
mvn clean test
```

**Ver reporte de cobertura:**  
```
mvn clean verify  
```

**Luego abrir target/site/jacoco/index.html en el navegador**

# Testing

<img src="loops/assets/coverage.jpg">

# Funcionamiento  

## TableInterface

Define el contrato que debe cumplir cualquier clase que genere tablas de multiplicar. Declara un único método createTable(int n) que devuelve una lista de strings con las líneas de la tabla. El uso de una interfaz permite cambiar la implementación sin afectar al resto del código (Abstracción).

```java
package com.loops.maven;

import java.util.List;

public interface TableInterface {
    public List<String> createTable(int n);
}
```

## MultiplicationTable

Lógica de negocio, implementa TableInterface. Contiene la lógica para generar la tabla de multiplicar de un número n del 1 al 10. Cada línea se construye con el formato "n x i = resultado" y se almacena en un ArrayList<String>. Esta clase no imprime nada, solo devuelve los datos (Single Responsibility).

```java
package com.loops.maven;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable implements TableInterface {

    public MultiplicationTable() {

    }

    public List<String> createTable(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
         
            result.add(n + " x " + i + " = " + (n*i));

        }

        return result;

    }

}
```

## TablePrinter

Se encarga de mostrar la tabla en consola. Tiene dos métodos:  

- formatTable(List<String>): une todas las líneas de la lista en un solo String, separadas por saltos de línea (\n). No imprime, solo formatea.

- printTable(List<String>): llama a formatTable y muestra el resultado por consola.

Separar el formateo de la impresión facilita los tests unitarios.  

```java
package com.loops.maven;

import java.util.List;

public class TablePrinter {
    
    public String formatTable(List<String> tabla) {
        return String.join("\n", tabla);
    }
    
    public void printTable(List<String> tabla) {
        System.out.print(formatTable(tabla));
    }
}
```

## App

Punto de entrada. Clase que contiene el método main. Orquesta las demás clases: crea una MultiplicationTable, genera la tabla de n, crea un TablePrinter e imprime el resultado. Es la clase que se ejecuta para lanzar el programa.

```java
package com.loops.maven;

import java.util.List;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        MultiplicationTable tabla = new MultiplicationTable();
        List<String> resultado = tabla.createTable(n);
        TablePrinter printer = new TablePrinter();
        printer.printTable(resultado);
    }

}
```

# Autora

Simone Ávila Arranz - Curso P5 Factoría F5
