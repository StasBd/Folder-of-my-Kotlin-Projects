fun main() {
    val coffeeMachineLogicIn = CoffeeMachineLogic(true, "Cappuccino, with Kenya Beans.")
    coffeeMachineLogicIn.CoffeeMachine()
}

class CoffeeMachineLogic(private val beansInCoffeeMachine: Boolean, private val typeOfCoffee: String) {

    fun CoffeeMachine() {
        if (beansInCoffeeMachine) {
            println("You have beans in the machine to work.")
        } else {
            println("Your machine doesn't have beans to work!")
        }
    }
}

   