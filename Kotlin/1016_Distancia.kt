import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val a = scan.nextInt()

    println(String.format("%s minutos", calcularDistancia(a)))
}

fun calcularDistancia(a: Int): Int{
    var minutos  = 0;
    if(a % 30 > 0)
        minutos = (a % 30) * 2

    return (a/30) * 60 +  minutos
}