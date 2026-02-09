Proyecto Auto
1. Definiciones Propias
Clase: Es un molde o plantilla que define las características y acciones de un objeto. En este proyecto, Auto es la clase que define qué tiene un auto (marca, modelo, color) y qué puede hacer (acelerar, frenar, encender).
Objeto: Es una instancia creada a partir de una clase. Por ejemplo, auto1 y auto2 son objetos de la clase Auto, cada uno con sus propios valores.
Atributo: Es una variable que pertenece a una clase y representa sus características. Ejemplos: marca, modelo, color, kilometraje, velocidad.
Método: Es una función que define las acciones que puede realizar un objeto. Ejemplos: mostrarInformacion(), encender(), acelera(), frena().
2. Guía de Uso
Compilar el proyecto:
bashmvn clean compile
Ejecutar el proyecto:
bashmvn exec:java -Dexec.mainClass="com.actividad.Main"
3. Reflexión
¿Por qué no usamos private?
En esta práctica no usamos private porque estamos aprendiendo los conceptos básicos de POO. Esto nos permite modificar directamente los atributos desde la clase Main sin complicaciones.
¿Cuándo usar private?
Sería necesario usar private en futuras implementaciones cuando queramos proteger los datos de la clase. Con private obligamos a usar métodos getter y setter, lo que permite validar los datos antes de asignarlos y protege la información de cambios no deseados. Esto se llama encapsulamiento y es una buena práctica de programación.
