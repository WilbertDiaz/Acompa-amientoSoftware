# Challenge: Sistema de Pagos en E-commerce

## Contexto
Estás desarrollando el módulo de "Checkout" para una tienda en línea. Los clientes agregan productos a un carrito de compras y, al finalizar, deben pagar el total acumulado. El negocio requiere flexibilidad para aceptar diferentes métodos de pago, ya que las opciones financieras cambian constantemente.

## El Problema
En una implementación ingenua, la clase ShoppingCart tiende a acumular toda la lógica de pago. Esto resulta en métodos gigantes con múltiples bloques if-else o switch para verificar si el usuario quiere pagar con tarjeta, con PayPal, con transferencia, etc.


## Instrucciones del Reto
Tu tarea es refactorizar el proceso de pago aplicando el Patrón de Diseño Strategy.

1. Define una interfaz común PaymentStrategy que declare el método pay(int amount).
2. Extrae la lógica específica de cada método de pago en clases separadas:
   - CreditCardStrategy: Debe requerir nombre y número de tarjeta.
   - PaypalStrategy: Debe requerir un correo electrónico.
3. Modifica la clase ShoppingCart para que no contenga lógica de pago. En su lugar, debe tener un método pay que reciba cualquier implementación de la estrategia como parámetro.
4. El carrito debe limitarse a calcular el total y delegar la ejecución del pago a la estrategia recibida.

## Resultado Esperado
El sistema debe permitir procesar la misma compra utilizando diferentes métodos de pago sin cambiar ni una sola línea de código de la clase ShoppingCart.
