fun main(args: Array<String>) {

   /* var name1 = "Roberta"

    println("<???> Opa, eae ?")
    println("<$name1> De boas?")
    println("<???> Suaves")
    print("<$name1> Qual seu nome?")

    var typedName = readLine()
    println("<???> Meu nome é $typedName")

    println("<$name1> Opa, prazer em conhecê-lo $typedName")
    println("<$typedName> O prazer é todo meu")*/

    /*var num = 0

    do{
        num = readLine()!!.toInt()
    }while (num != 0)*/

    /*var num = 0
    var cont = 0
    var soma = 0

    println("Digite um numero para fazer a soma de 1 ele: ")
    num = readLine()!!.toInt()

    do{
        soma += cont
        cont ++
    }while (cont <= num)
    println("A soma de todos os numeros de 1 até o numero digitado é
    $soma")*/


    /*var arrayNum = arrayOf(1,2,3,4,5,6)

    println(arrayNum.size)

    for (item in arrayNum){
        println(item)
    }*/


    println("Digite um valor para calcular sua tabuada")
    var num = readLine()!!.toInt()

    for (i in 1..10){
        println("$num x $i = ${num * i}")
    }


































}