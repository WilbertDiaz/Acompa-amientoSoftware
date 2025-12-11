# Solución: Template Method Pattern

## Descripción de la Solución
Para resolver el problema de la duplicación de código y garantizar la consistencia en el proceso de preparación, hemos implementado el patrón Template Method. Este patrón define el esqueleto de un algoritmo en una operación, difiriendo algunos pasos a las subclases.

### Componentes de la Arquitectura
1. HotBeverage (Clase Abstracta):
   - Define el método plantilla prepareRecipe(). Lo marcamos como final para proteger la integridad del algoritmo (nadie puede alterar el orden de los pasos).
   - Implementa los métodos concretos boilWater() y pourInCup() que son compartidos por todas las bebidas.
   - Declara los métodos abstractos brew() y addCondiments() que deben ser personalizados.

2. Clases Concretas (Tea / Coffee):
   - Solo se preocupan por implementar los detalles específicos de su tipo.
   - Tea implementa brew() como "Infusionando el té" y addCondiments() como "Agregando limón".
   - Coffee implementa brew() como "Filtrando el café" y addCondiments() como "Agregando azúcar y leche".

### Por qué usamos este enfoque
- Reutilización de Código: La lógica de hervir agua y servir se escribió una sola vez en la clase padre.
- Inversión de Control (Hollywood Principle): La clase padre llama a los métodos de las subclases, manteniendo el control del flujo general en la clase base.
- Estandarización: Garantizamos que ninguna bebida se salte pasos críticos como hervir el agua, ya que el método principal no se puede sobrescribir.

## Salida de Ejecución
Al ejecutar el programa, vemos cómo ambas bebidas siguen la misma estructura:

--- Preparando Té ---


--- Preparando Café ---
