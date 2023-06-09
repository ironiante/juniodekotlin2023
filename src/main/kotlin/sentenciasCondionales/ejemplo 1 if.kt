package sentenciasCondionales

/**
 *Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla indicando que debe abonar impuestos.
 *
 */
fun main (){
    println("ingrese sueldo")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000){
        println("debe abonar impuestos")
    }
}