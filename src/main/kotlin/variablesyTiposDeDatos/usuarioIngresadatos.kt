package variablesyTiposDeDatos

/**
 * En Kotlin, un data class es una clase especial que se utiliza principalmente para representar datos
 * inmutables. Estas clases proporcionan automáticamente funciones de utilidad, como toString(), equals(),
 * hashCode() y copy(), lo que simplifica la creación y manipulación de objetos de datos.

Un ejemplo avanzado de un data class en Kotlin podría ser el siguiente:
 */
data class person( // al declarar estas propiedades con el prefijo val --> se le asigna un getter(obtenedor) inmutable
    val name:String,
    val age:Int,
    val address: String
 /**
 * el compilador de kotlin genera automaticamente las siguientes funciones:
  - toString(): Devuelve una representación de cadena de texto de la instancia de Person.
    equals(): Compara si dos instancias de Person son iguales en base a sus propiedades.
    hashCode(): Calcula un valor hash único para cada instancia de Person.
    copy(): Crea una copia inmutable de la instancia de Person, permitiendo cambiar valores específicos de sus propiedades.
 */
)
