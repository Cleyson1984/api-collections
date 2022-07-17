package one.digitalinnovation.collections

fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "pj")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val Repositorio = Repositorio<Funcionario>()

    Repositorio.created(Joao.nome,Joao)
    Repositorio.created(Pedro.nome,Pedro)
    Repositorio.created(Maria.nome,Maria)

    println(Repositorio.findById(Joao.nome))

    println("------------------------------")
    Repositorio.findAll().forEach{println(it)}

    println("------------------------------")
    Repositorio.remove(Joao.nome)
    Repositorio.findAll().forEach{println(it)}

}