import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var valor = scan.nextInt()
    val notasPossiveis = listOf<Int>(100,50,20,10,5,2,1)

    println(valor)
    notasPossiveis.forEach {
        val quantidadeNotas = obterQuantidadeNotas(valor, it)
        val restoValor      = calcularQuantidadeNotasRestantes(valor, it)
        println(String.format("%s nota(s) de R$ %s,00", quantidadeNotas, it))
        valor = restoValor
    }
}

fun obterQuantidadeNotas(valor: Int, valorDaNota: Int): Int  = valor / valorDaNota
fun calcularQuantidadeNotasRestantes(valor: Int, valorDaNota: Int): Int = valor % valorDaNota

