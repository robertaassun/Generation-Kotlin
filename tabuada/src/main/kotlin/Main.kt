fun main(args: Array<String>) {

    var numb: Int
    println("Digite um numero entre 1 e 10")
    numb = readLine()!!.toInt()

    if(numb <0){
        println("Numero $numb digitado é invalido u.u")
    }else{
        for(i in 1..10){
            println("$numb x $i = ${numb * i}")
        }
        println("\nOrdem decrescente \n")
        for (i in 10 downTo 1){
            println("$numb x $i = ${numb * i}")
        }
    }
}