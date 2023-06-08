package entradaPorTeclado

/**
 * ingresar datos por consola
 * Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
 */
fun main (){ //Definimos la función main(), que es el punto de entrada del programa.
   println("ingrese primer valor") //Imprimimos en la consola el mensaje "Ingrese el primer número:"
                                   // para solicitar al usuario que ingrese el primer número.
    val valor1 = readLine()!!.toInt()//readLine() para leer la entrada del usuario como una cadena de texto,
                                     // y toInt() para convertir esa cadena de texto en un número entero. El operador
                                    //  !! se utiliza para ,asegurarnos de que la conversión no produzca un valor nulo.
    println("ingrese segundo valor")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    val producto = valor1 * valor2
    println("el resultado de las operaciones son:")
    println("la suma de los dos numeros es: $suma")
    println(" el producto de los dos numeros es: $producto")
}