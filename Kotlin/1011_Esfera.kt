import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val raio = scan.nextLine().trim().toDouble()
    print(String.format("VOLUME = %.3f\n", calcularVolume(raio)).replace(",", "."))
}

fun calcularVolume(raio: Double): Double {
    val pi: Double = 3.14159
    return (4 / 3.0) * pi * (raio.pow(3.0))
}