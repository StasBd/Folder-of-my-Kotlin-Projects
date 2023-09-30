fun main() {
   // in this practice we going to build functions in Class!
   // we make variable that equal to Class, this will make us able to use Functions of Class!
   var Bob: Person = Person("Bob", 16)
   
   Bob.SayHello()
   
   Bob.go(" city")
   
   println(Bob.getInfo())
} 
//Making class, and then just add some functions in our code!
class Person(private val Name: String, private val Age: Int) {
// all this function just builded in our class.
    fun SayHello(){
       println("Hello $Name, welcome to your big journey on Kotlin!")
       }
       
       fun go(Place: String){
          println("$Name, is going to $Place")
          }
          
    fun getInfo(): String{
      return "Name: $Name, Age: $Age"
      }
    }