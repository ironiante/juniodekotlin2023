package entradaPorTeclado

/**
 * Escribir un programa en el cual se ingresen cuatro números enteros, calcular e informar la suma de los dos primeros y
 * el producto del tercero y el cuarto.
 */
fun main (){
    println("ingresar primer numero: ")
    val valor1= readLine()!!.toInt()
    println("ingrese segundo valor: ")
    val valor2= readLine()!!.toInt()
    println("ingrese tercer valor ")
    val valor3= readLine()!!.toInt()
    println("ingrese cuarto valor")
    val valor4= readLine()!!.toInt()
    val suma = valor1 + valor2
    val producto= valor3 * valor4
    println("estos son los resultados")
    println(" la suma de los dos primeros datos son: $suma")
    println(" el producto de los datos 3 y 4 son: $producto")
}