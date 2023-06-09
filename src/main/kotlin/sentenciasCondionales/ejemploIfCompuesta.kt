package sentenciasCondionales

/**
 * Realizar un programa que solicite ingresar dos números enteros distintos y muestre por pantalla el mayor de ellos
 * (suponemos que el operador del programa ingresa valores distintos, no valida nuestro programa dicha situación)
 */
fun main (){
println("Ingrese primer numero")
    val numero1 = readLine()?.toIntOrNull() //1. readline es una funcion estandar que se utiliza para leer una linea
                                            // de entrada desde la consola, esta funcion devuelve el valor ingresado por
                                            //el usuario como una cadena de texto.(string).
                                            //2. ?.operador segura = protege contra el caso de que la funcion redline
                                            // pueda devolver un null,lo cual podría ocurrir si se encuentra un error
                                            // o si la entrada del usuario está vacía.
                                            //Si readLine() devuelve null, la expresión completa readLine()?.toIntOrNull()
                                            // se evalúa como null.
    println("ingrese segundo numero")
    val numero2 = readLine()?.toIntOrNull()

    if (numero1!=null && numero2!=null){ //El programa verifica si ambos numero1 y numero2 no son null (es decir, si las
        // conversiones a enteros fueron exitosas). Si ambos números son válidos, se ejecuta el bloque de código dentro
        // de esta condición.
        if (numero1 > numero2){
            println("El mayor numero es : $numero1")
        }else if (numero2 > numero1){
            println("El mayor numero es: $numero2")
        }else{
            println("los numeros son iguales")
        }
    }else{
        println("ingrese numeros validos")
    }

}