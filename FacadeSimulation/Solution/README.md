# Solución: Facade Pattern

## Descripción de la Solución
Para resolver la complejidad de la gestión de múltiples dispositivos, hemos implementado el patrón Facade. Esta estructura proporciona una interfaz simplificada (una "fachada") para una biblioteca compleja de clases, frameworks o subsistemas.

### Componentes de la Arquitectura
1. Subsistemas (Clases Complejas):
   - Amplifier, Projector, Lights: Son las clases que realizan el trabajo real. No conocen la existencia de la fachada. Tienen interfaces granulares y específicas.
2. Facade (HomeTheaterFacade):
   - Mantiene referencias a los subsistemas.
   - Delega las peticiones del cliente a los objetos apropiados dentro de los subsistemas.
   - Coordina la secuencia de operaciones (encender luces -> encender proyector -> etc.).
3. Cliente (Main):
   - Interactúa exclusivamente con la fachada. No necesita conocer la complejidad del hardware subyacente.

### Por qué usamos este enfoque
- Desacoplamiento: El cliente no depende de los componentes internos. Si cambiamos el modelo del proyector, solo actualizamos la clase Facade, no el código del cliente.
- Simplicidad: Convertimos una interfaz compleja de múltiples pasos en una interacción de un solo botón ("Ver Película").
- Principio de Mínimo Conocimiento: El cliente solo habla con su "amigo inmediato" (la fachada) y no con los extraños (los subsistemas).

## Salida de Ejecución
Al ejecutar el programa, se observa cómo una sola llamada del cliente desencadena toda la orquestación de los dispositivos:

--- Preparando todo para ver la película ---

Amplificador encendido.

--- Apagando el cine en casa ---
