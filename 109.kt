fun main() {
    print("\nDigite o valor de A: ")
    val a = readln().toDouble()
    print("\nDigite o valor de B: ")
    val b = readln().toDouble()
    if (a < b) {
        println("\nOrdem crescente: $a, $b")
    } else {
        println("\nOrdem crescente: $b, $a")
    }
}