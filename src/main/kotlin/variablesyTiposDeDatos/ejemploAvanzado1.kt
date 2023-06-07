package variablesyTiposDeDatos

/**
 *En este ejemplo, se crea una clase Person que representa a una persona con un nombre y una edad. Luego,
 *  se crea una lista de objetos Person con diferentes nombres y edades. A continuación, se utilizan funciones
 *  de orden superior para filtrar las personas mayores de 30 años y obtener sus nombres. Luego, se imprimen los
 *  nombres de las personas filtradas. Después, se calcula el promedio de edad de todas las personas y se imprime el resultado.
 */
class Person (val name:String,val age : Int)
fun main (){
    // crear lista de personas
    val people :List<Person> = listOf(
        Person("jirman",42),
        Person("sofia",17),
        Person("yulieth",40),
        Person("martin",8)
    )
    // filtrar las personas mayores de 30 años
        val mayoresDe30:List<Person> = people.filter { it.age>30 }
    //obtener los nombres de las personas
        val nombresMayoresDe30: List<String> = mayoresDe30.map { it.name }
    // imprimir los nombres de las personas mayores de 30 años
    println(" personas mayores de 30 años")
    nombresMayoresDe30.forEach { println(it) }
    // calcular el promedio de edad de todas las personas
    val promedioEdad:Double = people.map { it.age }.average()
    // imprimir el promedio de edad
    println("promedio de edad : $promedioEdad")



}
