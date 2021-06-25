class PrintList {
    fun imprimir() {
        val nameToAges: Map<String, Int> = mapOf("user_01" to 20, "user_02" to 23)
            for ((key, value) in nameToAges) {
            println("$key asfdf $value")
        }
    }
}