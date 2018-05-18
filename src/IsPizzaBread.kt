@file:Suppress("unused")

fun main(args: Array<String>) {
    val brooklynPizza: Edible = Pizza(
            crust = ThinCrust(),
            sauce = MarinaraSauce(),
            cheese = MozzarellaCheese(),
            toppings = listOf(
                    Pepperoni(),
                    Anchovies()
            )
    )

    println("Is Brooklyn Pizza bread?")
    if (brooklynPizza is Bread) {
        println("Brooklyn Pizza is bread.")
    } else {
        println("Brooklyn Pizza is not bread.")
    }
}

class Pizza(
        val crust: Crust,
        val sauce: Sauce,
        val cheese: Cheese,
        val toppings: List<Edible>
) : Edible

interface Edible
interface Bread : Edible

interface Crust : Bread
class NeapolitanCrust : Crust
class SicilianCrust : Crust
class ThinCrust : Crust

interface Sauce : Edible
class MarinaraSauce : Sauce
class PestoSauce : Sauce
class BechamelSauce : Sauce

interface Cheese : Edible
class MozzarellaCheese : Cheese
class RicottaCheese : Cheese
class ProvaloneCheese : Cheese

class Pepperoni : Edible
class Anchovies : Edible
class Pineapple : Edible
