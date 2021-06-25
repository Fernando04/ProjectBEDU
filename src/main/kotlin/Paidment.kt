class Paidment {
    fun saldoEnCuenta(saldo:Double,precio:Double){
        if(saldo>=precio){
           val resultado = saldo - precio
            println("Artículo comprado, saldo restante: $resultado pesos")
        } else{
            println("Necesitas saldo suficiente para poder comprar este producto")
        }
    }
}