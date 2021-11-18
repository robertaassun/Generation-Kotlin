import java.util.*

fun main(args: Array<String>) {

    /*var currentYear = 2021
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
    println("Tipo sanguíneo: $bloodType")*/



    var nome = ""
    var prefEmp = ""
    var nacio = ""
    var tipoSang = ""
    var idade = 0
    var ano = 2021
    var anoNasc = 0

    println("Digite seu nome: ")
    nome = readLine()!!

    println("Digite sua Idade: ")
    idade = readLine()!!.toInt()

    println("Digite qual sua preferencia de emprego: ")
    prefEmp = readLine()!!

    println("Digite sua Nacionalidade: ")
    nacio = readLine()!!

    println("Digite seu tipo Sanguíneo: ")
    tipoSang = readLine()!!

    anoNasc = ano - idade




}