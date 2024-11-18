//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    fun saudacao(nome: String, idade: Int): String {
        return "Olá $nome que tem $idade anos."
    }

    val mensagem = saudacao("Joao", 22)
    println(mensagem)
}