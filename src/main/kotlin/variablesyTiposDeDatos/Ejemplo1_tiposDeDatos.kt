package variablesyTiposDeDatos

fun main (){
    /**
     * Este ejemplo muestra diferentes tipos de datos en Kotlin. Tenemos variables que almacenan enteros,
     * números de punto flotante, booleanos, caracteres, cadenas de caracteres, listas y mapas. Luego, se
     * imprimen los valores de estas variables utilizando la función println().
      */
// tipo de dato entero
val numeroentero:Int=10
// tipo de dato flotante
val numeroFlotante = 3.14f
// tipo de dato doble
val numeroDouble:Double=2.71
//tipo de dato booleano
val esVerdadero:Boolean=true
// tipo de dato caracter
val caracter:Char ='A'
// tipo de dato cadena de caracteres
val cadena :String = " hola jirman"
// tipo de dato lista de enteros
val ListaDeEnteros:List <Int> = listOf(1,2,3,4,5,6,7,8,9,10)
// tipo de dato mapa
val mapa:Map <String,Int> = mapOf("uno" to 1, "dos" to 2)
println(numeroentero)
println(numeroFlotante)
println(numeroDouble)
println(esVerdadero)
println(caracter)
println(cadena)
println(ListaDeEnteros)
println(mapa)
}