package variablesyTiposDeDatos
/**
 * una variables es un deposito donde hay un valor.
 * los tipos de datos son los siguientes.
- almacenar valores numericos:
Byte ; short ; Int ; long:
- almacenar con parte decimal:
double ; float
- almacenar caracteres
String
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
una variable en kotlin puede ser inmutable: no se puede cambiar --> val
var -- mutable.
 */
fun main (){
    // declaracion de variables:
    val nombre = "juan"
    var edad = 25
    // uso de variables.
    println("mi nombre es $nombre y tengo $edad años ")
    // modificacion de variables
    edad = 26
    println(" despues de mi cumpleaños , ahora tengo $edad años")
}
