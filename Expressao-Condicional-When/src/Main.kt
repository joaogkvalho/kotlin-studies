//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val diaSemana = 1

    val dia: String = when(diaSemana) {
        1, 2 -> "Iníco da semana"
        3, 4 -> "Meio da Semana"
        5, 6, 7 -> "Fim da semana"
        else -> "Dia inválido"
    }

    println(dia)
}