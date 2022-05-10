package src.menu

import src.estoque.Estoque
import kotlin.system.exitProcess

class Menu {
    fun menuPrincipal(estoque: Estoque) {
        try{
            println("O que deseja fazer?")
            println("1 - Cadastrar novo item")
            println("2 - Ver lista de itens disponíveis para compra")
            println("3 - Dar baixa em um item")
            println("4 - Verificar itens repetidos")
            println("5 - Sair do programa")
            when (readln().toInt()) {
                1 -> {
                    estoque.registrarItem()
                    this.menuPrincipal(estoque)
                }
                2 -> {
                    estoque.listarItens()
                    this.menuPrincipal(estoque)
                }
                3 -> {
                    estoque.darBaixaItem()
                    this.menuPrincipal(estoque)
                }
                4 -> {
                    estoque.verificarItemRepetido()
                    this.menuPrincipal(estoque)
                }
                5 -> exitProcess(10)
                else -> {
                    println("Opção inválida, tente novamente\n")
                    menuPrincipal(estoque)
                }
            }
        }catch(e: NumberFormatException){
            println("Opção inválida, tente novamente\n")
            menuPrincipal(estoque)
        }
    }
}
