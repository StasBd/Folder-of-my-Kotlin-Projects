fun main() {
    val age = getAge()
    val name = getName()

    mainprint(name, age)
}

fun getName() : String? {
  println("Please enter your name: ")
  return readLine()
}

fun getAge(): Int? {
    println("Please enter your age: ")
    return readLine()?.toInt()
}

fun mainprint(name: String?, age: Int?){
    println("Data about user: Name: $name, age: $age")
}