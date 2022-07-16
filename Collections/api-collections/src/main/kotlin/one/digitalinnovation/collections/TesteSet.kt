package one.digitalinnovation.collections


fun main() {
    val Joao = Funcionario("Joao", 2000.0, "CLT")
    val Pedro = Funcionario("Pedro", 1500.0, "pj")
    val Maria = Funcionario("Maria", 4000.0, "CLT")

    val Funcionarios1 = listOf(Joao, Pedro)
    val Funcionarios2 = listOf(Maria)

    val resultUnion = Funcionarios1.union(Funcionarios2)
    resultUnion.forEach{println(it) }

    println("----------------------")
    val Funcionarios3 = listOf(Joao, Pedro, Maria)
    val resultSubtrct = Funcionarios3.subtract(Funcionarios2)
    resultSubtrct.forEach{println(it) }


    println("----------------------")
    val resultIntresect = Funcionarios3.intersect(Funcionarios2)
    resultIntresect.forEach{println(it) }
}