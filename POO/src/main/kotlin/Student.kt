class Student (var nome: String?,
               var sobrenome: String?,
               var ra: Int) {
    var nota = 0.0
    var ano = 0

    constructor(nome: String?,sobrenome: String?,
                ra: Int, nota: Double): this(nome, sobrenome, ra){
                    this.nota = nota
                }

    constructor(nome: String?,sobrenome: String?,
                ra: Int, nota: Double, ano: Int): this(nome, sobrenome, ra)

    fun nomeCompleto(){
        println("$nome $sobrenome")
    }

    val aprovado:Boolean
        get(){
            return nota >= 60
        }

    fun mudarAnoSeAprovado(){
        if(aprovado){
            ano ++
            println("Parabens, você foi aprovado!")
        }else{
            println("Você foi reprovado! e por isso não passará de ano")
        }
    }
}