# Solución: Decorator Pattern

## Descripción de la Solución
Para resolver el problema de la explosión de clases, hemos aplicado el patrón Decorator. Este patrón nos permite agregar responsabilidades (ingredientes y costos) a objetos individuales de manera dinámica y transparente, utilizando composición en lugar de herencia.

### Componentes de la Arquitectura
1. Interfaz Coffee: Define el contrato básico (métodos getDescription y cost) que deben cumplir tanto las bebidas base como los decoradores.
2. SimpleCoffee (Componente Concreto): Representa la bebida base sin extras.
3. CoffeeDecorator (Decorador Base): Mantiene una referencia a un objeto Coffee. Delega las llamadas a este objeto, permitiendo que las subclases añadan comportamiento antes o después de la delegación.
4. Milk / Sugar (Decoradores Concretos): Extienden del decorador base. Modifican el método cost() para sumar su precio y getDescription() para agregar su nombre.

### Por qué usamos este enfoque
- Flexibilidad: Podemos agregar o quitar ingredientes en tiempo de ejecución.
- Escalabilidad: Si queremos agregar un nuevo ingrediente (ej. Vainilla), solo creamos una clase nueva (Vanilla.java) sin tocar el código existente ni crear combinaciones complejas.
- Principio Open/Closed: El sistema está abierto a la extensión (nuevos decoradores) pero cerrado a la modificación (no cambiamos el código del café base).

## Salida de Ejecución
Al ejecutar el programa principal (Main), se simula la creación de diferentes bebidas. La salida en consola muestra cómo la descripción y el costo se van acumulando correctamente según los "envoltorios" aplicados:

Café Simple $5.0
Café Simple, con Leche $6.5
Café Simple, con Leche, con Azúcar $7.0
