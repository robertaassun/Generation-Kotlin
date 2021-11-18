import seres.Animais
import seres.Pessoas

fun main(args: Array<String>) {

    val leao = Animais()

    leao.nome = "Leão"
    leao.especie = "Branco"
    leao.carnivoro = true

    val roberta = Pessoas()

    roberta.nome = "Roberta"
    roberta.idade = 24
    roberta.altura = 1.64
}