
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val x1 = scan.nextDouble()
    val y1 = scan.nextDouble()
    val x2 = scan.nextDouble()
    val y2 = scan.nextDouble()

    println(String.format("%.4f", calcularDistancia(x1, y1, x2, y2)))
}

fun calcularDistancia(x1: Double, y1: Double, x2: Double, y2: Double) = Math.sqrt((Math.pow((x2 - x1),(2.0)) + Math.pow ((y2 - y1),(2.0))))