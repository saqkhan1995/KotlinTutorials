package `8EncapsulationAndPrivateProperties`

fun main(args: Array<String>) {
    var tim: Player = Player("Tim")
    tim.show()

    var louise = Player("gr8", 4, 8)

    val axe: Weapon = Weapon("Axe", 12)
    louise.weapon = axe
    println(louise.weapon.name+" is same as "+ axe.name)

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(louise.weapon.damageInflicted)

    val redPotion = Loot("Red Potion", LootType.POTION, 7.50)
    /*tim.inventory.add(redPotion)  // calling add method to add to list*/
    tim.getLoot(redPotion)  // Encpsulated
    val chestArmor = Loot("+3 Chest Armor", LootType.ARMOR, 80.00)
    /*tim.inventory.add(chestArmor)*/
    tim.getLoot(chestArmor)  // Encpsulated
    tim.showInventory()

    /*tim.inventory.add(Loot("Ring of pretection +2", LootType.RING, 40.25))*/
    tim.getLoot(Loot("Ring of pretection +2", LootType.RING, 40.25))  // Encpsulated
    /*tim.inventory.add(Loot("Invisibility Potion", LootType.POTION, 35.95))*/
    tim.getLoot(Loot("Invisibility Potion", LootType.POTION, 35.95))  // Encpsulated
    tim.showInventory()
    println(tim.toString()+" is same as "+tim) // // override toString in the object's class to print out the object correctly

    println("--------------------------------------------------")
    if(tim.dropLoot(redPotion)) {
        tim.showInventory()
    } else {
        println("you don't have a ${redPotion.name}")
    }

    val bluePotion = Loot("Blue Potion", LootType.POTION, 6.00)
    if(tim.dropLoot(bluePotion)) {
        tim.showInventory()
    } else {
        println("you don't have a ${bluePotion.name}")
    }

}