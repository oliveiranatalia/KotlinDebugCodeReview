package src.estoque

import src.item.Item

class Estoque {
    private val listaItem: ArrayList<Item> = ArrayList()

    fun registrarItem() {
        println("Digite o código do produto: ")
        val codigo = readln().toInt()
        println("Digite o nome do produto: ")
        val nomeItem = readln()
        println("Digite o preco do produto: ")
        val preco = readln().toBigDecimal()
        val item: Item = Item(codigo = codigo, nome = nomeItem, preco = preco)
        listaItem.add(item);
        println("Item registrado com sucesso\n")

    }

    fun verificarItemRepetido() {
        TODO("Não implementado ainda")
    }

    private fun listarItens() {
        if (!listaItem.isEmpty()) {
            println("Não temos nenhum item cadastrado no momento")
        } else {
            println("Atualmente temos os seguintes itens: ${listaItem.toString()}");
        }
    }

    fun darBaixaItem() {
        print("Qual o código do item a dar baixa? ")
        val codigoItemADarBaixa = readln()
        for (item in listaItem) {
            if (codigoItemADarBaixa == item.codigo) {
                listaItem.remove(item)
                println("Item removido com sucesso")
                break
            }
        }
    }
}