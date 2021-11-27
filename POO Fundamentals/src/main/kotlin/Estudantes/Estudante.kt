package Estudantes

class Estudante(var primeiroNome:String?,
                private var ultimoNome:String?) {

    private var ra = 0
    var nota = 0.0
    private var ano = 0

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

    private val aprovado: Boolean
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