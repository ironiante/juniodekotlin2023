package nulll

/**
 * En programación, null es un valor especial que se utiliza para representar la ausencia de un valor válido o la falta de un objeto.
 * Se utiliza comúnmente en lenguajes de programación que admiten la programación orientada a objetos.
 * Cuando una variable se establece en null, significa que no hace referencia a ningún objeto o valor válido en ese momento.
 * Es esencialmente una forma de indicar que la variable está vacía o no tiene ningún valor asignado.
 * Cuando se trabaja con valores null, es necesario tener precaución para evitar errores de NullPointerException (excepciones de puntero nulo).
 * Esto significa que si se intenta acceder o realizar operaciones en una variable que tiene un valor null, se producirá un error durante la ejecución
 * del programa. Para evitar esto, es común verificar si una variable es null antes de intentar acceder a ella o realizar operaciones en ella.
 */
fun main(){
    var name : String? = null //Aquí se declara una variable llamada name de tipo String?, lo que significa que puede contener una cadena o el valor null.
                              // Se inicializa con el valor null.
    println("ingrese su nombre:") //Esta línea imprime en la consola el mensaje "Ingrese su nombre:", solicitando al usuario que ingrese su nombre.
    val input = readLine()    // La función readLine() se utiliza para leer una línea de entrada del usuario desde la consola. La línea ingresada
                              // por el usuario se guarda en la variable input.
    if (input != null){       // Aquí se verifica si input no es null. Si eso es cierto, significa que el usuario ha ingresado algo, por lo que
        name = input          // se asigna el valor de input a la variable name. De lo contrario, name seguirá siendo null.

    println("el nombre ingresado es : $name") //Esta línea imprime en la consola el mensaje "El nombre ingresado es: " seguido del valor de la variable name.
                                              // Si name es null, se imprimirá como una cadena vacía.
    //En resumen, este programa solicita al usuario que ingrese su nombre y lo almacena en la variable name. Si el usuario ingresa algo, se asigna el valor a name.
    // Luego, se muestra el valor ingresado o una cadena vacía en la consola.
    }
}