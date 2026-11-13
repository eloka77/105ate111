fun main() {
    print("\nDigite o nome: ")
    val nome = readln()
    if (nome.equals("JOSÉ", ignoreCase = true)) {
        println("\nNome igual a JOSE")
    } else {
        println("\nNome diferente de JOSE")
    }
}