
import Cursos.Curso
import Estudantes.Estudante
import java.lang.Exception

fun main(args: Array<String>) {

    val aluno1 = Estudante("Roberta","Assunção",123, 80.0, 5)
    val aluno2 = Estudante("Heikki","Vartiainen",456, 50.0, 7)
    val aluno3 = Estudante("Pandora","Assunção",789, 60.0, 5)

    val cursoPOO = Curso("Programação Orientada Objeto", 1)

    cursoPOO.matricularAluno(aluno1)
    cursoPOO.contaEstudantes()
    cursoPOO.removeAluno(aluno1)
    cursoPOO.contaEstudantes()

    try {
        cursoPOO.verificaAluno(aluno2)
    }catch (e:Exception){
        println(e.message)
    }


}





