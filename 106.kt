fun main() {
    print("\nDigite o nome: ")
    val nome = readln()
    if (nome.uppercase().startsWith("A")) {
        println("\nNome comeca com A")
    } else {
        println("\nNome nao comeca com A")
    }
}