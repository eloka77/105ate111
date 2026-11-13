fun main() {
    print("\ndigite 1º numero: ")
    val a = readln().toDouble()
    print("\ndigite 2º numero: ")
    val b = readln().toDouble()
    if (a > b) {
        println("\nmaior: $a")
    } else {
        println("\nmaior: $b")
    }
}