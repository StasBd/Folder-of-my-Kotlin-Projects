fun main() {
    println("Hello, please enter two numbers you want to add: ")
    val input1 = readLine()
    val input2 = readLine()

    try {
        val num1 = input1?.toDouble() ?: 0.0
        val num2 = input2?.toDouble() ?: 0.0

        val sum = num1 + num2
        println("The sum of $num1 and $num2 is $sum")
    } catch (e: NumberFormatException) {
        println("Please enter valid numbers!")
    }
}
