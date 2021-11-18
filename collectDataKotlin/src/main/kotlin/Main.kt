import java.util.*

fun main(args: Array<String>) {

    var currentYear = 2021
    var birthYear: Int

    print("Digite seu nome: ")
    var name = readLine()

    print("Qual sua idade: ")
    var age = readLine()!!.toInt()

    print("Qual cargo desejado: ")
    var job = readLine()

    print("Qual sua nacionalidade: ")
    var nacionality = readLine()

    print("Qual seu tipo sanguíneo: ")
    var bloodType = readLine()

    birthYear = currentYear - age

    println("Nome: $name")
    println("Idade: $age")
    println("Ano de nascimento: $birthYear")
    println("Cargo desejado: $job")
    println("Nacionalidade: $nacionality")
    println("Tipo sanguíneo: $bloodType")
}