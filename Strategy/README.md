## Contexto
Un sistema de comercio electrónico necesita procesar pagos. Inicialmente solo aceptaba tarjetas de crédito, pero el negocio requiere agregar PayPal y métodos futuros.
## El Problema
Cada vez que se añade un método de pago, hay que modificar la clase principal, arriesgando errores.
## Solución: -Strategy-
Definimos una familia de algoritmos (estrategias de pago), encapsulamos cada uno en una clase separada y los hacemos intercambiables a través de una interfaz común.
## Componentes
PaymentStrategy (Interfaz): Contrato común para todos los pagos.
CreditCardStrategy PaypalStrategy Implementaciones concretas.
ShoppingCart (Contexto): Delega la ejecución del pago a la estrategia recibida.
## Beneficios 
+Principio Open/Closed: Podemos agregar BitcoinStrategy sin tocar el código del carrito.

+Eliminación de condicionales: Se remueven los bloques if-else complejos.

+Intercambiabilidad: Se puede cambiar el método de pago en tiempo de ejecución.

