package sentenciasCondionales

/**
 * When: La expresión when es similar a un switch en otros lenguajes de programación, pero más poderosa. Puedes usarla
 * para evaluar múltiples condiciones y ejecutar diferentes bloques de código en función de ellas. Aquí tienes un ejemplo:
 */
fun main (){
    val calificacion = 90
    when (calificacion){
        in 90..100 -> println("excelente")
        in 80..89-> println("Bueno")
        in 70..79-> println("Regular")
        in 0..69 -> println("Reprobado")
        else -> println("calificacion invalida")
    }
}