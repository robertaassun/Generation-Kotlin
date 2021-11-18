fun main(args: Array<String>) {

    var numb = Array(10){
        0
    }
    var cont = "sim"

    while (cont == "sim"){
        for (i in 0..9){
            println("Digite um numero: ")
            numb[i] = readLine()!!.toInt()
        }
        println("Numeros pares:")

        for (i in numb){
            if (i % 2== 0) {
                println(i)
            }
        }
        println("Numeros ímpares:")

        for (i in numb){
            if (i % 2 != 0){
                println(i)
            }
        }
        print("Deseja continuar validando quais são numeros pares e quais são ímpares ? ")
        cont = readLine()!!.toString()
    }
}