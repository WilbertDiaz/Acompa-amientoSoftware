## Contexto
Sistema de facturación para una cafetería. Una bebida base (Café) puede tener múltiples agregados (Leche, Azúcar, Chocolate, Canela, etc.).

## Problema 
**Explosión de Clases:** Si usamos herencia tradicional, tendríamos que crear clases para cada combinación posible: `CafeConLeche`, `CafeConLecheYAzucar`, `CafeConChocolate`, etc. Esto es ineficaz.

## Solución: -Decorator Pattern-
En lugar de heredar, envolvemos (decoramos) el objeto original. Los decoradores tienen el mismo tipo que el objeto que envuelven y añaden comportamiento (costo y descripción).

## Componentes
*`Coffee` (Interfaz):** El componente base.
*`SimpleCoffee`:** Implementación concreta base.
*`CoffeeDecorator`:** Clase base para los decoradores.
*`Milk` / `Sugar`:** Decoradores concretos que añaden funcionalidad.

## Beneficios
+Flexibilidad: Se pueden añadir responsabilidades a objetos individuales dinámicamente.

+Evita la herencia excesiva: Sustituye la herencia estática por composición.

+Principio Single Responsibility: Cada clase (Leche, Azúcar) se preocupa solo de su propia lógica.
