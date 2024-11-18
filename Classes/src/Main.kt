//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  val joao = Pessoa("João", 22, "Desenvolvedor")
  val gabriel = Pessoa("Gabriel", 25)

  joao.saudacao()
  gabriel.saudacao()

  println()

  println(joao.profissao)
  println(gabriel.profissao)
}