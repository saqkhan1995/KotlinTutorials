package `10Inheritance`

// Unlike Java, wouldn't need to create a class to hold a common code
//has to start execution with a function called "main()".. similar to main method in Java

fun main(args: Array<String>) {
    /*val conan = Player("Conan")
    conan.getLoot(Loot("Invisibility", LootType.POTION, 4.0))
    conan.getLoot(Loot("Mithril", LootType.ARMOR, 183.0))
    conan.getLoot(Loot("Ring of Speed", LootType.RING, 25.0))
    conan.getLoot(Loot("Red Potion", LootType.POTION, 2.0))
    *//*conan.getLoot(Loot("Cursed shield", LootType.ARMOR, -8.0))*//*
    conan.getLoot(Loot("Brass Ring", LootType.RING, 1.0))
    conan.getLoot(Loot("Chain Mail", LootType.ARMOR, 4.0))
    conan.getLoot(Loot("Gold Ring", LootType.RING, 12.0))
    conan.getLoot(Loot("Health Potion", LootType.POTION, 3.0))
    conan.getLoot(Loot("Silver Ring", LootType.RING, 6.0))

    conan.showInventory()*/

    for(i in 1 .. 10) {
        val dracula = VampyreKing("Dracula")
        println(dracula)
        while(dracula.lives>0) {       // While loop
            if(dracula.dodges()){
                continue
            }
            if (dracula.runAway()) {
                println("Dracula ran away")
                break
            } else {
                dracula.takeDamage(80)
            }
        }
        println("- -_------------------------------")
    }
}

