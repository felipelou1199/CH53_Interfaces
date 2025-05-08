#Interfaces
**Ejercicio de interfaces con Java**

Este ejercicio demuestra cómo las interfaces en Java permiten que un objeto tenga más de una forma, facilitando la reutilización del código.

En el ejercicio se crearon diferentes clases, cada una representando una figura geométrica, con propiedades como lados, altura y bases (con una excepción).

Se implementó una interfaz que define métodos para obtener el nombre, el perímetro y el área, ya que todas las figuras geométricas pueden proporcionar estos datos. Esto fue posible mediante el uso de getters y setters para cada una de las figuras.

La única excepción fue el trapecio, ya que para esta figura se necesita una base mayor y una base menor. Por ello, al crear un objeto de tipo trapecio, en lugar de pedir tres parámetros, se solicitan: lado, base menor, base mayor y altura.

