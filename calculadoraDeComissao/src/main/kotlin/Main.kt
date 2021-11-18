fun main(args: Array<String>) {

    var valor: Double
    var comissao: Double
    var porcent30 = 30.0
    var porcent20 = 20.0
    var porcent10 = 10.0

    println("Digite o valor da venda: ")
    valor = readLine()!!.toDouble()

    if(valor >= 10000){
        comissao = (valor / 100) * porcent30
        println("O valor da sua comissão referente a está venda é: $comissao")
    } else if(valor >= 5000 && valor <= 9999){
        comissao = (valor / 100) * porcent20
        println("O valor da sua comissão referente a está venda é: $comissao")
    } else if(valor >= 1001 && valor <= 4999){
        comissao = (valor / 100) * porcent10
        println("O valor da sua comissão referente a está venda é: $comissao")
    } else{
        println("Você não terá comissão nesta venda")
    }
}