fun main() {
    print("\nDigite a sigla do estado: ")
    val sigla = readln().uppercase()
    when (sigla) {
        "AM" -> println("\nAmazonense")
        "RJ" -> println("\nCarioca")
        "SP" -> println("\nPaulista")
        "MG" -> println("\nMineiro")
        else -> println("\nOutros estados")
    }
}