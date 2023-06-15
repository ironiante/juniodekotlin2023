package bucles

fun main() {//El programa comienza en la función main().

//Se muestra el mensaje "Ingrese la cantidad de nombres que desea ingresar:" para solicitar al usuario que ingrese la
// cantidad de nombres que desea agregar al array.

    print("Ingrese la cantidad de nombres que desea ingresar: ")

//1.Se utiliza readLine() para leer una línea de texto desde la consola. La entrada se guarda en la variable
// cantidadNombres como una cadena (String).
   // 2. Se utiliza el operador ?.toIntOrNull() para intentar convertir la cadena cantidadNombres en un número entero
    // (Int). Si la conversión es exitosa, el número entero se asigna a la variable cantidadNombres. Si la conversión
    // falla (la entrada no es un número válido), se asigna null a la variable cantidadNombres.

    val cantidadNombres = readLine()?.toIntOrNull()

//Se verifica si cantidadNombres no es nulo (cantidadNombres != null) y si es mayor que cero (cantidadNombres > 0).
// Esto asegura que la cantidad de nombres ingresada sea válida.

    if (cantidadNombres != null && cantidadNombres > 0) {

 // 3.Crear un array de nombres con el tamaño especificado por el usuario.
//Si la cantidad de nombres es válida, se crea un array de nombres (nombres) con el tamaño especificado por el usuario
 // utilizando Array(cantidadNombres) { "" }.

        val nombres = Array(cantidadNombres) { "" }

 // Llenar el array con nombres ingresados por el usuario
// Se utiliza un bucle for para recorrer el array nombres y llenarlo con los nombres ingresados por el usuario.
// El bucle se ejecuta desde 0 hasta cantidadNombres - 1. En cada iteración, se solicita al usuario que ingrese un
// nombre y se guarda en la posición correspondiente del array.

        for (i in 0 until cantidadNombres) {
            print("Ingrese el nombre $i: ")
            nombres[i] = readLine() ?: ""
        }

  // Recorrer el array utilizando un bucle for
 //Después de llenar el array, se utiliza otro bucle for para recorrer el array nombres y mostrar los nombres
        // ingresados.


        println("Nombres ingresados:")
        for (nombre in nombres) {
            println(nombre)
        }
    } else {
        println("La cantidad de nombres ingresada no es válida.")
    }
}
//Si la cantidad de nombres no es válida (la conversión a Int falla o es menor o igual a cero), se muestra el mensaje
// "La cantidad de nombres ingresada no es válida."