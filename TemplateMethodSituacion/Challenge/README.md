# Challenge: Algoritmo de Preparación de Bebidas

## Contexto
Estás diseñando el software para una máquina dispensadora de bebidas calientes. La máquina ofrece dos productos principales: Café y Té.

Al analizar el procedimiento de preparación de ambas bebidas, notas que los pasos son sorprendentemente similares:
1. Hervir el agua.
2. Preparar la infusión (filtrar el café o remojar el té).
3. Servir en una taza.
4. Agregar condimentos (azúcar y leche para el café, limón para el té).

## El Problema
Si implementas las clases Coffee y Tea de forma independiente, estarás duplicando código. La lógica para "Hervir agua" y "Servir en taza" sería idéntica en ambas clases. 

Además, si en el futuro decides cambiar la forma de hervir el agua, tendrías que modificarlo en múltiples archivos. Necesitas una forma de centralizar la estructura del algoritmo pero permitiendo que cada bebida defina sus propios detalles específicos.

## Instrucciones del Reto
Tu tarea es refactorizar el código aplicando el Patrón de Diseño Template Method.

1. Crea una clase abstracta llamada HotBeverage.
2. Define un método prepareRecipe() que contenga la secuencia de pasos (el algoritmo). Este método debe ser final para evitar que las subclases cambien el orden de ejecución.
3. Implementa los pasos comunes (boilWater, pourInCup) directamente en la clase abstracta.
4. Define los pasos variables (brew, addCondiments) como métodos abstractos.
5. Crea las clases concretas Tea y Coffee que extiendan de HotBeverage e implementen solo los pasos específicos de cada una.

## Resultado Esperado
El cliente debe poder invocar el método prepareRecipe() en cualquiera de las bebidas y obtener la secuencia correcta de preparación, reutilizando el código común automáticamente.
