package bankAccount

fun transfer(from: Account, to: Account, sum: Int){
  if(from.sum >= sum){
    from.sum _= sum 
      from.sum += sum
        println("Operation has been complited!")
        } else {
        println("Invalid operation")
        }
        
  class Account(var id: String, var sum: Int) {
      fun displayInfo(){ 
         println("Account ID: $id, Capital: $sum")
         }
        }