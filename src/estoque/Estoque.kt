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
        val preco = readln().toDouble()

        val item = Item(codigo,nomeItem,preco)
        listaItem.add(item);
        println("Item registrado com sucesso\n")
    }

    fun verificarItemRepetido() {
        print("Insira o nome do item que deseja pesquisar: ")
        val buscar = readln()
        when(buscar in listaItem.toString()){
            true ->  println("Esse consta em sua lista.")
            false -> println("Item não localizado em sua lista.\n")
        }
    }

    fun listarItens() {
        if (listaItem.isEmpty()) {
            println("Não temos nenhum item cadastrado no momento\n")
        } else {
            println("\nAtualmente temos os seguintes itens: ${listaItem}");
        }
    }

    fun darBaixaItem() {
        print("Qual o código do item a dar baixa? ")
        val codigoItemADarBaixa = readln().toInt()
        for (item in listaItem) {
            if (codigoItemADarBaixa == item.codigo) {
                listaItem.remove(item)
                println("Item removido com sucesso")
            }else{
                println("Esse item não foi encontrado em sua lista.\n")
            }
        }
    }
}
