class ProductOptions {
    fun elegirPais(country:String){
        when(country){
            "México" ->{
                val idioma = "Español"
                val divisa = "Peso"
                //actualizarPerfil(pais)
                println("Bienvenido a Bedu shop")
            }
            "Francia" -> {
                val idioma = "Francés"
                val divisa = "Euro"
                //val credito = convertirAEuros(saldo)
                println("Soyez Bienvenu à Bedu shop")
            }
            "Estados Unidos" -> {
                val idioma = "Inglés"
                val divisa = "Dolar"
              //  val credito = convertirADolares(saldo)
                println("Welcome to Bedu shop")
            }
            else ->{
                println("Lo sentimos, este servicio no está disponible en tu país")
            }

        }
    }
}