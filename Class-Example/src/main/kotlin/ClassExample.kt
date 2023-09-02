fun main() {
    // so there object with person class
    var person = Person(21, "John")
    person.SayHello()
}
// our class
class Person(var age: Int, var name: String) {
    //build in function which will work with our variable person
    fun SayHello() {
        println("Hello im $name, and i am $age old!")
    }
}