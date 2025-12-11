# Challenge: Sistema de Facturación de Cafetería

## Contexto
Estás a cargo del sistema de punto de venta de una cafetería en crecimiento. El producto base es el café, pero el negocio se basa en la personalización: los clientes pueden agregar múltiples ingredientes extra a su bebida, como leche, azúcar, chocolate, crema batida, etc.

## El Problema
Actualmente, el sistema está diseñado utilizando herencia estática. Para cada combinación posible de ingredientes, se ha creado una clase diferente. Esto ha provocado una "explosión de clases" ingobernable.

El sistema tiene clases como:
- SimpleCoffee
- CoffeeWithMilk
- CoffeeWithSugar
- CoffeeWithMilkAndSugar
- CoffeeWithMilkAndChocolate

Si queremos agregar un nuevo ingrediente (por ejemplo, Canela), tendríamos que crear docenas de nuevas clases para cubrir todas las combinaciones posibles (con canela, con canela y leche, con canela y azúcar, etc.). Esto hace que el mantenimiento sea imposible.

## Instrucciones del Reto
Tu tarea es refactorizar este sistema eliminando la dependencia excesiva de la herencia y aplicando el Patrón de Diseño Decorator.

1. Define una interfaz común Coffee que tenga métodos para obtener la descripción y el costo.
2. Crea una implementación base (SimpleCoffee).
3. Implementa el patrón Decorator creando una clase base abstracta y decoradores concretos para cada ingrediente (Milk, Sugar).
4. Cada decorador debe "envolver" al objeto original, añadiendo su propio costo al total y su nombre a la descripción.
5. El sistema debe permitir anidar múltiples ingredientes dinámicamente (ejemplo: un café con doble leche y azúcar).

## Resultado Esperado
El cliente debe poder crear una bebida con cualquier combinación de ingredientes sin necesidad de que existan clases específicas para esas combinaciones en el código.
