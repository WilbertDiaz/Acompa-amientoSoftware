## Contexto
Un sistema de entretenimiento doméstico inteligente que consta de varios subsistemas complejos: Amplificador, Proyector, Luces, Reproductor, Pantalla, etc.
## Problema
Para realizar una tarea simple como "Ver una película", el cliente debe interactuar con todos los subsistemas individualmente, conociendo el orden correcto de encendido y configuración. Esto genera alto acoplamiento.
## Solución: -Facade-
Proporcionamos una interfaz (una "fachada") que simplifica el acceso a los subsistemas. La fachada encapsula la complejidad y expone métodos sencillos.
## Componentes
* **Subsistemas (Amplifier, Projector, Lights): Clases complejas independientes.
* **HomeTheaterFacade: La clase que coordina los subsistemas.
## Beneficios 
+Simplicidad: Reduce la complejidad para el cliente final.

+Desacoplamiento: El cliente no depende de los subsistemas internos; si cambiamos el proyector, solo modificamos la fachada.

+Organización: Estructura mejor las capas del sistema.
