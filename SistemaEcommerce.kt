import src.estoque.Estoque
import src.menu.Menu

fun main() {
    println("Boas vindas ao Seu Estoque em dia!")
    val estoque = Estoque()
    Menu().menuPrincipal(estoque)
}
