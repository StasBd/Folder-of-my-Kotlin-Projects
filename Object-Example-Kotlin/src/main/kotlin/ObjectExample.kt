fun main() {
    var Object = object {
        var name = "Vadym"
        var age = 15
        fun SayHello() {
            println("Dear $name, thank you, for all your support!")
        }
    }
    Object.SayHello()
}