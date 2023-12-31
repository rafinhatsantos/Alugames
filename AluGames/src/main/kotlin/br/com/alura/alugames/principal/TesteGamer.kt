package br.com.alura.alugames.principal
import br.com.alura.alugames.modelo.Gamer
fun main() {
    val gamer1 = Gamer("Rafael", "Rafael@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "idarte",
        "idarte@email.com",
        "08/06/2000",
        "idarte")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "18/09/2000"
        it.usuario = "idartegskywalker"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "rafael"
    println(gamer1)
}