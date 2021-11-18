fun main(args: Array<String>) {

    /*var arrayNum: Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,10)
    * println("Numeros pares:")

    for (item in arrayNum) {
        if(item % 2 == 0){
            println(item)
        }
    }
    println("Numeros impares: ")

    for (item in arrayNum){
        if (item % 2 != 0){
            println(item)
        }
    }
    */


    var itens = Array(10){
        0
    }
    for(i in 0..9){
        println("Digite o valor $i: ")
        itens[i] = readLine()!!.toInt()
    }
    println("\nOs numeros pares digitados são:")
    for (i in itens){
        if(i % 2 == 0){
            println(i)
        }
    }
    println("\nE o numeros impares são:")
    for (i in itens){
        if(i % 2 != 0){
            println(i)
        }
    }
}



