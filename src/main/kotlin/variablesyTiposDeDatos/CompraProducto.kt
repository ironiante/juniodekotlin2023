package variablesyTiposDeDatos

/**
 * En este ejemplo, se simula una compra de un producto por parte de un cliente. Se registran detalles
 * del producto, como el nombre, el precio unitario, la cantidad disponible y si está en oferta. Además,
 * se almacena información del cliente, como el nombre, la edad y la dirección. Luego, se procesa la compra,
 * calculando el subtotal, el impuesto y el total. Por último, se imprime toda la información relacionada con
 * el producto, el cliente y los detalles de la compra.

 */
fun main (){
    // Información de un producto
    val nombreProducto: String = "Camisa"
    val precioUnitario: Double = 29.99
    val cantidadDisponible: Int = 50
    val estaEnOferta: Boolean = true

    // Detalles del cliente
    val nombreCliente: String = "María López"
    val edadCliente: Int = 28
    val direccionCliente: String = "Calle Principal, Ciudad XYZ"

    // Procesamiento de la compra

    val cantidadComprada: Int = 3
    val subtotal: Double = precioUnitario * cantidadComprada
    val impuesto: Double = subtotal * 0.16
    val total: Double = subtotal + impuesto

    // Imprimir información de la compra

    println("--- Información del producto ---")
    println("Nombre: $nombreProducto")
    println("Precio unitario: $precioUnitario")
    println("Cantidad disponible: $cantidadDisponible")
    println("¿Está en oferta?: $estaEnOferta")

    println("\n--- Información del cliente ---")
    println("Nombre: $nombreCliente")
    println("Edad: $edadCliente")
    println("Dirección: $direccionCliente")

    println("\n--- Detalles de la compra ---")
    println("Cantidad comprada: $cantidadComprada")
    println("Subtotal: $subtotal")
    println("Impuesto: $impuesto")
    println("Total: $total")

}