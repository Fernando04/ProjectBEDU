import java.util.*
fun main() {

    println("Bienvenido")
    val name:String="Osvaldo"
    println(name)
    val edad: Int = 23
    println("Mi edad es $edad")
    println("Usuario $name,$edad años")
    fun verifyAge(){
        println("Ingresa la edad y da enter")
        val age = readLine()?.toInt()//?significa que puede ser nulo y la función debe detenerse
        when {
            age!! >18 -> {
                println("Ya eres mayor de edad")
            }
            age==18 -> {
                println("Acabas de cumplir 18")
            }
            else -> {
                println("Eres menor de edad")
            }
        }
    }
    val isLegal: Boolean = edad>=18
    println("¿El usuario es mayor de edad? $isLegal")
    val usuario= "Osvaldo@azc.org"
    val password="contraseña1"
    /* val correctpas: Boolean = when password String && when password int
     println("La contraseña es corecta $correctpas")
 when (password){
     is String -> println("Has ingresasdo carácteres alfabéticos")
     else in 0..9-> println("Has ingresado carácteres numéricos")}*/
    /* fun login(user: String, password: String): Boolean {
          fun validate(input: String): Boolean {
              if(input.isEmpty()){
                  return false
              }
              return true
          }
          val userValidated = validate(user)
          val passValidate = validate(password)
          return userValidated && passValidate
      }
  fun loggedIn(userid: String, pass:String): Boolean{
      var loggedIn = false
      return loggedIn }A*/
    val resultado = Validation ()
    fun login(user: String, pass: String): Boolean{
        if(user==usuario && pass==password){
            println("Inicio de sesión exitoso")
            return true
        } else{
            println("email o contraseña incorrecto")
            return false
        }}
    fun crearSaludo(name: String): String{return "Hola$name"}
    println(crearSaludo(name))
    fun elegirPais(country:String){
        when(country){
            "México" ->{
                val idioma = "Español"
                val divisa = "Peso"
                println("Bienvenido a Bedu shop")
            }
            "Francia" -> {
                val idioma = "Francés"
                val divisa = "Euro"
                println("Soyez Bienvenu à Bedu shop")
            }
            "Estados Unidos" -> {
                val idioma = "Inglés"
                val divisa = "Dolar"
                println("Welcome to Bedu shop")
            }
            else ->{
                println("Lo sentimos, este servicio no está disponible en tu país")
            }
        }}
    val usuarios = mapOf(
        "Osvldo@azc.org" to  "Azc",
        "daniel@cliente.com" to "Cliente43",
        "Fernando@empresa.mx" to "F3R2472"
    );
}