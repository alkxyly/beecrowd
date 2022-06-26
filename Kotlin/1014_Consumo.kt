import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextDouble()
    val b = scan.nextDouble()

    val resultado = calcularValorMedio(a,b)
    println(String.format("%.3f km/l", resultado))
}

fun calcularValorMedio(a: Double, b: Double) = a/b
