import kotlin.math.sqrt

fun main() {
    print("\nDigite A: ")
    val a = readln().toDouble()
    print("\nDigite B: ")
    val b = readln().toDouble()
    print("\nDigite C: ")
    val c = readln().toDouble()

    if (a == 0.0) {
        println("\nNao e equacao do 2o grau")
    } else {
        val delta = (b * b) - (4 * a * c)
        if (delta < 0) {
            println("\nNao existem raizes reais")
        } else {
            val x1 = (-b + sqrt(delta)) / (2 * a)
            val x2 = (-b - sqrt(delta)) / (2 * a)
            println("\nX1 = $x1\nX2 = $x2")
        }
    }
}