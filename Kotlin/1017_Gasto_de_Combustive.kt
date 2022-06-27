import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val tempoGasto= scan.nextInt()
    val velocidadeMedia = scan.nextInt()

    println(String.format("%.3f", obterQuantidadeLitros(tempoGasto, velocidadeMedia)))

}

fun obterQuantidadeLitros(tempoGasto: Int, velocidadeMedia: Int): Double = velocidadeMedia/12.0 * tempoGasto