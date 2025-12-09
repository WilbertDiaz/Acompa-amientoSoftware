## Contexto
Estamos desarrollando un sistema de punto de venta para un restaurante. El objeto principal, la **Hamburguesa**, puede tener múltiples configuraciones (tamaño, queso, bacon, tomate, lechuga, etc.).
## El Problema
Intentar crear este objeto sin un patron probado puede llevar a errores comunes.
## La Solucion - Builder -
Separamos la construcción del objeto de su representación. Utilizamos una clase auxiliar BurgerBuilder que permite configurar la hamburguesa paso a paso utilizando una Interfaz Fluida.
- Burger: Producto final. Es inmutable para garantizar la integridad de los datos.
- BurgerBuilder: Clase constructora con métodos encadenables (.addCheese()).
## Beneficios 
+Legibilidad: El código cliente se explica por sí mismo.

+Inmutabilidad: El objeto final no puede ser modificado después de creado.

+Flexibilidad: Permite crear distintas representaciones del mismo objeto sin multiplicar el número de clases.
