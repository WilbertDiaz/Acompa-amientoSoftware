## Contexto
Estamos modelando la preparación de bebidas calientes: Café y Té. Al analizar el proceso, notamos que ambas comparten pasos casi idénticos (hervir agua, servir en taza) pero difieren en otros (infusionar vs colar, agregar limón vs agregar leche).
## Problema 
Duplicación de Código: Si implementamos `Coffee` y `Tea` por separado sin abstracción, repetiremos la lógica de hervir agua y servir. Si cambiamos la forma de hervir agua, tendríamos que cambiarlo en dos lugares.
## La Solución: -Template Method-
Definimos el esqueleto del algoritmo en una clase base abstracta, implementando los pasos comunes y dejando los pasos específicos como métodos abstractos que las subclases deben implementar.
## Beneficios 
Reutilización de código: La lógica común está en un solo lugar 

Control de Inversión: La clase padre llama a las operaciones de las clases hijas.

Estandarización: Garantiza que el algoritmo siga siempre la misma secuencia.
