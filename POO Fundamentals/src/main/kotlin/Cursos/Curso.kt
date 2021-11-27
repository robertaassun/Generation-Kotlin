package Cursos
import Estudantes.Estudante

class Curso(private var nomeCurso:String?,
            private var serie:Int){

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

    fun verificaAluno(estudante: Estudante){
        if(listaAlunosMatriculados.contains(estudante)){
            println("Aluno encontrado")
        }else{
            throw Exception("Aluno não consta na matricula")
        }
    }
}
