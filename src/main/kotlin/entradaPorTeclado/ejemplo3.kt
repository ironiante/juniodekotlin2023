package entradaPorTeclado

/**
 * Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad que lleva el cliente.
 * Mostrar lo que debe abonar el comprador.
 */
fun main (){
    println("ingrese el precio del producto")
    val producto = readLine()!!.toInt()
    println("cantidad de productos")
    val cantidad = readLine()!!.toInt()
    val valorTotal =producto*cantidad
    println("el valor total a pagar es: $valorTotal")
}