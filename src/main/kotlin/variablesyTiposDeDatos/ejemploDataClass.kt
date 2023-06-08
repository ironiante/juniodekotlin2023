package variablesyTiposDeDatos

data class Personn(
    val name:String,
    val age:Int,
    val address:String
)
//solicitar datos al usuario
fun main (){
    println("ingrese su nombre ")
    val name = readLine() ?: "ingrese "
    println(name)
}