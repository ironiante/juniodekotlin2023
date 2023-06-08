package nullsafetyOperadorElvis

/**
 * el operador elvis o ternario es una forma concisa de manejar valores nulos(null) en expresiones condicionales
 * se representa con el simbolo ?:"". se utiiliza para proporcionar un valor de respaldo en caso de que una expresion
 * nula.
 * formato: val resultado = expresionNullable ?: valorDeRespaldo
 * 1.si la expresion expresionNullable es diferente de nula, se asigna su valor a la variable resultado.
 * 2.si la expresion es nula, se asigna el valor --> valorDeRespaldo a la variable --> resultado.
 */
/**
 * es una funcion que se utiliza para obtener la longitud de un texto.
 1. Esta línea define una función llamada "obtenerLongitud" que acepta un parámetro de tipo String llamado "texto".
 2. El signo de interrogación después de String indica que el parámetro puede ser nulo (null).
 3. int indica el tipo de dato que devuelve la funcion.
 4. En esta línea, se utiliza el operador de llamada segura (?.) para acceder a la propiedad length del parámetro texto.
 5. El operador de llamada segura evita una excepción de referencia nula en caso de que texto sea nulo. Si texto no es nulo,
   se devuelve el valor de texto.length.
 6. El operador Elvis (?:) se utiliza después de texto?.length para especificar un valor predeterminado en caso de que texto
   sea nulo. En este caso, si texto es nulo, se devuelve 0 como longitud predeterminada.
 7. En resumen, esta función devuelve la longitud del texto proporcionado como parámetro si no es nulo, y devuelve 0 si el texto
    es nulo. Es una forma de evitar errores cuando se intenta acceder a la propiedad length de un objeto String que podría ser nulo.
 */
fun obtenerlongitud(texto:String ?) :Int{
    return texto?.length ?:0
}