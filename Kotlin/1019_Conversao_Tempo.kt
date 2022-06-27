import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var segundos = scan.nextInt()

    val horas   = obterQuantidadeSegundos(segundos, 3600)
    val minutos = obterQuantidadeSegundos(obterORestanteDeSegundos(segundos, 3600), 60)
    val s       = obterQuantidadeSegundos(obterORestanteDeSegundos(segundos, 60), 1)

    println(String.format("%s:%s:%s", horas, minutos, s))
}

fun obterQuantidadeSegundos(valor: Int, segundos: Int): Int  = valor / segundos
fun obterORestanteDeSegundos(valor: Int, segundos: Int): Int = valor % segundos

