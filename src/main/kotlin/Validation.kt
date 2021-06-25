import java.util.*
class Validation {
    val reader = Scanner(System.`in`)
    fun verifyAge(){
        println("Ingresa la edad...")
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
        fun login(user: String, password: String): Boolean {
        fun validate(input: String): Boolean {
            if (input.isEmpty()) {
                return false

            }
            return true
        }
        val userValidate = validate(user)
        val passwordValidate = validate(password)
        return userValidate && passwordValidate
    }
}
