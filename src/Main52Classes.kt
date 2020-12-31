
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    val tim = Player("Tim")
    /*println(tim.name)
    println(tim.lives)
    println(tim.level)
    println(tim.score)*/
    tim.show()

    println("- - - - - - - - - - - - - ")

    val louise = Player("Louise")
    louise.level = 6
    louise.show()

    println("- - - - - - - - - - - - - ")

    val louise2 = Player2("Louise2", 5)
    louise2.show()

}

