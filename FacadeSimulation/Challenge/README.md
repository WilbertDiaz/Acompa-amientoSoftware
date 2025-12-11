# Challenge: Sistema de Cine en Casa Inteligente

## Contexto
Estás desarrollando el software de control para una sala de cine en casa de alta gama. El sistema consta de múltiples componentes de hardware independientes: un Amplificador de sonido, un Proyector de video y un sistema de Luces inteligentes.

## El Problema
Para realizar una tarea aparentemente simple como "ver una película", el usuario (o el código cliente) debe realizar una secuencia compleja de pasos manuales:
1. Encender las luces y luego atenuarlas al 10%.
2. Encender el proyector.
3. Configurar el proyector en modo "Pantalla Ancha".
4. Encender el amplificador.
5. Ajustar el volumen del amplificador a nivel 5.

Esto genera un alto acoplamiento. El código cliente conoce demasiados detalles sobre los subsistemas internos. Si cambiamos el proyector o el orden de encendido, todo el código cliente se rompe. Además, apagar el sistema requiere revertir todos estos pasos manualmente.

## Instrucciones del Reto
Tu tarea es simplificar la interfaz de uso aplicando el Patrón de Diseño Facade.

1. Modela los subsistemas complejos: Amplifier, Projector y Lights con sus métodos específicos (on, off, dim, setVolume, wideScreenMode).
2. Crea una clase HomeTheaterFacade que actúe como una fachada unificadora.
3. La fachada debe tener métodos de alto nivel como watchMovie() y endMovie().
4. El método watchMovie() debe encargarse de orquestar la secuencia correcta de encendido y configuración de todos los dispositivos.
5. El método endMovie() debe apagar todo en el orden correcto.

## Resultado Esperado
El código cliente (Main) no debe instanciar ni llamar a los métodos de los subsistemas directamente durante la ejecución de la película. Solo debe interactuar con la fachada para iniciar y terminar la sesión.
