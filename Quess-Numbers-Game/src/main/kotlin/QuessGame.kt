import kotlin.random.Random

fun main() {
    val secretNumber = Random.nextInt(1, 101)
    var attempts = 0

    println("Welcome to the Number Guessing Game!")
    println("I've selected a random number between 1 and 100. Try to guess it.")

    while (true) {
        print("Enter your guess: ")
        val guess = readLine()?.toIntOrNull()

        if (guess != null) {
            attempts++
            when {
                guess < secretNumber -> println("It's higher.")
                guess > secretNumber -> println("It's lower.")
                else -> {
                    println("Congratulations! You've guessed the number $secretNumber in $attempts attempts.")
                    break
                }
            }
        } else {
            println("Invalid input. Please enter a valid number.")
        }
    }
}
