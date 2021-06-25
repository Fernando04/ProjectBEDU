class SearchProduct {
    val products = listOf<String>("jabón",
        "shampo", "desodorante", "cloro", "pañales",
        "refresco", "cerveza", "sabritas", "agua", "tés",
        "frijoles", "arroz", "aceite", "cepillos",
        "pan", "leche", "huevo", "pastel", "vasos")
    fun listaNombres(product: String): String{
        for (listaNombres in products){
            if (product in listaNombres) {
                println("Producto encontrado $product")
            }
        }
        return product
    }
}