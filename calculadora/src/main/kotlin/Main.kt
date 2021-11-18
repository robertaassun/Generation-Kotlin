fun main(args: Array<String>) {

    var operacao: Int
    var num1: Double
    var num2: Double
    var soma: Double

    println("Calculadora")

    println("Digite o primeiro numero: ")
    num1 = readLine()!!.toDouble()

    println("Digite o segundo numero: ")
    num2 = readLine()!!.toDouble()

    println("Digite o numero da operação que deseja realizar?\n" +
            "1 - Soma \n" +
            "2 - subtração\n" +
            "3 - Multiplicação\n" +
            "4 - Divisão\n")
    operacao = readLine()!!.toInt()

    calc(num1, num2, operacao)
}

fun calc(num1: Double, num2: Double, operacao: Int){

    if(operacao == 1) {
        println("$num1 + $num2 = ${num1 + num2}")
    } else if(operacao == 2){
        println("$num1 - $num2 = ${num1 - num2}")
    } else if(operacao == 3){
        println("$num1 * $num2 = ${num1 * num2}")
    } else{
        println("$num1 / $num2 = ${num1 / num2}")
    }
}