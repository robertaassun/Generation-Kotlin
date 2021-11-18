fun main(args: Array<String>) {

    val roberta = Student("Roberta", "Assunção",
        2205, 50.0, 2)

    val henrik = Student("Henrik", "Vartiainen",
        1234, 80.0, 3)

    val marcela = Student("Marcela", "da Silva",
        3214, 10.0, 1)

    roberta.nomeCompleto()
    roberta.mudarAnoSeAprovado()

    /*henrik.nomeCompleto()
    henrik.mudarAnoSeAprovado()

    marcela.nomeCompleto()
    marcela.mudarAnoSeAprovado()*/


    val cursoIngles = Courses(nomeDoCurso = "Inglês", nomeDoProfessor = "Pedro", ano = 3)

    cursoIngles.cadastrar(roberta)
    cursoIngles.cadastrar(henrik)


    cursoIngles.numEstudantesCadastraddos()

    cursoIngles.removerEstudante(marcela)
}