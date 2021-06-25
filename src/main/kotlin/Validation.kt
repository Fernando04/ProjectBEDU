import java.util.*

class Validation {
    val reader = Scanner(System.`in`)

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
