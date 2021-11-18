fun main(args: Array<String>) {

    var numb = 0
    var soma = 0
    var cont = 0
    var media = 0
    var menor = 0
    var maior = 0

    do{
        print("Digite um numero: ")
        numb = readLine()!!.toInt()

        if(numb != 0){

            soma += numb

            if(numb > maior){
                maior = numb
            }else if (numb < menor){
                menor = numb
            }

            if(menor == 0){
                menor = numb
            }

            if(maior == 0){
                maior = numb
            }
            cont ++
    }
 } while (numb != 0)
    media = soma / cont

    println("A soma de todos os números é $soma")
    println("A média dos números é $media")
    println( "O menor número é $menor")
    println( "O maior número é $maior")
}