package src.item

class Item(val codigo: Int, val nome: String, val preco: Double) {
    override fun toString(): String {
        return "código: $codigo | nome: $nome | preço(R$) $preco";
    }
}
