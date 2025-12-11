# Challenge: Sistema de Pedidos de Hamburguesas

## Contexto
Estás desarrollando el módulo de cocina para un restaurante de hamburguesas gourmet. En este sistema, el objeto principal es la Hamburguesa (Burger). El problema radica en que una hamburguesa es un producto altamente configurable: puede tener diferentes tamaños, términos de cocción y una variedad de ingredientes opcionales como queso, tocino, lechuga y tomate.

## El Problema
Actualmente, el sistema intenta crear estas hamburguesas utilizando un único constructor con múltiples parámetros booleanos. 

El código actual luce así:
Burger orden = new Burger("Grande", "3/4", true, false, true, true);

Esto presenta varios problemas:
1. Es difícil de leer: nadie sabe qué significa el tercer "true" o el quinto "false" sin mirar la documentación.
2. Es propenso a errores: es fácil intercambiar accidentalmente el valor del queso con el de la lechuga.
3. El cliente (la clase Main) tiene demasiada responsabilidad sobre la composición exacta de los ingredientes.

## Instrucciones del Reto
Tu tarea es refactorizar este código aplicando el Patrón de Diseño Builder 

1. Implementa una clase BurgerBuilder que permita construir el objeto paso a paso de forma legible.
2. La clase Burger debe ser inmutable; una vez construida, no se le pueden agregar ingredientes.

## Resultado Esperado
El código cliente (Main) debe quedar limpio, sin valores booleanos visibles
