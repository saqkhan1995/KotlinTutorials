
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    var player3: Player3 = Player3("Player3")
    player3.show()
    println(player3.weapon.name)
    println(player3.weapon.name.toUpperCase())
    println(player3.weapon.damageInflicted)

    var gr8 = Player3("gr8", 4, 8)

    val axe: Weapon = Weapon("Axe", 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)

    player3.show2()
    player3.weapon = Weapon("Sword", 75)
    player3.show2()

}

