
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    for (i in 0..10) {
//        println(i)    prints 0 to 10
        println("$i squared is ${i*i}")
    }

    println("- - - - - - - - - - - - - - - - - - - - - -")

    //Another way of doing this is :
    for (i in 0 until 10) {
//        println(i)    prints 0 to 9 instead of 0 to 10
        println("$i squared is ${i*i}")
    }

    println("- - - - - - - - - - - - - - - - - - - - - -")

    for (i in 10 downTo 0) {
        println(i)    //prints from 10 to 0
    }

    println("- - - - - - - - - - - - - - - - - - - - - -")

    for (i in 10 downTo 0 step 2) {
        println(i)    //prints from 10 to 0
    }

}

