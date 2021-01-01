package `10Inheritance`

import java.util.*

class VampyreKing(name: String): Vampyre(name) {
    init {                  // Overrides the parent class property when an object gets created i.e. during instantiation
        hitPoints = 140
    }

    override fun takeDamage(damage: Int) {
        super.takeDamage(damage / 2)
    }

    fun runAway(): Boolean {
        /*if(lives < 2) {
            return    true
        }else {
            return false
        }*/  //can also be wirtten as follows
        return lives<2
    }

    fun dodges(): Boolean {
        val rand = Random()
        val chance = rand.nextInt(6)
        if (chance > 3) {
            println("Dracula Dodges !")
            return true
        }
        return false
    }
}