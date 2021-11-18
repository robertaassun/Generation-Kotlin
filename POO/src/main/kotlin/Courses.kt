class Courses  (val nomeDoCurso: String?,
                var nomeDoProfessor: String?,
                var ano: Int){

    val listaEstudantes = mutableListOf<Student?>()

    fun cadastrar(student: Student?) {
        listaEstudantes.add(student)
        println("Estudante cadastrado com sucesso!")
    }

    fun cadastrar(student: Array<Student?>?){
        if(student != null){
            for(i in student){
                listaEstudantes.add(i)
            }
        }
    }

    fun removerEstudante(student: Student?){
        if(listaEstudantes.contains(student)){
            listaEstudantes.remove(student)
            println("Estudante removido com sucesso!")
        }
    }

    fun numEstudantesCadastraddos(){
        println("O numero de estudantes cadastrados no curso é" +
                "${listaEstudantes.size}")
    }

    fun bestGrade(){
        var melhorNota: Double? = listaEstudantes[0]?.nota
        var melhorSoqDouble = melhorNota?.toDouble()
        for(i in listaEstudantes){
            if(i?.nota!! > melhorNota!!){
                melhorNota = i.nota
            }
        }
    }
}