fun PrintSome(name: String, vararg age: Int) {
    println("$name: ")
    age.forEach{el -> print("$el,")}
    println("")
}

fun main() {
    PrintSome("John", 16)
}