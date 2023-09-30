import bankAccount.*

 fun main() {
   
    val acc1 = Account("8884432102FD", 7000)
    val acc2 = Account("9030231FX", 3000)
    
    transfer(acc1, acc2, 2500)
    acc1.displayInfo()
    acc2.displayInfo()
    
 }