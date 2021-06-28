import java.util.*
fun main() {
    val Va = Validation()
    val Pri = PrintList()
    val Sea = SearchProduct()
    val nameCount = Sea.listaNombres("shampo")
    val nameCount1 = Sea.listaNombres("cepillo")
    val nameCount2 = Sea.listaNombres("cerveza")

    /*val usuario = Va.login("Fernando", "Pass1234")
    println("$usuario")*/
    /*println("Dame un número")
    val reader = Scanner(System.`in`)
    var numeroDeProductos :Int = reader.nextInt()
    for( i in 1..numeroDeProductos){
        var acumulador = numeroDeProductos
        println(" $acumulador ")
    }
    println("El numero de años que tienes es : $numeroDeProductos")
    */
}