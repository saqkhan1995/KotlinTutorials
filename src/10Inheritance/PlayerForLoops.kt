package `10Inheritance`

import java.util.ArrayList


enum class LootType {
    POTION, RING, ARMOR
}
class Loot(val name: String, val type: LootType, val value: Double) {
    override fun toString(): String {
        return "Loot(name='$name', type=$type, value=$value)"
    }
}

class Player(val name:String, var level: Int = 1, var lives: Int = 3, var score: Int =0) {
    var weapon: Weapon = Weapon("Fist", 1)
    private val inventory = ArrayList<Loot>()

    fun show() {
        if(lives > 0) {
            println("$name is alive !")
        } else {
            println("$name is dead !")
        }
    }

    //to print object that usually looks for toString implementation, here overridden toString method
    override fun toString(): String {
        return """
            name : $name
            lives : $lives
            level : $level
            score : $score
            weaponName: ${weapon.name}
            weapon Damage: ${weapon.damageInflicted}
                """
    }

    fun showInventory() {
        var total =0.0
        println("$name's Inventory")
        for(item in inventory) {  // for-each loop
            println(item)
            total += item.value
        }
//        println(inventory.get(0))
        println("------------------------------------------")
        println("Total Score is :$total")
        println("------------------------------------------")
    }

    fun getLoot(item: Loot) {
        inventory.add(item)
        //code to save inventory goes here
    }

    fun dropLoot(item: Loot): Boolean {
        return if(inventory.contains(item)) {
                    inventory.remove(item)
                    true
                } else {
                    false
                }
    }

    fun dropLoot(name: String): Boolean {
        println("$name will be dropped")
        return inventory.removeIf { it.name == name } // it refers to item currently being checked.. similar to "this" in java?
    }
}