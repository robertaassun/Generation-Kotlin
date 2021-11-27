fun main(args: Array<String>) {

    val aluno1 = Estudante("Roberta","Assunção",123, 80.0, 5)
    val aluno2 = Estudante("Heikki","Vartiainen",456, 50.0, 7)
    val aluno3 = Estudante("Pandora","Assunção",789, 60.0, 5)

//    val curso = Curso("Programação Orientada Objeto",1)
//
//    val listaEstudantes = arrayOf(aluno1, aluno2,aluno3)
//    curso.matricularAluno(listaEstudantes)

    println(aluno1.infoAluno())

}



class Estudante(var primeiroNome:String?, var ultimoNome:String?) {

    var ra = 0
    var nota = 0.0
    var ano = 0

    constructor(primeiroNome: String?,ultimoNome: String?,ra:Int)
            :this(primeiroNome,ultimoNome){
        this.ra = ra
    }
    constructor(primeiroNome: String?,ultimoNome: String?,ra: Int,nota:Double, ano:Int)
            :this(primeiroNome,ultimoNome,ra){
        this.ano = ano
        this.nota = nota
    }

    fun printNome() {
        println("Nome do aluno: $primeiroNome $ultimoNome")
    }

    val aprovado: Boolean
        get() {
            return nota >= 60
        }

    fun passouAno(): Int {
        if(aprovado){
            ano ++
            println("Parabéns, foi aprovado e esta hapto a cursar o ano $ano")
        } else{
            println("Você fopi reprovado")
        }
        return 0
    }

    fun infoAluno(){
        println("Nome: $primeiroNome $ultimoNome")
        println("Código: $ra")
        println("Média: $nota")
        println("Ano: $ano")
        println("Foi aprovado: $aprovado")
    }
}

class Curso(var nomeCurso:String?, var serie:Int){

    var professor:String? = null
    var listaAlunosMatriculados = mutableListOf<Estudante>()

    fun matricularAluno(estudante: Estudante){
        listaAlunosMatriculados.add(estudante)
    }

    @Override
    fun matricularAluno(listaEstudante: Array<Estudante>){
        for (estudante in listaEstudante){
            listaAlunosMatriculados.add(estudante)
        }
    }

    fun removeAluno(estudante: Estudante){
        println("Deseja remover aluno ?" +
                "Digite SIM para remover" +
                "Digite NÃO para cancelar")
        var confResp = readLine()!!.lowercase()

        if(confResp == "sim"){
            listaAlunosMatriculados.remove(estudante)
            println("Aluno $estudante removido com sucesso!")
        }else{
            println("Estudante $estudante não removido")
        }
    }

    fun contaEstudantes():Int{
        return listaAlunosMatriculados.size
    }

    fun maiorNota():Double{
        var maiorNota = 0.0

        for (estudante in listaAlunosMatriculados){
            if(estudante.nota > maiorNota){
                maiorNota = estudante.nota
            }
        }
        return maiorNota
    }
}


