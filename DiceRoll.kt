fun main() {
    
    val FirstDice = Dice()
    val diceRoll = FirstDice.roll()
    println ("Your ${FirstDice.sides} sided dice rolled a ${diceRoll}!")
}

class Dice {
        var sides = 6    
    fun roll(): Int {        
        val randomNumber = (1..6).random()
        return randomNumber
    }
    }
	
	// run: Your 6 sided dice rolled a 6!
	
	//Class is something that we can interact with - in this case a dice
	// we have defined that this die has 6 sides - this is important because we refer to it in our println - we call on the fact that the class has X sides. this would matter if you wanted to have different kinds/sizes of dice.
	//fun roll - matters in that now we've defined a way to interact with the dice - without this - the class would exist but we would be unable to interact with it - we chose to call it "roll" because it's an action verb and naming convention recommends usings a relatable name and verb to start
	// 
