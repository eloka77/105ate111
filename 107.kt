fun main() {
    print("\nDigite o nome 1: ")
    val nome1 = readln()
    print("\nDigite o nome 2: ")
    val nome2 = readln()
    if (nome1 < nome2) {
        println("\nOrdem: $nome1, $nome2")
    } else {
        println("\nOrdem: $nome2, $nome1")
    }
}