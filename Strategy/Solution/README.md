# Solución: Strategy Pattern

## Descripción de la Solución
Para resolver el problema del acoplamiento en los métodos de pago, hemos implementado el patrón Strategy. Este patrón nos permite definir una familia de algoritmos (en este caso, formas de pagar), encapsular cada uno en una clase separada y hacerlos intercambiables.

### Componentes de la Arquitectura
1. PaymentStrategy (Interfaz): Es el contrato que garantiza que todos los métodos de pago tengan un método pay(). Esto permite polimorfismo.
2. Estrategias Concretas:
   - CreditCardStrategy: Implementa el pago simulado con tarjeta.
   - PaypalStrategy: Implementa el pago simulado con cuenta de correo.
3. ShoppingCart (Contexto): Es la clase que utiliza la estrategia. Calcula el costo total de los ítems agregados (addItem) y, al momento de pagar, simplemente delega la responsabilidad al objeto estrategia que se le pasa por parámetro.

### Por qué usamos este enfoque
- Principio Open/Closed: Si el negocio decide aceptar Criptomonedas mañana, solo creamos una clase CryptoStrategy. No necesitamos tocar ni recompilar la clase ShoppingCart.
- Separación de Intereses: El carrito se preocupa de los productos y los totales; las estrategias se preocupan de cómo procesar el dinero.
- Intercambiabilidad en tiempo de ejecución: El usuario puede decidir en el último segundo cómo pagar sin que eso afecte el estado del carrito.

## Salida de Ejecución
Al ejecutar la clase Main, simulamos dos escenarios de compra distintos. La salida en consola demuestra que el carrito delega correctamente la acción de pago a la implementación seleccionada
