
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {

    val lives = 3

    //---------------------------------------------------------------------------
    if(lives < 1) {
        println("Game Over !")
    } else {
        println("You are still alive ! The lives are $lives")
    }
    //---------------------------------------------------------------------------
    println("//-------------------------")

    val lives2 = 3
    var isGameOver = (lives2 < 1)

    if(isGameOver) {
        println("Game Over !")
    } else {
        println("You're still alive")
    }
    //---------------------------------------------------------------------------
    println("//-------------------------")

    //To read input from user ->
    println("How old are you: ")
    val age = readLine()!!.toInt()
    println("age is $age")

    val message :String
    if(age<18) {
        message = "You are too young to vote"
    } else if (age==100) {
        message = "Congratulations"
    } else {
        message = "you can vote"
    }
    println(message)
    //---------------------------------------------------------------------------
    println("//-------------------------")
    // Kotlin like way of doing the above :
    val message2 :String
    message2 = if(age<18) {
         "You are too young to vote"
    } else if (age==100) {
         "Congratulations"
    } else {
         "you can vote"
    }
    println(message2)

    //---------------------------------------------------------------------------
    println("//-------------------------")
    // More Kotlin like way of doing the above :
    val message3 :String
    message3 = when {
        age<18 -> "You are too young to vote"
        age==100 -> "Congratulations"
        else -> "you can vote"
    }
    println(message3)

}

