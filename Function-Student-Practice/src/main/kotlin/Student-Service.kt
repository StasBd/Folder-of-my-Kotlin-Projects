fun StudentService(group: String, users: Array<String>, count: Int) {
    // this function will operate our students
    println("Count: $count")
    println("Group: $group")
    for(user in users)
        print(user)
}

fun main() {
    var users = arrayOf("Bob ", "John ", "Elli ")
    StudentService("KF-14ASF-1523", users, 3)
}