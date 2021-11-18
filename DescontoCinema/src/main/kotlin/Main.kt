fun main(args: Array<String>) {


    var preco = 18.0
    var desc = 0.0
    var precoFinal = 0.0
    var cont = 0

    println("Digite qual sua idade: ")
    var age = readLine()!!.toInt()

    if(age <= 5){
        desc = 0.6
        precoFinal = preco - (preco * desc)
        println("O total a ser pago pelo seu ingresso é R$$precoFinal")
    } else if(age >= 60){
        desc = 0.55
        precoFinal = preco - (preco * desc)
        println("O total a ser pago pelo seu ingresso é R$$precoFinal")
    } else {
        println("Quantos ingressos deseja comprar?")
        cont = readLine()!!.toInt()

        if(cont >= 2){
            desc = 0.3
        }else{
            desc = 0.0
        }

        var totalSemDescon = cont * preco
        precoFinal = totalSemDescon - (totalSemDescon * desc)
        println("O valor total dos ingressos é R$precoFinal")
    }
}