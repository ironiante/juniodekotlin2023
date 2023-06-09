package sentenciasCondionales

import java.lang.NumberFormatException

/**
 * Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos
 * (suponemos que el operador del programa ingresa valores distintos, no valida nuestro programa dicha situación)
 * en este programa nos aseguramos colocar excepciones.
 */
fun main (){
  println("ingrese el primer numero")
    val numero1= leerNumeroEntero() // leer la explicacion de la funcion.
    println("ingrese segundo numero")
    val numero2= leerNumeroEntero()
    if (numero1!=null && numero2!=null)
        if (numero1 > numero2){
            println("El mayor numero es: $numero1")
        }else if (numero2>numero1){
            println("El mayor numero es: $numero2")
        }else {
            println("Los numeros son iguales")
        }else{
            println("Ingrese numeros enteros validos")
    }
}
//explicacion de la funcion.
/**
 * La función leerNumeroEntero() se encarga de solicitar un número entero al usuario y validar si es un número válido.
 * Aquí está el desglose de cómo funciona:
 * 1.Se define la función leerNumeroEntero() con un tipo de retorno Int?, que indica que puede devolver un entero o null
 * si la entrada no es un número entero válido.
 * 2.Dentro de la función, se utiliza readLine() para obtener la entrada del usuario y se almacena en la variable input.
 * readLine() devuelve una cadena de texto que el usuario ingresa desde la consola.
 * 3.A continuación, se utiliza un bloque try-catch para manejar posibles excepciones. En este caso, se maneja la
 * excepción NumberFormatException, que ocurre si la cadena no se puede convertir a un entero.
 * 4.Dentro del bloque try, se utiliza input?.toInt() para intentar convertir la cadena input a un entero. El operador
 * ?. se utiliza para realizar la conversión solo si input no es null. Si input es null o no se puede convertir a un
 * entero, se producirá una excepción.
 * 5.Si la conversión es exitosa, es decir, input se puede convertir a un entero, el valor entero se devuelve como
 * resultado de la función.
 * 6.Si se produce una excepción de NumberFormatException dentro del bloque try, se captura la excepción y se maneja
 * en el bloque catch. En este caso, se devuelve null para indicar que la entrada no es un número entero válido.
 * 7.En resumen, la función leerNumeroEntero() lee la entrada del usuario, intenta convertirla a un entero y devuelve
 * el valor entero si la conversión es exitosa. Si la entrada no es un número entero válido, se devuelve null.
 * Esto ayuda a asegurar que solo se asignen valores enteros válidos a las variables numero1 y numero2 en el
 * programa principal.
 */
fun leerNumeroEntero():Int?{
    val input = readLine()
    return try {
        input?.toInt()
    }catch (e:NumberFormatException){
        null
    }
}