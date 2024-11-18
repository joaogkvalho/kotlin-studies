//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)

    val frutas = mutableListOf("Maçã", "Banana", "Laranja")
    frutas.add("Manga")
    frutas.add("Morango")

    frutas.removeLast()

    println("Lista de números")
    println(numeros)

    println()

    println("Lista de frutas")
    println(frutas.size)
}