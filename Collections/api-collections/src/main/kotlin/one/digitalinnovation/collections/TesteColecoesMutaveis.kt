package one.digitalinnovation.collections

fun main(){
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "pj")
    val Maria = Funcionario("Maria", 4000.0,"CLT")

    val Funcionarios = mutableListOf(Joao, Maria )
    Funcionarios.forEach{ println(it)}

    println("-----------LIST---------------")
     Funcionarios.add(Pedro)
    Funcionarios.forEach{ println(it)}

    println("--------------------------")
    Funcionarios.remove(Joao)
    Funcionarios.forEach{ println(it)}

    println("----------SET---------------")
    val FuncionariosSet = mutableSetOf(Joao)
    Funcionarios.forEach{ println(it)}

    println("--------------------------")
    FuncionariosSet.add(Pedro)
    FuncionariosSet.add(Maria)
    Funcionarios.forEach{ println(it)}

    println("--------------------------")
    FuncionariosSet.remove(Maria)
    Funcionarios.forEach{ println(it)}
}