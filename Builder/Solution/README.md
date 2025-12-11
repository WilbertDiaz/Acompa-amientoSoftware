# Solución: Builder Pattern con Facade

## Descripción de la Solución
Para resolver la complejidad de la creación de objetos Burger y desacoplar al cliente de la lógica de preparación, hemos implementado una combinación del patrón Builder con una clase controladora (Waiter).

### 1. Patrón Builder (BurgerBuilder)
Hemos eliminado el constructor público complejo de la clase Burger. Ahora utilizamos BurgerBuilder, que permite configurar el objeto paso a paso mediante métodos con nombres explícitos como addCheese() o withCookingLevel(). Implementamos una "Interfaz Fluida" (Fluent Interface), lo que permite encadenar métodos en una sola línea, mejorando drásticamente la legibilidad.

### Por qué usamos este enfoque
Esta arquitectura separa completamente las responsabilidades:
- La clase Burger solo almacena datos 
- La clase BurgerBuilder sabe cómo ensamblar el objeto (Construcción).
- La clase Main solo se encarga de realizar pedidos (Cliente).

## Estructura de Archivos
- Main.java: Punto de entrada. Simula a un cliente haciendo pedidos 
- BurgerBuilder.java: Clase que construye el objeto paso a paso.
- Burger.java: El producto final inmutable.

## Salida de Ejecución
Al compilar y ejecutar el programa, se muestra la siguiente salida en consola, confirmando que las órdenes se han construido con los ingredientes correctos según el tipo elegido:

--- Orden 1: Una Clásica ---
Burger [size=Grande, cooking=Termino Medio, cheese=true, bacon=true, lettuce=true, tomato=true]

--- Orden 2: Una Vegetariana ---
Burger [size=Mediana, cooking=Bien Cocida, cheese=false, bacon=false, lettuce=true, tomato=true]

--- Orden 3: Una Sencilla ---
Burger [size=Pequeña, cooking=3/4, cheese=false, bacon=false, lettuce=false, tomato=false]
