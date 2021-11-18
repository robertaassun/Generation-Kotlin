fun main(args: Array<String>) {

    println("Digite um numero de 1 a 12, para saber a qual mês do ano corresponde:")
    var numb = readLine()!!.toInt()

    when(numb){
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("O numero digitado não corresponde a nenhum mes do ano")
        }
}