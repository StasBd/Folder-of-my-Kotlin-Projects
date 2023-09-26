fun main(){
// anonimous function using in some functions like we have main function and we just add secondar function in it
   operation(6, 3, fun(x: Int, y: Int): Int {return x+y})
   // now with multiply 
  operation(4, 6, fun(a: Int, b: Int): Int { return a*b})
  // and we can operate with text:) but first of all we need to add function which will add text 
  TextOperation("Hello", " Kotlin", fun(Text0: String, Text1: String): String { return Text0+Text1})
}

fun operation(x: Int, y: Int, op: (Int, Int) -> Int){

var result = op(x, y)
  println(result)
  
 }
// so there is our function! 
fun TextOperation(Text0: String, Text1: String, add: (String, String) -> String){

var finalText = add(Text0, Text1)
println(finalText)
}