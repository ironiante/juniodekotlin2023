package bucles

fun main() {                                         // Entrada del programa.
    // Ejemplo de bucle for ascendente
    println("Ingresar números en orden ascendente:") // se imprime este anuncio.
    for (i in 1..5) {                          // se inicia el bucle for iterando desde 1 hasta el 5.
        print("Ingrese el número $i: ")              //Se imprime el mensaje "Ingrese el número X:", donde X es el
                                                     // valor actual del contador del bucle
        try {
            val numero = readLine()?.toInt()       // readlines --> leer una linea de texto desde la consola
            println("Número ingresado: $numero")   //?.toInt() para intentar convertir la entrada de texto en un número
                                                    // entero (Int). Si la conversión es exitosa, el número se asigna a
                                                    //        la variable numero.
        } catch (e: NumberFormatException) {
            println("Error: Ingrese un número válido.")
        }
    }

    // Ejemplo de bucle for descendente
    println("Ingresar números en orden descendente:")
    for (i in 5 downTo 1) {
        print("Ingrese el número $i: ")
        try {
            val numero = readLine()?.toInt()
            println("Número ingresado: $numero")
        } catch (e: NumberFormatException) {
            println("Error: Ingrese un número válido.")
        }
    }
}
