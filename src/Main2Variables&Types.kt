
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    //Variables & types
    var tim: String = "Tim Buchulka"
    println(tim)
    //another way is :
    var tim2: String
    tim2 = "Tim2 Buchulka"
    println(tim2)
    // so it's important to declare a variable first & use it later.

    var timsWeeklySalary: Int = 32
    var timesMonthlySalary: Int = timsWeeklySalary * 4
    println(timsWeeklySalary)
    println(timesMonthlySalary)

    println("--------------")

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples + oranges
    println(fruit)

    //var is like a general variable and can be assigned multiple times and is known as the mutable variable in Kotlin.
    //Whereas val is a constant variable and can not be assigned multiple times and can be Initialized only single time
    // and is known as the immutable variable in Kotlin
}

