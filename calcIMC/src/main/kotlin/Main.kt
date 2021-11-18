import kotlin.math.pow

fun main(args: Array<String>) {

    println("Digite seu peso: ")
    var peso = readLine()!!.toDouble()
    println("Digite sua altura: ")
    var altura = readLine()!!.toDouble()

    var imc = peso / altura.pow(2)

    println("Seu IMC é : $imc")

    if(imc < 18.5){
        println("Você está abaixo do peso saudavel")
    } else if(imc >= 18.5 && imc <=24.9 ){
        println("Você está dentro do peso normal")
    } else if(imc >= 25 && imc <= 29.9){
        println("Você esta com sobrepeso")
    } else if(imc >= 30 && imc <= 34.9){
        println("Você tem Obesidade grau 1")
    } else if(imc >= 35 && imc <= 39.9){
        println("Você tem obesidade grau 2")
    } else{
        println("Você tem obesidade Mórbida")
    }
}