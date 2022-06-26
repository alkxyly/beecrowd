import java.util.*

import kotlin.math.abs

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()
    val b = scan.nextInt()
    val c = scan.nextInt()
    val maiorAB = calcularOMaior(a,b)
    println(String.format("%s eh o maior",calcularOMaior(maiorAB,c)))

}

fun calcularOMaior(a: Int, b: Int) = (a + b + abs(a - b)) / 2