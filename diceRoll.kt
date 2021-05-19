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

// Scott's notes
// run: Your 6 sided dice rolled a 6!

/*
- Class is something that we can interact with - in this case a dice 
- we have defined that this die has 6 sides
  - this is important because we refer to it in our println
  - we call on the fact that the class has X sides. 
  this would matter if you wanted to have different kinds/sizes of dice.

Bill: You are almost correct here. The class is like a blueprint for an object.
So you can't interact with the class directly, but what's called an instance of it, or object.
This is why you have to first create an instance using the constructor function Dice()

- fun roll
  - matters in that now we've defined a way to interact with the dice
  - without this - the class would exist but we would be unable to interact with it
  - we chose to call it "roll" because it's an action verb and naming convention
    recommends usings a relatable name and verb to start

Bill: the function `roll` isn't the only way to interact with the object, 
  sides is another way to interact with the object. But it's not very interesting.
The action verb convention is good, it fits the paradigm of creating objects
from classes and having them perform verbs to achieve your computation
 */

// Bill's notes
/*
This character, ❯ , is my shell prompt, don't paste it into anything

I looked up how to run on the command line here:
https://kotlinlang.org/docs/command-line.html#create-and-run-an-application

❯ kotlinc diceRoll.kt -include-runtime -d diceRoll.jar

❯ java -jar diceRoll.jar
Your 6 sided dice rolled a 5!

Ooooh! it has a REPL! (Read Evaluate Print Loop)
https://kotlinlang.org/docs/command-line.html#run-the-repl

[nix-shell:~/workspace/kotlin]$ kotlinc-jvm
OpenJDK 64-Bit Server VM warning: Options -Xverify:none and -noverify were deprecated in JDK 13 and will likely be removed in a future release.
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by com.intellij.util.ReflectionUtil to method java.util.ResourceBundle.setParent(java.util.ResourceBundle)
WARNING: Please consider reporting this to the maintainers of com.intellij.util.ReflectionUtil
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Welcome to Kotlin version 1.4.21 (JRE 14.0.1+8)
Type :help for help, :quit for quit
>>> class Dice {
...   var sides = 7
...   fun roll(): Int {
...     val randomNumber = (1..6).random()
...     return randomNumber
...   }
... }
>>> Dice.sides
error: unresolved reference: sides
Dice.sides
     ^

>>> val DiceMan = Dice()
>>> DiceMan.sides
res9: kotlin.Int = 7
>>> DiceMan.roll()
res10: kotlin.Int = 1
>>> DiceMan.roll()
res11: kotlin.Int = 2
>>> DiceMan.roll()
res12: kotlin.Int = 3
>>> DiceMan.roll()
res13: kotlin.Int = 2
>>> :q
Unknown command
Type :help for help
>>> :exit
Unknown command
Type :help for help
>>> :help
Available commands:
:help                   show this help
:quit                   exit the interpreter
:dump bytecode          dump classes to terminal
:load <file>            load script from specified file
>>> :quit

The above is output from my shell.
I loaded kotlinc-jvm, the kotlin compiler with the java virtual machine backend.
I'm ignoring the Warnings, because they aren't impacting me yet
The Kotlin version appears to be 1.4.21 (JRE 14.0.1+8).
  This is helpful when debugging compilation issues online and asking questions.
I wrote out your program again to understand it.
As you can see, I called Dice.sides directly, and it fails because Dice isn't an object
I created a DiceMan object using the Dice constructor, and called sides, and roll several times.
Fun little program in the command line.
I also couldn't figure out how to exit, so used the help. Always RTFM (Read the Fucking Manual)

* Notice the mistake in my code? Is it a mistake? Unintended behaviour?
* If I wanted to print out 100 dice rolls, how would you change your main to implement that?


My quick look at the Kotlin ecosystem:
- I use VSCode, so I looked for extenions using the sidebar.
- I found these two:
  https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin
  https://marketplace.visualstudio.com/items?itemName=esafirm.kotlin-formatter
- However, the Kotlin formatter doesn't seem to work for me. No idea why
- Through the formatter I also found klint, a linter for Kotlin code.
- https://ktlint.github.io/
  A linter is like spell check for your code.
  I couldn't get it working in my dev setup, but I'm doing weird tricks to 
  not install Kotlin permanently. You shouldn't be doing this so it should work better for you.
 */
