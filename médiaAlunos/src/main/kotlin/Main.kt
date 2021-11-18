fun main(args: Array<String>) {
    var nota1: Double
    var nota2: Double
    var nota3: Double
    var nota4: Double
    var media: Double
    var continuar = "sim"

    while (continuar == "sim"){
        println("Digite a primeira nota: ")
        nota1 = readLine()!!.toDouble()

        println("Digite a segunda nota: ")
        nota2 = readLine()!!.toDouble()

        println("Digite a terceira nota: ")
        nota3 = readLine()!!.toDouble()

        println("Digite a quarta nota: ")
        nota4 = readLine()!!.toDouble()

        media = (nota1 + nota2 + nota3 + nota4) / 4

        println("A média das notas digitadas é $media")

        if (media < 5){
            println("Aluno reprovado")
        } else{
            println("Aluno aprovado")
        }

        println("Deseja continuar fazendo o calculo das médias ?")
        continuar = readLine()!!.toString()
    }
}