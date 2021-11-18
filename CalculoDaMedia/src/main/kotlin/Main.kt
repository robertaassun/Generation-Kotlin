fun main(args: Array<String>) {
      
    var nota1: Double
    var nota2: Double
    var nota3: Double
    var nota4: Double
    var soma: Double
    var media: Double

    println("Digite a primeira nota: ")
    nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota: ")
    nota2 = readLine()!!.toDouble()

    println("Digite a terceira nota: ")
    nota3 = readLine()!!.toDouble()

    println("Digite a quarta nota: ")
    nota4 = readLine()!!.toDouble()

    soma = nota1 + nota2 + nota3 + nota4
    media = soma/4

    if(media > 0 && media <= 4){
        println("Você está reprovado")
    } else if(media > 4 && media <= 5){
        println("Sua média é regular")
    } else if(media >= 5 && media <= 8){
        println("Sua média é boa")
    } else if(media > 8 && media <= 10){
        println("Sua média é excelente")
    } else{
        media < 0 && media > 10
        println("Média Invalida")
    }

}