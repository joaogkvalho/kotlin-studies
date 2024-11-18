class Pessoa(
    val nome: String,
    val idade: Int,
    val profissao: String? = null
) {
    fun saudacao() {
        println("Olá, meu nome é $nome e tenho $idade anos.")
    }
}