fun main() {
// creating fast functions
val add = {x: Int, y: Int -> x+y}
val multiply = {a: Int, b: Int -> a*b}

action(5, 3, add)
action(15, 1, multiply)
}

fun action(n1: Int, n2: Int, operation:(Int, Int) -> Int) {
    var result = operation(n1, n2)
    println(result)
    }