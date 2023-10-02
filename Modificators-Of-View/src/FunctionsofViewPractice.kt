import data.*
 fun main() {
     // creating logic of coffee machine!
     println("Hello, please select type of Coffee: Cappuccino, Americano, Latte")
     var Ask = readLine()
     // making all as it needed
     if (!(Ask == "Cappucino" && Ask == "Americano" && Ask == "Latte")) {
         println("Okay! ")
     }
         // when people write something incorrect this block will say about it
         else {
             println("Sorry, but you didn't select the type of Coffee!")
         }
     // this block works for selecting cups!
             println("Please select cup: Small, Medium, Big ")
             var SelectCup = readLine()
     if (SelectCup == "Small" || SelectCup == "Medium" || SelectCup == "Big") {
         // now we can use last block operation that will work with our coffee
         // and yeah we used packages in this block, i just made function of printing text
         // and then imported this to this file!
         println("Okay, please wait for your Coffee!")
             val processStart = MakingCoffee()
         } else {
             println("Sorry, but you didn't select the type of Cup!")
         }
     }

