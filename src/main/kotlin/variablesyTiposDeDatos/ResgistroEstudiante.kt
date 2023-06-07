package variablesyTiposDeDatos

import java.util.StringJoiner

/**
 * En este ejemplo, se simula el registro de un estudiante con su nombre, edad, promedio y si es becado.
 * Además, se guarda una lista de las materias en las que está inscrito y un mapa que relaciona cada materia
 * con su respectiva calificación. Luego, se imprime toda la información del estudiante, las materias inscritas
 * y las calificaciones obtenidas en cada materia.
 */
fun main (){
val nombre: String = "jirman "
val edad : Int = 42
val promedio : Double = 9.5
val esBecado : Boolean = true
// lista de materias inscritas
val materias:List<String> = listOf("calaculo diferencial", "fisica moderna"," algebra lineal")
// calificaciones de cada materia
val calificaciones:Map<String,Double> = mapOf("matematicas" to 9.0 , "fisica moderna" to 8.0 , " algebra lineal" to 7.5)
// imprimir informacion del estudiante
println("Nombre: $nombre")
println("edad $edad años")
println("promedio: $promedio")
println(" es becado ?: $esBecado")
// imprimir materias inscritas
println("materias inscritas:")
for (materia in materias){
    println("- $materia")
}
// imprimir calificaciones
println("calificaciones ")
for ((materia,calificacion)in calificaciones) {
    println("- $materia: $calificacion")
}

}