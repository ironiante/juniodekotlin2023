package sentenciasCondionales

/**
 *
 */
fun main (){
    val diaDeLaSemana = "miercoles"
    when {
        diaDeLaSemana == "lunes" -> println("primer dia de la semana")
        diaDeLaSemana == "miercoles" -> println("mitad de la semana")
        diaDeLaSemana == "viernes" -> println("ultimo dia de la semana")
        else -> println(" Dia no especifico")
    }

}