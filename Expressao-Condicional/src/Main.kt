//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numero = 22

    val maiorIdade: String = if (numero >= 18) {
        "Adulto"
    } else if(numero < 18 && numero >= 12) {
        "Adolescente"
    } else if(numero <= 11) {
        "Criança"
    } else {
        ""
    }

    println(maiorIdade)
}