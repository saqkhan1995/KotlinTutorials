package `10Inheritance`

//Mark class as "open" so that  it can be extended for inheritance
open class Enemy(val name: String, var hitPoints: Int, var lives: Int) {

    open fun takeDamage(damage: Int){    // Mark as open so they can e overridden in child classes
        val remainingHitPoints = hitPoints - damage
        if(remainingHitPoints>0){
            hitPoints = remainingHitPoints
            println("$name took $damage points of damage, and has $hitPoints left")
        } else {
            lives -= 1
            if(lives > 0) {
                println("$name lost a life")
            } else {
                println("No lives left, $name is dead")
            }
        }
    }

    override fun toString(): String {
        return "Enemy(name='$name', hitPoints=$hitPoints, lives=$lives)"
    }


}