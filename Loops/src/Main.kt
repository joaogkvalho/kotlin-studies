//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6)
    val frutas = mutableListOf("Maçã", "Banana", "Laranja")

    for ((index, fruta) in frutas.withIndex()) {
        if (fruta != "Banana") {
            println("[$index] - $fruta")
        } else {
            break
        }
    }

    println()

    frutas.forEachIndexed { index, fruta ->
        if (fruta != "Banana") {
            println("[$index] - $fruta")
        } else {
            return
        }
    }
}