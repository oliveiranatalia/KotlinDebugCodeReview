package src.menu

import kotlin.system.exitProcess

class Menu {
    companion object {

        fun menu() {
            print("Deseja acessar o sistema com perfil de (V)Vendas ou de (C)Cliente? ")
            val opcao = readln()

            when (opcao) {
                "C", "c" -> menuCompra()
                "V", "v" -> println("Criar mesa")
                else -> {
                    println("Opção inválida, tente novamente")
                    //TODO:remover o menu() daqui para ver se a galera percebe a falta de padrão
                    menu()
                }
            }
        }

        private fun menuCompra() {

            print("O que deseja fazer?")
            print("1 - Ver lista de itens disponíveis para compra")
            print("2 - Escolher itens para compra")
            print("3 - Ver meu carrinho de compras")
            print("4 - Finalizar minha compra")
            print("5 - Sair do programa")

            //TODO:deixar sem o try/catch para avaliar se a galera percebe que dá problema de entrada de dado se for string
            val opcao = readln().toInt()

            when (opcao) {
                1 -> println("Ver lista de itens disponíveis para compra")
                2 -> println("Escolher itens para comprar")
                3 -> println("Ver o carrinho de compras")
                4 -> println("Finalizar a compra")
                5 -> exitProcess(0)
                else -> {
                    println("Opção inválida, tente novamente")
                    menuCompra()
                }
            }
        }
    }
}