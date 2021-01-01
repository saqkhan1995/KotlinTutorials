package `10Inheritance`

//In Kotlin , the base parent class is called "any" ... Similar to super class in Java..
//which essentially contains the boiler plate coed like toString() method that we override

fun main(args: Array<String>) {
    /*val enemy = Enemy("test enemy", 10, 3)
    println(enemy)
    enemy.takeDamage(4)
    println(enemy)*/

    val uglyTroll = Troll("Ugly Troll")
    println(uglyTroll)  // here it refer's to the parent "Enemy" Class's toString method to print it out
    uglyTroll.takeDamage(30)
    println(uglyTroll)

    val vlad = Vampyre("Vlad")
    vlad.takeDamage(8)
    println(vlad)

    val dracula = VampyreKing("Dracula")
    println(dracula)
    while(dracula.lives>0) {               // While loop
        dracula.takeDamage(16)
    }
}

