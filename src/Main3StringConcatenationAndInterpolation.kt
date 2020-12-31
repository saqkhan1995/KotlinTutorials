
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var tim: String
    tim = "Tim Buchalka"
    println("My name is " + tim)  // ==> String Concatenation
    println("My name is $tim")    // ==> String interpolation

    val weeks: Int = 234
    val years: Double = weeks / 52.0
    println("$weeks weeks in years is : " + years)

    println("--------------")

    val apples: Int = 6
    val oranges: Int = 5
    var fruit: Int = apples + oranges
    println("A quarter if the apples is ${apples/4}") // Interpolation expression inside curly braces

    println("To print Dollar sign use forwardslash \$tim")


}

