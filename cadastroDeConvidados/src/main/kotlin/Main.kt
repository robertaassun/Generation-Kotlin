fun main(args: Array<String>) {

    var resp: String
    var list = mutableListOf<String>("Roberta", "Heikki")
    var menu: String

    println("Deseja ver a lista de convidados? ")
    resp = readLine()!!

    while (resp == "sim" || resp == "Sim"){
        println("Digite 1 para adicionar convidado")
        println("Digite 2 para remover convidado")
        println("Digite 3 para ver a lista de convidados")
        menu = readLine()!!

        when(menu){
            "1" -> add(list)
            "2" -> remove(list)
            "3" -> convidados(list)
        }
    }
}

fun add(list: MutableList<String>) : Any{
    println("Informe o nome para adicionar a Lista de convidados: ")
    var addName = readLine()!!
    list +=(addName)
    println(list)
    return list
}

fun remove(list : MutableList<String>) : Any {
    println("Informe o nome do convidado que deseja remover: ")
    var removeName = readLine()!!
    if(list.contains(removeName)) {
        list.remove(removeName)
        println("O convidado $removeName foi removido com sucesso!")
        return list
    } else return  print("Convidado não encontrado,")

}

fun convidados(list : MutableList<String>){
    for(item in list)
        println(item)
}