import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextDouble()
    val b = scan.nextDouble()
    val c = scan.nextDouble()

    println(String.format("TRIANGULO: %.3f", calcularAreaTrianguloRetangular(a,c)))
    println(String.format("CIRCULO: %.3f", calcularAreaCirculo(c)))
    println(String.format("TRAPEZIO: %.3f", calcularAreaTrapezio(a,b,c)))
    println(String.format("QUADRADO: %.3f", calcularAreaQuadrado(b)))
    println(String.format("RETANGULO: %.3f", calcularAreaRetangulo(a,b)))
}

fun calcularAreaTrianguloRetangular(a: Double, c: Double) = a * c / 2.0
fun calcularAreaCirculo(c: Double) = 3.14159 * (c * c)
fun calcularAreaTrapezio(a: Double, b: Double, c: Double) = ((a + b) * c) / 2
fun calcularAreaQuadrado(b: Double) = b * b
fun calcularAreaRetangulo(a: Double, b: Double) = a * b
