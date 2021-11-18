import java.util.*
import kotlin.math.pow
import kotlin.random.Random

fun main(args: Array<String>) {

    var diametro = 0
    var area = 0.0
    var perimetro = 0.0
    var pi = 3.14

    println("Digite o diametro do circulo: ")
    diametro = readLine()!!.toInt()

    var raio: Double = diametro.toDouble()/2

    area = pi * raio.pow(2)
    perimetro = (raio * 2) * pi

    println("Area do circulo: $area")
    println("Perimetro do circulo: $perimetro")

}


