
// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    var tim: Player4 = Player4("Tim")
    tim.show()

    var louise = Player4("gr8", 4, 8)

    val axe: Weapon = Weapon("Axe", 12)
    louise.weapon = axe
    println(louise.weapon.name+" is same as "+ axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(louise.weapon.damageInflicted)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    tim.inventory.add(redPotion)  // calling add method to add to list
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    tim.inventory.add(chestArmor)
    tim.showInventory()

    tim.inventory.add(Loot("Ring of pretection +2", LootType.RING, 40.25))
    tim.inventory.add(Loot("Invisibility Potion", LootType.POTION, 35.95))
    tim.showInventory()
    println(tim.toString()+" is same as "+tim) // // override toString in the object's class to print out the object correctly


}

